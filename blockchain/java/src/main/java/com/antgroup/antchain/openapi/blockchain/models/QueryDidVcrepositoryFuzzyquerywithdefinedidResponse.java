// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidVcrepositoryFuzzyquerywithdefinedidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可验证声明的完整声明列表
    @NameInMap("verifiable_claim_content")
    public java.util.List<String> verifiableClaimContent;

    public static QueryDidVcrepositoryFuzzyquerywithdefinedidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidVcrepositoryFuzzyquerywithdefinedidResponse self = new QueryDidVcrepositoryFuzzyquerywithdefinedidResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidVcrepositoryFuzzyquerywithdefinedidResponse setVerifiableClaimContent(java.util.List<String> verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public java.util.List<String> getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

}
