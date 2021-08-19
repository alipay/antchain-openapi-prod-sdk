// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddCertificateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原始数据
    @NameInMap("raw_data")
    public String rawData;

    // 对raw_data的签名
    @NameInMap("platform_signature")
    public String platformSignature;

    // 执行结果成功与否
    @NameInMap("success")
    public Boolean success;

    // 错误码
    @NameInMap("error_code")
    public Long errorCode;

    public static AddCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCertificateResponse self = new AddCertificateResponse();
        return TeaModel.build(map, self);
    }

    public AddCertificateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddCertificateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddCertificateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddCertificateResponse setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

    public AddCertificateResponse setPlatformSignature(String platformSignature) {
        this.platformSignature = platformSignature;
        return this;
    }
    public String getPlatformSignature() {
        return this.platformSignature;
    }

    public AddCertificateResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddCertificateResponse setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

}
