// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetLoadbalanceRuleResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // rule
    @NameInMap("data")
    public LoadBalancerRule data;

    public static GetLoadbalanceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLoadbalanceRuleResponse self = new GetLoadbalanceRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetLoadbalanceRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetLoadbalanceRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLoadbalanceRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetLoadbalanceRuleResponse setData(LoadBalancerRule data) {
        this.data = data;
        return this;
    }
    public LoadBalancerRule getData() {
        return this.data;
    }

}
