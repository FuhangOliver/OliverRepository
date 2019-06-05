package com.ciwei.springbootdemo.pojo;

public class Superiortask {
    private Integer initiatingid;

    private String initiatingdevice;

    private String targetdevice;

    private String issuedpath;

    private String tasktype;

    private String taskname;

    private String taskdetails;

    public Integer getInitiatingid() {
        return initiatingid;
    }

    public void setInitiatingid(Integer initiatingid) {
        this.initiatingid = initiatingid;
    }

    public String getInitiatingdevice() {
        return initiatingdevice;
    }

    public void setInitiatingdevice(String initiatingdevice) {
        this.initiatingdevice = initiatingdevice == null ? null : initiatingdevice.trim();
    }

    public String getTargetdevice() {
        return targetdevice;
    }

    public void setTargetdevice(String targetdevice) {
        this.targetdevice = targetdevice == null ? null : targetdevice.trim();
    }

    public String getIssuedpath() {
        return issuedpath;
    }

    public void setIssuedpath(String issuedpath) {
        this.issuedpath = issuedpath == null ? null : issuedpath.trim();
    }

    public String getTasktype() {
        return tasktype;
    }

    public void setTasktype(String tasktype) {
        this.tasktype = tasktype == null ? null : tasktype.trim();
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public String getTaskdetails() {
        return taskdetails;
    }

    public void setTaskdetails(String taskdetails) {
        this.taskdetails = taskdetails == null ? null : taskdetails.trim();
    }
}