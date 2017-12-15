package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ztmdm_bug")
public class ZtmdmBug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer company;

    private Integer product;

    private Integer module;

    private Integer project;

    private Integer story;

    @Column(name = "storyVersion")
    private Short storyversion;

    private Integer task;

    @Column(name = "toTask")
    private Integer totask;

    @Column(name = "toStory")
    private Integer tostory;

    private String title;

    private String keywords;

    private Byte severity;

    private Byte pri;

    private String type;

    private String os;

    private String browser;

    private String hardware;

    private String found;

    private String status;

    private Boolean confirmed;

    @Column(name = "activatedCount")
    private Short activatedcount;

    private String mailto;

    @Column(name = "openedBy")
    private String openedby;

    @Column(name = "openedDate")
    private Date openeddate;

    @Column(name = "openedBuild")
    private String openedbuild;

    @Column(name = "assignedTo")
    private String assignedto;

    @Column(name = "assignedDate")
    private Date assigneddate;

    @Column(name = "resolvedBy")
    private String resolvedby;

    private String resolution;

    @Column(name = "resolvedBuild")
    private String resolvedbuild;

    @Column(name = "resolvedDate")
    private Date resolveddate;

    @Column(name = "closedBy")
    private String closedby;

    @Column(name = "closedDate")
    private Date closeddate;

    @Column(name = "duplicateBug")
    private Integer duplicatebug;

    @Column(name = "linkBug")
    private String linkbug;

    //解决字段名为关键字的问题
    @Column(name = "`case`")
    private Integer Case;

    @Column(name = "caseVersion")
    private Short caseversion;

    private Integer result;

    @Column(name = "lastEditedBy")
    private String lasteditedby;

    @Column(name = "lastEditedDate")
    private Date lastediteddate;

    private String deleted;

    private String yes;

    private String steps;

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
     * @return product
     */
    public Integer getProduct() {
        return product;
    }

    /**
     * @param product
     */
    public void setProduct(Integer product) {
        this.product = product;
    }

    /**
     * @return module
     */
    public Integer getModule() {
        return module;
    }

    /**
     * @param module
     */
    public void setModule(Integer module) {
        this.module = module;
    }

    /**
     * @return project
     */
    public Integer getProject() {
        return project;
    }

    /**
     * @param project
     */
    public void setProject(Integer project) {
        this.project = project;
    }

    /**
     * @return story
     */
    public Integer getStory() {
        return story;
    }

    /**
     * @param story
     */
    public void setStory(Integer story) {
        this.story = story;
    }

    /**
     * @return storyVersion
     */
    public Short getStoryversion() {
        return storyversion;
    }

    /**
     * @param storyversion
     */
    public void setStoryversion(Short storyversion) {
        this.storyversion = storyversion;
    }

    /**
     * @return task
     */
    public Integer getTask() {
        return task;
    }

    /**
     * @param task
     */
    public void setTask(Integer task) {
        this.task = task;
    }

    /**
     * @return toTask
     */
    public Integer getTotask() {
        return totask;
    }

    /**
     * @param totask
     */
    public void setTotask(Integer totask) {
        this.totask = totask;
    }

    /**
     * @return toStory
     */
    public Integer getTostory() {
        return tostory;
    }

    /**
     * @param tostory
     */
    public void setTostory(Integer tostory) {
        this.tostory = tostory;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * @return severity
     */
    public Byte getSeverity() {
        return severity;
    }

    /**
     * @param severity
     */
    public void setSeverity(Byte severity) {
        this.severity = severity;
    }

    /**
     * @return pri
     */
    public Byte getPri() {
        return pri;
    }

    /**
     * @param pri
     */
    public void setPri(Byte pri) {
        this.pri = pri;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return browser
     */
    public String getBrowser() {
        return browser;
    }

    /**
     * @param browser
     */
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    /**
     * @return hardware
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * @param hardware
     */
    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    /**
     * @return found
     */
    public String getFound() {
        return found;
    }

    /**
     * @param found
     */
    public void setFound(String found) {
        this.found = found;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return confirmed
     */
    public Boolean getConfirmed() {
        return confirmed;
    }

    /**
     * @param confirmed
     */
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * @return activatedCount
     */
    public Short getActivatedcount() {
        return activatedcount;
    }

    /**
     * @param activatedcount
     */
    public void setActivatedcount(Short activatedcount) {
        this.activatedcount = activatedcount;
    }

    /**
     * @return mailto
     */
    public String getMailto() {
        return mailto;
    }

    /**
     * @param mailto
     */
    public void setMailto(String mailto) {
        this.mailto = mailto;
    }

    /**
     * @return openedBy
     */
    public String getOpenedby() {
        return openedby;
    }

    /**
     * @param openedby
     */
    public void setOpenedby(String openedby) {
        this.openedby = openedby;
    }

    /**
     * @return openedDate
     */
    public Date getOpeneddate() {
        return openeddate;
    }

    /**
     * @param openeddate
     */
    public void setOpeneddate(Date openeddate) {
        this.openeddate = openeddate;
    }

    /**
     * @return openedBuild
     */
    public String getOpenedbuild() {
        return openedbuild;
    }

    /**
     * @param openedbuild
     */
    public void setOpenedbuild(String openedbuild) {
        this.openedbuild = openedbuild;
    }

    /**
     * @return assignedTo
     */
    public String getAssignedto() {
        return assignedto;
    }

    /**
     * @param assignedto
     */
    public void setAssignedto(String assignedto) {
        this.assignedto = assignedto;
    }

    /**
     * @return assignedDate
     */
    public Date getAssigneddate() {
        return assigneddate;
    }

    /**
     * @param assigneddate
     */
    public void setAssigneddate(Date assigneddate) {
        this.assigneddate = assigneddate;
    }

    /**
     * @return resolvedBy
     */
    public String getResolvedby() {
        return resolvedby;
    }

    /**
     * @param resolvedby
     */
    public void setResolvedby(String resolvedby) {
        this.resolvedby = resolvedby;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * @param resolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * @return resolvedBuild
     */
    public String getResolvedbuild() {
        return resolvedbuild;
    }

    /**
     * @param resolvedbuild
     */
    public void setResolvedbuild(String resolvedbuild) {
        this.resolvedbuild = resolvedbuild;
    }

    /**
     * @return resolvedDate
     */
    public Date getResolveddate() {
        return resolveddate;
    }

    /**
     * @param resolveddate
     */
    public void setResolveddate(Date resolveddate) {
        this.resolveddate = resolveddate;
    }

    /**
     * @return closedBy
     */
    public String getClosedby() {
        return closedby;
    }

    /**
     * @param closedby
     */
    public void setClosedby(String closedby) {
        this.closedby = closedby;
    }

    /**
     * @return closedDate
     */
    public Date getCloseddate() {
        return closeddate;
    }

    /**
     * @param closeddate
     */
    public void setCloseddate(Date closeddate) {
        this.closeddate = closeddate;
    }

    /**
     * @return duplicateBug
     */
    public Integer getDuplicatebug() {
        return duplicatebug;
    }

    /**
     * @param duplicatebug
     */
    public void setDuplicatebug(Integer duplicatebug) {
        this.duplicatebug = duplicatebug;
    }

    /**
     * @return linkBug
     */
    public String getLinkbug() {
        return linkbug;
    }

    /**
     * @param linkbug
     */
    public void setLinkbug(String linkbug) {
        this.linkbug = linkbug;
    }

    /**
     * @return Case
     */
    public Integer getCase() {
        return Case;
    }

    /**
     * @param Case
     */
    public void setCase(Integer Case) {
        this.Case = Case;
    }

    /**
     * @return caseVersion
     */
    public Short getCaseversion() {
        return caseversion;
    }

    /**
     * @param caseversion
     */
    public void setCaseversion(Short caseversion) {
        this.caseversion = caseversion;
    }

    /**
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    /**
     * @param result
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * @return lastEditedBy
     */
    public String getLasteditedby() {
        return lasteditedby;
    }

    /**
     * @param lasteditedby
     */
    public void setLasteditedby(String lasteditedby) {
        this.lasteditedby = lasteditedby;
    }

    /**
     * @return lastEditedDate
     */
    public Date getLastediteddate() {
        return lastediteddate;
    }

    /**
     * @param lastediteddate
     */
    public void setLastediteddate(Date lastediteddate) {
        this.lastediteddate = lastediteddate;
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

    /**
     * @return yes
     */
    public String getYes() {
        return yes;
    }

    /**
     * @param yes
     */
    public void setYes(String yes) {
        this.yes = yes;
    }

    /**
     * @return steps
     */
    public String getSteps() {
        return steps;
    }

    /**
     * @param steps
     */
    public void setSteps(String steps) {
        this.steps = steps;
    }
}