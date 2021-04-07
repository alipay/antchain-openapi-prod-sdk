// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryLoadbalanceSecurityipResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
