// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SetDigitalassetartArtIssuetoexchangeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 艺术品id
    @NameInMap("art_id")
    public String artId;

    // 交易所代码
    @NameInMap("exchange_code")
    public String exchangeCode;

    public static SetDigitalassetartArtIssuetoexchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDigitalassetartArtIssuetoexchangeResponse self = new SetDigitalassetartArtIssuetoexchangeResponse();
        return TeaModel.build(map, self);
    }

    public SetDigitalassetartArtIssuetoexchangeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SetDigitalassetartArtIssuetoexchangeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SetDigitalassetartArtIssuetoexchangeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SetDigitalassetartArtIssuetoexchangeResponse setArtId(String artId) {
        this.artId = artId;
        return this;
    }
    public String getArtId() {
        return this.artId;
    }

    public SetDigitalassetartArtIssuetoexchangeResponse setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
        return this;
    }
    public String getExchangeCode() {
        return this.exchangeCode;
    }

}
