// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class RunRet extends TeaModel {
    // taskid
    @NameInMap("taskid")
    public String taskid;

    // subtaskdistdt
    @NameInMap("subtaskdistdt")
    public String subtaskdistdt;

    // requestid
    @NameInMap("requestid")
    public String requestid;

    // taskname
    @NameInMap("taskname")
    public String taskname;

    // msgsenddt
    @NameInMap("msgsenddt")
    public String msgsenddt;

    // msgid
    @NameInMap("msgid")
    public String msgid;

    // resultlink
    @NameInMap("resultlink")
    public String resultlink;

    public static RunRet build(java.util.Map<String, ?> map) throws Exception {
        RunRet self = new RunRet();
        return TeaModel.build(map, self);
    }

    public RunRet setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

    public RunRet setSubtaskdistdt(String subtaskdistdt) {
        this.subtaskdistdt = subtaskdistdt;
        return this;
    }
    public String getSubtaskdistdt() {
        return this.subtaskdistdt;
    }

    public RunRet setRequestid(String requestid) {
        this.requestid = requestid;
        return this;
    }
    public String getRequestid() {
        return this.requestid;
    }

    public RunRet setTaskname(String taskname) {
        this.taskname = taskname;
        return this;
    }
    public String getTaskname() {
        return this.taskname;
    }

    public RunRet setMsgsenddt(String msgsenddt) {
        this.msgsenddt = msgsenddt;
        return this;
    }
    public String getMsgsenddt() {
        return this.msgsenddt;
    }

    public RunRet setMsgid(String msgid) {
        this.msgid = msgid;
        return this;
    }
    public String getMsgid() {
        return this.msgid;
    }

    public RunRet setResultlink(String resultlink) {
        this.resultlink = resultlink;
        return this;
    }
    public String getResultlink() {
        return this.resultlink;
    }

}
