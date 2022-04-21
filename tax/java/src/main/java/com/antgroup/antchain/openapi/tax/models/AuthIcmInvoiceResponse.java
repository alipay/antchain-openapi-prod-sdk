// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AuthIcmInvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权是否成功：true：成功 false：失败
    @NameInMap("success")
    public String success;

    // 透传字段
    @NameInMap("biz_context")
    public String bizContext;

    // 纳税人识别号
    @NameInMap("nsrsbh")
    public String nsrsbh;

    // 过期时间
    @NameInMap("expired_time")
    public String expiredTime;

    // 业务请求id
    @NameInMap("request_id")
    public String requestId;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    // 错误信息
    @NameInMap("error_msg")
    public String errorMsg;

    public static AuthIcmInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthIcmInvoiceResponse self = new AuthIcmInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public AuthIcmInvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthIcmInvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthIcmInvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthIcmInvoiceResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AuthIcmInvoiceResponse setBizContext(String bizContext) {
        this.bizContext = bizContext;
        return this;
    }
    public String getBizContext() {
        return this.bizContext;
    }

    public AuthIcmInvoiceResponse setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
        return this;
    }
    public String getNsrsbh() {
        return this.nsrsbh;
    }

    public AuthIcmInvoiceResponse setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public AuthIcmInvoiceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthIcmInvoiceResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AuthIcmInvoiceResponse setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
