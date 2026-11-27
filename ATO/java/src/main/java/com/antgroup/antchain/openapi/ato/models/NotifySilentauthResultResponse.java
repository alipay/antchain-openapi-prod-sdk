// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class NotifySilentauthResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接收结果
    @NameInMap("receive_result")
    public Boolean receiveResult;

    public static NotifySilentauthResultResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifySilentauthResultResponse self = new NotifySilentauthResultResponse();
        return TeaModel.build(map, self);
    }

    public NotifySilentauthResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public NotifySilentauthResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public NotifySilentauthResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public NotifySilentauthResultResponse setReceiveResult(Boolean receiveResult) {
        this.receiveResult = receiveResult;
        return this;
    }
    public Boolean getReceiveResult() {
        return this.receiveResult;
    }

}
