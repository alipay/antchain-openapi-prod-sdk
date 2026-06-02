// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class PushSmsDomesticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 消息id
    @NameInMap("message_id")
    public String messageId;

    // 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
    @NameInMap("status")
    public Long status;

    public static PushSmsDomesticResponse build(java.util.Map<String, ?> map) throws Exception {
        PushSmsDomesticResponse self = new PushSmsDomesticResponse();
        return TeaModel.build(map, self);
    }

    public PushSmsDomesticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushSmsDomesticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushSmsDomesticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushSmsDomesticResponse setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushSmsDomesticResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
