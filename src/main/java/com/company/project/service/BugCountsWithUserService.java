package com.company.project.service;

import com.company.project.dao.BugCountsWithUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BugCountsWithUserService {

    @Autowired
    private BugCountsWithUserMapper bugCountsWithUserMapper;

    public List findBugsWithUser(Integer nearnumDay){
        return bugCountsWithUserMapper.getBugsWithUser(nearnumDay);
    }
    public List findResolvedDateNearHowmuchDay(String realname,Integer nearnumDay){
        return bugCountsWithUserMapper.findResolvedDateNearHowmuchDay(realname,nearnumDay);
    }


}
