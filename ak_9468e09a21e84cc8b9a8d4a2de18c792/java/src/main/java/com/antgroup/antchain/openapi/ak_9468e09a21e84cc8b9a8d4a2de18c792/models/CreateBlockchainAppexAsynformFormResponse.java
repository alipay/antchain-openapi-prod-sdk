// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9468e09a21e84cc8b9a8d4a2de18c792.models;

import com.aliyun.tea.*;

public class CreateBlockchainAppexAsynformFormResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易Hash
    // 
    @NameInMap("tx_hash")
    public String txHash;

    public static CreateBlockchainAppexAsynformFormResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainAppexAsynformFormResponse self = new CreateBlockchainAppexAsynformFormResponse();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainAppexAsynformFormResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBlockchainAppexAsynformFormResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBlockchainAppexAsynformFormResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBlockchainAppexAsynformFormResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
