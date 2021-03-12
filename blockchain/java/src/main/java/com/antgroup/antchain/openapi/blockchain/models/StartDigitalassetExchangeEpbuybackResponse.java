// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDigitalassetExchangeEpbuybackResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果 success 为成功
    @NameInMap("result")
    public String result;

    public static StartDigitalassetExchangeEpbuybackResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDigitalassetExchangeEpbuybackResponse self = new StartDigitalassetExchangeEpbuybackResponse();
        return TeaModel.build(map, self);
    }

    public StartDigitalassetExchangeEpbuybackResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDigitalassetExchangeEpbuybackResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDigitalassetExchangeEpbuybackResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDigitalassetExchangeEpbuybackResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
