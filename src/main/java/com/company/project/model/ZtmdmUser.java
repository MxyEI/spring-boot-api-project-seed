package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ztmdm_user")
public class ZtmdmUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer company;

    private Integer dept;

    private String account;

    private String password;

    private String role;

    private String realname;

    private String nickname;

    private String commiter;

    private String avatar;

    private Date birthday;

    private String gender;

    private String email;

    private String skype;

    private String qq;

    private String yahoo;

    private String gtalk;

    private String wangwang;

    private String mobile;

    private String phone;

    private String address;

    private String zipcode;

    @Column(name = "`join`")
    private Date join;

    private Integer visits;

    private String ip;

    private Integer last;

    private Byte fails;

    private Date locked;

    private String deleted;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return company
     */
    public Integer getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(Integer company) {
        this.company = company;
    }

    /**
     * @return dept
     */
    public Integer getDept() {
        return dept;
    }

    /**
     * @param dept
     */
    public void setDept(Integer dept) {
        this.dept = dept;
    }

    /**
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return realname
     */
    public String getRealname() {
        return realname;
    }

    /**
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @param nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return commiter
     */
    public String getCommiter() {
        return commiter;
    }

    /**
     * @param commiter
     */
    public void setCommiter(String commiter) {
        this.commiter = commiter;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return skype
     */
    public String getSkype() {
        return skype;
    }

    /**
     * @param skype
     */
    public void setSkype(String skype) {
        this.skype = skype;
    }

    /**
     * @return qq
     */
    public String getQq() {
        return qq;
    }

    /**
     * @param qq
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * @return yahoo
     */
    public String getYahoo() {
        return yahoo;
    }

    /**
     * @param yahoo
     */
    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    /**
     * @return gtalk
     */
    public String getGtalk() {
        return gtalk;
    }

    /**
     * @param gtalk
     */
    public void setGtalk(String gtalk) {
        this.gtalk = gtalk;
    }

    /**
     * @return wangwang
     */
    public String getWangwang() {
        return wangwang;
    }

    /**
     * @param wangwang
     */
    public void setWangwang(String wangwang) {
        this.wangwang = wangwang;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     * @return join
     */
    public Date getJoin() {
        return join;
    }

    /**
     * @param join
     */
    public void setJoin(Date join) {
        this.join = join;
    }

    /**
     * @return visits
     */
    public Integer getVisits() {
        return visits;
    }

    /**
     * @param visits
     */
    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return last
     */
    public Integer getLast() {
        return last;
    }

    /**
     * @param last
     */
    public void setLast(Integer last) {
        this.last = last;
    }

    /**
     * @return fails
     */
    public Byte getFails() {
        return fails;
    }

    /**
     * @param fails
     */
    public void setFails(Byte fails) {
        this.fails = fails;
    }

    /**
     * @return locked
     */
    public Date getLocked() {
        return locked;
    }

    /**
     * @param locked
     */
    public void setLocked(Date locked) {
        this.locked = locked;
    }

    /**
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * @param deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}