// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务类型,FILE_DECRYPT_ESIGN_UPLOAD
    @NameInMap("task_type")
    public String taskType;

    // 任务结果
    //  INIT,初始化
    //  DOING，处理中
    //  FAIL，失败
    //  SUCCESS，成功
    @NameInMap("task_status")
    public String taskStatus;

    // 当任务为FILE_DECRYPT_ESIGN_UPLOAD时，为处理成功后的文件id
    @NameInMap("task_result")
    public String taskResult;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    public static QueryContractTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractTaskResponse self = new QueryContractTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractTaskResponse setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public QueryContractTaskResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public QueryContractTaskResponse setTaskResult(String taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public String getTaskResult() {
        return this.taskResult;
    }

    public QueryContractTaskResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
