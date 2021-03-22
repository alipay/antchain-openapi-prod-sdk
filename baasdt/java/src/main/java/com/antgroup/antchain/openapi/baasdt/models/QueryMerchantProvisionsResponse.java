// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryMerchantProvisionsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 租户的备付金列表信息
    @NameInMap("discrete_values")
    public java.util.List<DiscreteValue> discreteValues;

    public static QueryMerchantProvisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantProvisionsResponse self = new QueryMerchantProvisionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantProvisionsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantProvisionsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantProvisionsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantProvisionsResponse setDiscreteValues(java.util.List<DiscreteValue> discreteValues) {
        this.discreteValues = discreteValues;
        return this;
    }
    public java.util.List<DiscreteValue> getDiscreteValues() {
        return this.discreteValues;
    }

}
