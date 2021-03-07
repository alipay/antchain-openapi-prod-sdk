// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class EchoGatewayCheckResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // output_demo
    @NameInMap("output_demo")
    public DemoClass outputDemo;

    // output_string
    @NameInMap("output_string")
    public String outputString;

    // file_url
    @NameInMap("file_url")
    public String fileUrl;

    public static EchoGatewayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        EchoGatewayCheckResponse self = new EchoGatewayCheckResponse();
        return TeaModel.build(map, self);
    }

    public EchoGatewayCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EchoGatewayCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EchoGatewayCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EchoGatewayCheckResponse setOutputDemo(DemoClass outputDemo) {
        this.outputDemo = outputDemo;
        return this;
    }
    public DemoClass getOutputDemo() {
        return this.outputDemo;
    }

    public EchoGatewayCheckResponse setOutputString(String outputString) {
        this.outputString = outputString;
        return this;
    }
    public String getOutputString() {
        return this.outputString;
    }

    public EchoGatewayCheckResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
