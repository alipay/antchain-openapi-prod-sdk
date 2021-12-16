// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryPartnercorePolicyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 政策信息扩展
    @NameInMap("policy_dto")
    public PolicyDTO policyDto;

    public static QueryPartnercorePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnercorePolicyResponse self = new QueryPartnercorePolicyResponse();
        return TeaModel.build(map, self);
    }

    public QueryPartnercorePolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPartnercorePolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPartnercorePolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPartnercorePolicyResponse setPolicyDto(PolicyDTO policyDto) {
        this.policyDto = policyDto;
        return this;
    }
    public PolicyDTO getPolicyDto() {
        return this.policyDto;
    }

}
