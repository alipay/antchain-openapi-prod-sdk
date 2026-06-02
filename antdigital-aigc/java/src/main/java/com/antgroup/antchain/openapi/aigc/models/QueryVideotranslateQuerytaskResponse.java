// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class QueryVideotranslateQuerytaskResponse extends TeaModel {
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

    // 任务状态包括：PENDING（待执行）、EXECUTING（执行中）、COMPLETED（已完成）
    @NameInMap("status")
    public String status;

    // 子任务列表
    @NameInMap("sub_tasks")
    public java.util.List<SubTasks> subTasks;

    public static QueryVideotranslateQuerytaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideotranslateQuerytaskResponse self = new QueryVideotranslateQuerytaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideotranslateQuerytaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryVideotranslateQuerytaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryVideotranslateQuerytaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryVideotranslateQuerytaskResponse setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public QueryVideotranslateQuerytaskResponse setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public QueryVideotranslateQuerytaskResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryVideotranslateQuerytaskResponse setSubTasks(java.util.List<SubTasks> subTasks) {
        this.subTasks = subTasks;
        return this;
    }
    public java.util.List<SubTasks> getSubTasks() {
        return this.subTasks;
    }

}
