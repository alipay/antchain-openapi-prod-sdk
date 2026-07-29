// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMermngcontractextractResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务code
    @NameInMap("task_code")
    public String taskCode;

    // 任务id
    @NameInMap("task_instant_id")
    public String taskInstantId;

    // 业务id
    @NameInMap("biz_id")
    public String bizId;

    // 任务实例状态 PROCESSING/SUCCESS/FAILED
    @NameInMap("status")
    public String status;

    // 提取结果
    @NameInMap("extract_result")
    public String extractResult;

    public static QueryInnerMermngcontractextractResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMermngcontractextractResponse self = new QueryInnerMermngcontractextractResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerMermngcontractextractResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerMermngcontractextractResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerMermngcontractextractResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerMermngcontractextractResponse setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public QueryInnerMermngcontractextractResponse setTaskInstantId(String taskInstantId) {
        this.taskInstantId = taskInstantId;
        return this;
    }
    public String getTaskInstantId() {
        return this.taskInstantId;
    }

    public QueryInnerMermngcontractextractResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryInnerMermngcontractextractResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryInnerMermngcontractextractResponse setExtractResult(String extractResult) {
        this.extractResult = extractResult;
        return this;
    }
    public String getExtractResult() {
        return this.extractResult;
    }

}
