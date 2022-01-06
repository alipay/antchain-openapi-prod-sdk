// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryclientsMsDdcsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订阅客户端列表
    @NameInMap("clients")
    @Validation(required = true)
    public java.util.List<ClientInfo> clients;

    public static QueryclientsMsDdcsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryclientsMsDdcsResponse self = new QueryclientsMsDdcsResponse();
        return TeaModel.build(map, self);
    }

    public QueryclientsMsDdcsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryclientsMsDdcsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryclientsMsDdcsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryclientsMsDdcsResponse setClients(java.util.List<ClientInfo> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<ClientInfo> getClients() {
        return this.clients;
    }

}
