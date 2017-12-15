package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ZtmdmBug;
import com.company.project.service.ZtmdmBugService;
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
@RequestMapping("/ztmdm/bug")
public class ZtmdmBugController {
    @Resource
    private ZtmdmBugService ztmdmBugService;

    @PostMapping("/add")
    public Result add(ZtmdmBug ztmdmBug) {
        ztmdmBugService.save(ztmdmBug);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        ztmdmBugService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ZtmdmBug ztmdmBug) {
        ztmdmBugService.update(ztmdmBug);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ZtmdmBug ztmdmBug = ztmdmBugService.findById(id);
        return ResultGenerator.genSuccessResult(ztmdmBug);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ZtmdmBug> list = ztmdmBugService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
