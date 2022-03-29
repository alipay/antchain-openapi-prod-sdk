// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class QueryGatewayClusterhostResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 后端地址
    @NameInMap("host")
    public String host;

    public static QueryGatewayClusterhostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayClusterhostResponse self = new QueryGatewayClusterhostResponse();
        return TeaModel.build(map, self);
    }

    public QueryGatewayClusterhostResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGatewayClusterhostResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGatewayClusterhostResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGatewayClusterhostResponse setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

}
