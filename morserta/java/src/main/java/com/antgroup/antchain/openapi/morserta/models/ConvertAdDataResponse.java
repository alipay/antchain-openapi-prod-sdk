// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.morserta.models;

import com.aliyun.tea.*;

public class ConvertAdDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 调用是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回码
    @NameInMap("code")
    public String code;

    // 返回码描述
    @NameInMap("message")
    public String message;

    // 请求的唯一id
    @NameInMap("request_id")
    public String requestId;

    public static ConvertAdDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertAdDataResponse self = new ConvertAdDataResponse();
        return TeaModel.build(map, self);
    }

    public ConvertAdDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConvertAdDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConvertAdDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConvertAdDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConvertAdDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConvertAdDataResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConvertAdDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
