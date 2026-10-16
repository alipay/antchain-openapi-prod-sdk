// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class CallbackCdsqTireinsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("response_code")
    public String responseCode;

    // 错误信息
    @NameInMap("response_msg")
    public String responseMsg;

    public static CallbackCdsqTireinsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackCdsqTireinsuranceResponse self = new CallbackCdsqTireinsuranceResponse();
        return TeaModel.build(map, self);
    }

    public CallbackCdsqTireinsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackCdsqTireinsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackCdsqTireinsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackCdsqTireinsuranceResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public CallbackCdsqTireinsuranceResponse setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
        return this;
    }
    public String getResponseMsg() {
        return this.responseMsg;
    }

}
