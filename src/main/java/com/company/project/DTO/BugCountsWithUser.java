package com.company.project.DTO;

import com.alibaba.fastjson.annotation.JSONField;
import com.company.project.model.ZtmdmBug;
import com.company.project.model.ZtmdmUser;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BugCountsWithUser {



    @JSONField(format="yyyy-MM-dd")
    private Date date;
    private Integer count;

    private String realname;

    public Integer getNearnumDay() {
        return nearnumDay;
    }

    public void setNearnumDay(Integer nearnumDay) {
        this.nearnumDay = nearnumDay;
    }

    private Integer nearnumDay;






    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }




}
