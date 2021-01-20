// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiPayordercallbackResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

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

    public static CallbackSpiPayordercallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiPayordercallbackResponse self = new CallbackSpiPayordercallbackResponse();
        return TeaModel.build(map, self);
    }

    public CallbackSpiPayordercallbackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackSpiPayordercallbackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackSpiPayordercallbackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackSpiPayordercallbackResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackSpiPayordercallbackResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CallbackSpiPayordercallbackResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallbackSpiPayordercallbackResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public CallbackSpiPayordercallbackResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
