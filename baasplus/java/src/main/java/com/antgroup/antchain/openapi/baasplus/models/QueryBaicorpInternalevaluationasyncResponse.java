// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBaicorpInternalevaluationasyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务自定义id
    @NameInMap("custom_id")
    public String customId;

    // 风险识别结果
    @NameInMap("risk_result")
    public String riskResult;

    // 风险识别结果描述
    @NameInMap("risk_result_desc")
    public String riskResultDesc;

    // 监测任务ID
    @NameInMap("task_id")
    public String taskId;

    public static QueryBaicorpInternalevaluationasyncResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBaicorpInternalevaluationasyncResponse self = new QueryBaicorpInternalevaluationasyncResponse();
        return TeaModel.build(map, self);
    }

    public QueryBaicorpInternalevaluationasyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBaicorpInternalevaluationasyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBaicorpInternalevaluationasyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBaicorpInternalevaluationasyncResponse setCustomId(String customId) {
        this.customId = customId;
        return this;
    }
    public String getCustomId() {
        return this.customId;
    }

    public QueryBaicorpInternalevaluationasyncResponse setRiskResult(String riskResult) {
        this.riskResult = riskResult;
        return this;
    }
    public String getRiskResult() {
        return this.riskResult;
    }

    public QueryBaicorpInternalevaluationasyncResponse setRiskResultDesc(String riskResultDesc) {
        this.riskResultDesc = riskResultDesc;
        return this;
    }
    public String getRiskResultDesc() {
        return this.riskResultDesc;
    }

    public QueryBaicorpInternalevaluationasyncResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
