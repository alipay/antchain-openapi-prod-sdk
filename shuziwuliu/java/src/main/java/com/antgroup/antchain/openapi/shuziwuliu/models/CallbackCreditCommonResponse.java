// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CallbackCreditCommonResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否已接收
    @NameInMap("received")
    public Boolean received;

    public static CallbackCreditCommonResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackCreditCommonResponse self = new CallbackCreditCommonResponse();
        return TeaModel.build(map, self);
    }

    public CallbackCreditCommonResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackCreditCommonResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackCreditCommonResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackCreditCommonResponse setReceived(Boolean received) {
        this.received = received;
        return this;
    }
    public Boolean getReceived() {
        return this.received;
    }

}
