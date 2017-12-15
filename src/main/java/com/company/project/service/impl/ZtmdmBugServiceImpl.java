package com.company.project.service.impl;

import com.company.project.dao.ZtmdmBugMapper;
import com.company.project.model.ZtmdmBug;
import com.company.project.service.ZtmdmBugService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/30.
 */
@Service
@Transactional
public class ZtmdmBugServiceImpl extends AbstractService<ZtmdmBug> implements ZtmdmBugService {
    @Resource
    private ZtmdmBugMapper ztmdmBugMapper;

}
