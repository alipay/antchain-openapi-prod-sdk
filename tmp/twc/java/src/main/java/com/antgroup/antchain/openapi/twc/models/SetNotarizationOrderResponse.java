// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SetNotarizationOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否设置成功
    @NameInMap("accepted")
    public Boolean accepted;

    // 如设置失败，返回失败原因
    @NameInMap("reason")
    public String reason;

    public static SetNotarizationOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SetNotarizationOrderResponse self = new SetNotarizationOrderResponse();
        return TeaModel.build(map, self);
    }

    public SetNotarizationOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetNotarizationOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetNotarizationOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetNotarizationOrderResponse setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public SetNotarizationOrderResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
