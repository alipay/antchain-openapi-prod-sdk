// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CallbackSpiLifecycleResponse extends TeaModel {
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

    // a synchro
    @NameInMap("synchro")
    public String synchro;

    // success
    @NameInMap("success")
    public Boolean success;

    public static CallbackSpiLifecycleResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackSpiLifecycleResponse self = new CallbackSpiLifecycleResponse();
        return TeaModel.build(map, self);
    }

    public CallbackSpiLifecycleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackSpiLifecycleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackSpiLifecycleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackSpiLifecycleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CallbackSpiLifecycleResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CallbackSpiLifecycleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallbackSpiLifecycleResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public CallbackSpiLifecycleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
