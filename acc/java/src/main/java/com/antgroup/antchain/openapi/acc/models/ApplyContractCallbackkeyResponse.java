// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class ApplyContractCallbackkeyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 加签使用的key
    // 
    @NameInMap("key")
    public String key;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 业务码信息
    @NameInMap("message")
    public String message;

    public static ApplyContractCallbackkeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyContractCallbackkeyResponse self = new ApplyContractCallbackkeyResponse();
        return TeaModel.build(map, self);
    }

    public ApplyContractCallbackkeyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyContractCallbackkeyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyContractCallbackkeyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyContractCallbackkeyResponse setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ApplyContractCallbackkeyResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ApplyContractCallbackkeyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
