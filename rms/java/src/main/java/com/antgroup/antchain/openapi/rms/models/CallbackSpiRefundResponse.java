// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // code
    @NameInMap("code")
    public String code;

    // data
    @NameInMap("data")
    public String data;

    // message
    @NameInMap("message")
    public String message;

    // synchro
    @NameInMap("synchro")
    public String synchro;

    // success
    @NameInMap("success")
    public Boolean success;

    public static CallbackSpiRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiRefundResponse self = new CallbackSpiRefundResponse();
        return TeaModel.build(map, self);
    }

    public CallbackSpiRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackSpiRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackSpiRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackSpiRefundResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackSpiRefundResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CallbackSpiRefundResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallbackSpiRefundResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public CallbackSpiRefundResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
