// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class VerifyBlockchainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统一证据编号（存证交易HASH）
    @NameInMap("tx_hash")
    public String txHash;

    // 核验结果
    @NameInMap("status")
    public String status;

    // 所在区块hash
    @NameInMap("block_hash")
    public String blockHash;

    // 区块链高度
    @NameInMap("block_height")
    public Long blockHeight;

    // 存证类型
    @NameInMap("data_type")
    public String dataType;

    // 存证时间
    @NameInMap("timestamp")
    public String timestamp;

    public static VerifyBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyBlockchainResponse self = new VerifyBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public VerifyBlockchainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyBlockchainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyBlockchainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyBlockchainResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public VerifyBlockchainResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VerifyBlockchainResponse setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public VerifyBlockchainResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public VerifyBlockchainResponse setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public VerifyBlockchainResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
