// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsClientvalueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户端信息，包含内存值
    @NameInMap("clients")
    public java.util.List<ClientValue> clients;

    public static QueryDdcsClientvalueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsClientvalueResponse self = new QueryDdcsClientvalueResponse();
        return TeaModel.build(map, self);
    }

    public QueryDdcsClientvalueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDdcsClientvalueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDdcsClientvalueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDdcsClientvalueResponse setClients(java.util.List<ClientValue> clients) {
        this.clients = clients;
        return this;
    }
    public java.util.List<ClientValue> getClients() {
        return this.clients;
    }

}
