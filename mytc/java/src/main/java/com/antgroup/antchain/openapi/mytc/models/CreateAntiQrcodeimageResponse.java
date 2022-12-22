// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class CreateAntiQrcodeimageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的二维码图片的oss地址
    @NameInMap("qrcode_url")
    public String qrcodeUrl;

    // 生成结果码，用于异常场景下细化错误信息
    @NameInMap("generate_code")
    public String generateCode;

    // 生成结果码含义,用于异常场景下细化错误信息
    @NameInMap("generate_message")
    public String generateMessage;

    // 生成失败时的解决方案,用于异常场景下细化错误信息
    @NameInMap("unable_generate_solution")
    public String unableGenerateSolution;

    public static CreateAntiQrcodeimageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntiQrcodeimageResponse self = new CreateAntiQrcodeimageResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntiQrcodeimageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntiQrcodeimageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntiQrcodeimageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntiQrcodeimageResponse setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
        return this;
    }
    public String getQrcodeUrl() {
        return this.qrcodeUrl;
    }

    public CreateAntiQrcodeimageResponse setGenerateCode(String generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public String getGenerateCode() {
        return this.generateCode;
    }

    public CreateAntiQrcodeimageResponse setGenerateMessage(String generateMessage) {
        this.generateMessage = generateMessage;
        return this;
    }
    public String getGenerateMessage() {
        return this.generateMessage;
    }

    public CreateAntiQrcodeimageResponse setUnableGenerateSolution(String unableGenerateSolution) {
        this.unableGenerateSolution = unableGenerateSolution;
        return this;
    }
    public String getUnableGenerateSolution() {
        return this.unableGenerateSolution;
    }

}
