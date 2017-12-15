package com.company.project.dao;

import java.util.List;

public interface BugCountsWithUserMapper {

    public List getBugsWithUser(Integer nearnumDay);
    public List findResolvedDateNearHowmuchDay(String realname,Integer nearnumDay);

}
