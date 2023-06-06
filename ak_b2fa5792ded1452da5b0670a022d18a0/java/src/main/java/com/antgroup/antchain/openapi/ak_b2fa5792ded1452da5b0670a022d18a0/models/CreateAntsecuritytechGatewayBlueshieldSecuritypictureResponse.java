// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b2fa5792ded1452da5b0670a022d18a0.models;

import com.aliyun.tea.*;

public class CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行是否成功
    @NameInMap("success")
    public Boolean success;

    // 生成的图片文件名
    @NameInMap("file_name")
    public String fileName;

    // body base 64
    @NameInMap("body_base64")
    public String bodyBase64;

    public static CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse self = new CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateAntsecuritytechGatewayBlueshieldSecuritypictureResponse setBodyBase64(String bodyBase64) {
        this.bodyBase64 = bodyBase64;
        return this;
    }
    public String getBodyBase64() {
        return this.bodyBase64;
    }

}
