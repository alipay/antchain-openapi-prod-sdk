// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ConfirmWitnessFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 错误码
    @NameInMap("code")
    public Long code;

    // 错误信息
    @NameInMap("message")
    public String message;

    public static ConfirmWitnessFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmWitnessFlowResponse self = new ConfirmWitnessFlowResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmWitnessFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmWitnessFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmWitnessFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmWitnessFlowResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ConfirmWitnessFlowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
