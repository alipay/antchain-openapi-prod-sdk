// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateRealpersonFacevrfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求唯一ID标识，为空则是异常
    @NameInMap("real_person_verification_code")
    public String realPersonVerificationCode;

    // 【solution_type=H5 | ZFB返回】
    // 人脸核身url地址
    @NameInMap("web_url")
    public String webUrl;

    public static CreateRealpersonFacevrfResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealpersonFacevrfResponse self = new CreateRealpersonFacevrfResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealpersonFacevrfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRealpersonFacevrfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRealpersonFacevrfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRealpersonFacevrfResponse setRealPersonVerificationCode(String realPersonVerificationCode) {
        this.realPersonVerificationCode = realPersonVerificationCode;
        return this;
    }
    public String getRealPersonVerificationCode() {
        return this.realPersonVerificationCode;
    }

    public CreateRealpersonFacevrfResponse setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

}
