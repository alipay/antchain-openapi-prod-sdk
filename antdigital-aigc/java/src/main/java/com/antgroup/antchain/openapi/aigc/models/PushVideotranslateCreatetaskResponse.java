// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class PushVideotranslateCreatetaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务ID
    @NameInMap("task_id")
    public Long taskId;

    // 任务名称
    @NameInMap("task_name")
    public String taskName;

    // 子任务数量
    @NameInMap("sub_task_count")
    public Long subTaskCount;

    // 任务状态：PENDING-待执行、EXECUTING-执行中、COMPLETED-已完成
    @NameInMap("status")
    public String status;

    public static PushVideotranslateCreatetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PushVideotranslateCreatetaskResponse self = new PushVideotranslateCreatetaskResponse();
        return TeaModel.build(map, self);
    }

    public PushVideotranslateCreatetaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushVideotranslateCreatetaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushVideotranslateCreatetaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushVideotranslateCreatetaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public PushVideotranslateCreatetaskResponse setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushVideotranslateCreatetaskResponse setSubTaskCount(Long subTaskCount) {
        this.subTaskCount = subTaskCount;
        return this;
    }
    public Long getSubTaskCount() {
        return this.subTaskCount;
    }

    public PushVideotranslateCreatetaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
