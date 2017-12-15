package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ZtmdmUser;
import com.company.project.service.ZtmdmUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2017/11/30.
*/
@RestController
@RequestMapping("/ztmdm/user")
public class ZtmdmUserController {
    @Resource
    private ZtmdmUserService ztmdmUserService;

    @PostMapping("/add")
    public Result add(ZtmdmUser ztmdmUser) {
        ztmdmUserService.save(ztmdmUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        ztmdmUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ZtmdmUser ztmdmUser) {
        ztmdmUserService.update(ztmdmUser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ZtmdmUser ztmdmUser = ztmdmUserService.findById(id);
        return ResultGenerator.genSuccessResult(ztmdmUser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ZtmdmUser> list = ztmdmUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
