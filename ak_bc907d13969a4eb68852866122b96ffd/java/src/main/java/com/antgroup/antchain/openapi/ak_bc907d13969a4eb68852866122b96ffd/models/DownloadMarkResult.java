// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class DownloadMarkResult extends TeaModel {
    // TaskId
    @NameInMap("taskid")
    public String taskid;

    // RunInstId
    @NameInMap("runinstid")
    public String runinstid;

    // msgid
    @NameInMap("msgid")
    public String msgid;

    public static DownloadMarkResult build(java.util.Map<String, ?> map) throws Exception {
        DownloadMarkResult self = new DownloadMarkResult();
        return TeaModel.build(map, self);
    }

    public DownloadMarkResult setTaskid(String taskid) {
        this.taskid = taskid;
        return this;
    }
    public String getTaskid() {
        return this.taskid;
    }

    public DownloadMarkResult setRuninstid(String runinstid) {
        this.runinstid = runinstid;
        return this;
    }
    public String getRuninstid() {
        return this.runinstid;
    }

    public DownloadMarkResult setMsgid(String msgid) {
        this.msgid = msgid;
        return this;
    }
    public String getMsgid() {
        return this.msgid;
    }

}
