// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7186a91da6a6476b8d8f8f21b9ed79b4.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpEnterpriseBusinessscopeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业经营范围
    @NameInMap("ep_business_scope")
    public String epBusinessScope;

    public static QueryAntchainBbpEnterpriseBusinessscopeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpEnterpriseBusinessscopeResponse self = new QueryAntchainBbpEnterpriseBusinessscopeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpEnterpriseBusinessscopeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainBbpEnterpriseBusinessscopeResponse setEpBusinessScope(String epBusinessScope) {
        this.epBusinessScope = epBusinessScope;
        return this;
    }
    public String getEpBusinessScope() {
        return this.epBusinessScope;
    }

}
