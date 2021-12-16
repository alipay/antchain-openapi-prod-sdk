// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryPartnercoreSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合同信息
    @NameInMap("partner_policy_relation")
    public PartnerPolicyRelation partnerPolicyRelation;

    // 政策信息扩展
    @NameInMap("policy_dto")
    public PolicyDTO policyDto;

    public static QueryPartnercoreSignResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnercoreSignResponse self = new QueryPartnercoreSignResponse();
        return TeaModel.build(map, self);
    }

    public QueryPartnercoreSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPartnercoreSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPartnercoreSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPartnercoreSignResponse setPartnerPolicyRelation(PartnerPolicyRelation partnerPolicyRelation) {
        this.partnerPolicyRelation = partnerPolicyRelation;
        return this;
    }
    public PartnerPolicyRelation getPartnerPolicyRelation() {
        return this.partnerPolicyRelation;
    }

    public QueryPartnercoreSignResponse setPolicyDto(PolicyDTO policyDto) {
        this.policyDto = policyDto;
        return this;
    }
    public PolicyDTO getPolicyDto() {
        return this.policyDto;
    }

}
