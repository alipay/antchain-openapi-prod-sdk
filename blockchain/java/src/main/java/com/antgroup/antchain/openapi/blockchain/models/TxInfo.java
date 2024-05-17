// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TxInfo extends TeaModel {
    // 上链结果
    @NameInMap("tx_receipt_result")
    @Validation(required = true)
    public String txReceiptResult;

    // 区块链id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易类型
    @NameInMap("tx_type")
    @Validation(required = true)
    public String txType;

    // 时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 区块高度
    @NameInMap("block_number")
    @Validation(required = true)
    public String blockNumber;

    // 交易随机数Nonce
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 发起地址
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 目标地址
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static TxInfo build(java.util.Map<String, ?> map) throws Exception {
        TxInfo self = new TxInfo();
        return TeaModel.build(map, self);
    }

    public TxInfo setTxReceiptResult(String txReceiptResult) {
        this.txReceiptResult = txReceiptResult;
        return this;
    }
    public String getTxReceiptResult() {
        return this.txReceiptResult;
    }

    public TxInfo setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public TxInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public TxInfo setTxType(String txType) {
        this.txType = txType;
        return this;
    }
    public String getTxType() {
        return this.txType;
    }

    public TxInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TxInfo setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public String getBlockNumber() {
        return this.blockNumber;
    }

    public TxInfo setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public TxInfo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TxInfo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TxInfo setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
