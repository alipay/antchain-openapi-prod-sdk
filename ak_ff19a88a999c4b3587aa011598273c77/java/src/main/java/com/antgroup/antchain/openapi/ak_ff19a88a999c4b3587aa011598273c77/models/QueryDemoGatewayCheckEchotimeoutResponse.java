// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ff19a88a999c4b3587aa011598273c77.models;

import com.aliyun.tea.*;

public class QueryDemoGatewayCheckEchotimeoutResponse extends TeaModel {
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
    @NameInMap("stauts")
    public String stauts;

    // ok
    @NameInMap("msg")
    public String msg;

    public static QueryDemoGatewayCheckEchotimeoutResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoGatewayCheckEchotimeoutResponse self = new QueryDemoGatewayCheckEchotimeoutResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoGatewayCheckEchotimeoutResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoGatewayCheckEchotimeoutResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoGatewayCheckEchotimeoutResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoGatewayCheckEchotimeoutResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

    public QueryDemoGatewayCheckEchotimeoutResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

}
