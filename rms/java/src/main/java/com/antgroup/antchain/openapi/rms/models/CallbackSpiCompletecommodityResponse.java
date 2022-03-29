// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiCompletecommodityResponse extends TeaModel {
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

    public static CallbackSpiCompletecommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiCompletecommodityResponse self = new CallbackSpiCompletecommodityResponse();
        return TeaModel.build(map, self);
    }

    public CallbackSpiCompletecommodityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackSpiCompletecommodityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackSpiCompletecommodityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackSpiCompletecommodityResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackSpiCompletecommodityResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CallbackSpiCompletecommodityResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallbackSpiCompletecommodityResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public CallbackSpiCompletecommodityResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
