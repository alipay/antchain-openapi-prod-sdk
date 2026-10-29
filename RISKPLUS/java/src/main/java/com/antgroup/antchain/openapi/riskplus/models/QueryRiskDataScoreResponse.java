// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRiskDataScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求成功标识
    @NameInMap("success")
    public Boolean success;

    // 业务入参回显
    @NameInMap("biz_id")
    public String bizId;

    // 授权码
    @NameInMap("business_code")
    public String businessCode;

    // 详细评分列表
    @NameInMap("model_detail")
    public java.util.List<ModelDetail> modelDetail;

    // 变量类型
    @NameInMap("variable_detail")
    public java.util.List<VariableDetail> variableDetail;

    public static QueryRiskDataScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskDataScoreResponse self = new QueryRiskDataScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskDataScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskDataScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskDataScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskDataScoreResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRiskDataScoreResponse setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryRiskDataScoreResponse setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryRiskDataScoreResponse setModelDetail(java.util.List<ModelDetail> modelDetail) {
        this.modelDetail = modelDetail;
        return this;
    }
    public java.util.List<ModelDetail> getModelDetail() {
        return this.modelDetail;
    }

    public QueryRiskDataScoreResponse setVariableDetail(java.util.List<VariableDetail> variableDetail) {
        this.variableDetail = variableDetail;
        return this;
    }
    public java.util.List<VariableDetail> getVariableDetail() {
        return this.variableDetail;
    }

}
