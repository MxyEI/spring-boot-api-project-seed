package com.company.project.web;

import com.company.project.DTO.BugCountsWithUser;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ZtmdmBug;
import com.company.project.service.BugCountsWithUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ztmdm/getBugs")

public class BugCountsWithUserController {

    @Autowired
    private BugCountsWithUserService bugCountsWithUserService;

    @PostMapping("/list")
    public Result list( @RequestParam(defaultValue = "30") Integer nearnumDay,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "50") Integer size) {
        PageHelper.startPage(page, size);
        List<BugCountsWithUser> list = bugCountsWithUserService.findBugsWithUser(nearnumDay);
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }

    //某人最近？天解决bug数，默认一个月
    @PostMapping("/buglist/{realname}")
    public Result buglist(@PathVariable("realname") @Param("realname") String realname, @RequestParam(defaultValue = "30") Integer nearnumDay) {
        //PageHelper.startPage(page, size);
        List<BugCountsWithUser> list = bugCountsWithUserService.findResolvedDateNearHowmuchDay(realname,nearnumDay);
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(list);
    }

}
