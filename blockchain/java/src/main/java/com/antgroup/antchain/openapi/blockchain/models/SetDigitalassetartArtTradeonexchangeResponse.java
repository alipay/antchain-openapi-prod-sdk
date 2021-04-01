// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtTradeonexchangeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0 在交易成功
    // 1 在交易失败
    @NameInMap("status")
    public Long status;

    public static SetDigitalassetartArtTradeonexchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtTradeonexchangeResponse self = new SetDigitalassetartArtTradeonexchangeResponse();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtTradeonexchangeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetDigitalassetartArtTradeonexchangeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetDigitalassetartArtTradeonexchangeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetDigitalassetartArtTradeonexchangeResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
