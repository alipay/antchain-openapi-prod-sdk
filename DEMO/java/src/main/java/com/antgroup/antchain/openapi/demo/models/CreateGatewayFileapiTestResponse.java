// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CreateGatewayFileapiTestResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // output_string
    @NameInMap("output_string")
    public String outputString;

    public static CreateGatewayFileapiTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFileapiTestResponse self = new CreateGatewayFileapiTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFileapiTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateGatewayFileapiTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateGatewayFileapiTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateGatewayFileapiTestResponse setOutputString(String outputString) {
        this.outputString = outputString;
        return this;
    }
    public String getOutputString() {
        return this.outputString;
    }

}
