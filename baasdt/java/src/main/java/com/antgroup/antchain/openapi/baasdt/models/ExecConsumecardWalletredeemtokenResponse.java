// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardWalletredeemtokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 交易哈希
    @NameInMap("tx_hash")
    public String txHash;

    public static ExecConsumecardWalletredeemtokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardWalletredeemtokenResponse self = new ExecConsumecardWalletredeemtokenResponse();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardWalletredeemtokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecConsumecardWalletredeemtokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecConsumecardWalletredeemtokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecConsumecardWalletredeemtokenResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public ExecConsumecardWalletredeemtokenResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
