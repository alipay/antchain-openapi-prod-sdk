// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_7efe8c7cfc5b4e23b792bf4510448a97.models;

import com.aliyun.tea.*;

public class EchoDemoGatewayCheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    public static EchoDemoGatewayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        EchoDemoGatewayCheckResponse self = new EchoDemoGatewayCheckResponse();
        return TeaModel.build(map, self);
    }

    public EchoDemoGatewayCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EchoDemoGatewayCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EchoDemoGatewayCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EchoDemoGatewayCheckResponse setOutputDemo(DemoClass outputDemo) {
        this.outputDemo = outputDemo;
        return this;
    }
    public DemoClass getOutputDemo() {
        return this.outputDemo;
    }

    public EchoDemoGatewayCheckResponse setOutputString(String outputString) {
        this.outputString = outputString;
        return this;
    }
    public String getOutputString() {
        return this.outputString;
    }

    public EchoDemoGatewayCheckResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
