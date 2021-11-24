// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryInsuranceEpolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 电子保单url地址
    @NameInMap("policy_url")
    public String policyUrl;

    public static QueryInsuranceEpolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceEpolicyResponse self = new QueryInsuranceEpolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceEpolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsuranceEpolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsuranceEpolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsuranceEpolicyResponse setPolicyUrl(String policyUrl) {
        this.policyUrl = policyUrl;
        return this;
    }
    public String getPolicyUrl() {
        return this.policyUrl;
    }

}
