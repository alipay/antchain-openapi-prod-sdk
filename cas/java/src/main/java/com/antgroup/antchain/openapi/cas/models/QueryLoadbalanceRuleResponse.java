// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceRuleResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // rules
    @NameInMap("data")
    public java.util.List<LoadBalancerRule> data;

    public static QueryLoadbalanceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceRuleResponse self = new QueryLoadbalanceRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceRuleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceRuleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceRuleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceRuleResponse setData(java.util.List<LoadBalancerRule> data) {
        this.data = data;
        return this;
    }
    public java.util.List<LoadBalancerRule> getData() {
        return this.data;
    }

}
