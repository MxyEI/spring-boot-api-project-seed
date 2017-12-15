package com.company.project.service.impl;

import com.company.project.dao.ZtmdmUserMapper;
import com.company.project.model.ZtmdmUser;
import com.company.project.service.ZtmdmUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/30.
 */
@Service
@Transactional
public class ZtmdmUserServiceImpl extends AbstractService<ZtmdmUser> implements ZtmdmUserService {
    @Resource
    private ZtmdmUserMapper ztmdmUserMapper;

}
