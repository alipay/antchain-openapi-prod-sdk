// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceSecurityipResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // security_ips
    @NameInMap("data")
    public ListenerSecurityIp data;

    public static QueryLoadbalanceSecurityipResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLoadbalanceSecurityipResponse self = new QueryLoadbalanceSecurityipResponse();
        return TeaModel.build(map, self);
    }

    public QueryLoadbalanceSecurityipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLoadbalanceSecurityipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLoadbalanceSecurityipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLoadbalanceSecurityipResponse setData(ListenerSecurityIp data) {
        this.data = data;
        return this;
    }
    public ListenerSecurityIp getData() {
        return this.data;
    }

}
