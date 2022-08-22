// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7efe8c7cfc5b4e23b792bf4510448a97.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayCheckEchotenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 222
    @NameInMap("status")
    public String status;

    // ok
    @NameInMap("msg")
    public String msg;

    public static QueryDemoGatewayCheckEchotenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayCheckEchotenResponse self = new QueryDemoGatewayCheckEchotenResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayCheckEchotenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoGatewayCheckEchotenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoGatewayCheckEchotenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoGatewayCheckEchotenResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDemoGatewayCheckEchotenResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
