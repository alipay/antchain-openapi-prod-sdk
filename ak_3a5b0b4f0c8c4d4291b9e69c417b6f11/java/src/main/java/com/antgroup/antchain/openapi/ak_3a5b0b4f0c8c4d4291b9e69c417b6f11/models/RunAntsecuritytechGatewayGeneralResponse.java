// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_3a5b0b4f0c8c4d4291b9e69c417b6f11.models;

import com.aliyun.tea.*;

public class RunAntsecuritytechGatewayGeneralResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务响应数据，json格式
    @NameInMap("response")
    public String response;

    public static RunAntsecuritytechGatewayGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAntsecuritytechGatewayGeneralResponse self = new RunAntsecuritytechGatewayGeneralResponse();
        return TeaModel.build(map, self);
    }

    public RunAntsecuritytechGatewayGeneralResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RunAntsecuritytechGatewayGeneralResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RunAntsecuritytechGatewayGeneralResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RunAntsecuritytechGatewayGeneralResponse setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

}
