// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TxInfo extends TeaModel {
    // 上链结果
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("tx_receipt_result")
    @Validation(required = true)
    public String txReceiptResult;

    // 区块链id
    /**
     * <strong>example:</strong>
     * <p>c4b83bb3080a4a19957af5b0b4430542</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>aeedaaf3abb4a1ce86de538ec42759626689ea59fdfba4a10a0ef1550aa10d3d</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 交易类型
    /**
     * <strong>example:</strong>
     * <p>TX_DEPOSIT_DATA</p>
     */
    @NameInMap("tx_type")
    @Validation(required = true)
    public String txType;

    // 时间戳
    /**
     * <strong>example:</strong>
     * <p>1638796927336</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 区块高度
    /**
     * <strong>example:</strong>
     * <p>68772416</p>
     */
    @NameInMap("block_number")
    @Validation(required = true)
    public String blockNumber;

    // 交易随机数Nonce
    /**
     * <strong>example:</strong>
     * <p>505563366098488426</p>
     */
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 发起地址
    /**
     * <strong>example:</strong>
     * <p>070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304</p>
     */
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 目标地址
    /**
     * <strong>example:</strong>
     * <p>070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304</p>
     */
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 签名
    /**
     * <strong>example:</strong>
     * <p>9357e09984d9ba31f0f6070a8276b0d39ffeb8c40aaa7a6873cc69a04ea4babf7295d642aeb945b5eca6624751e11e41885d918deae554abd8d732f95e31d44f00</p>
     */
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
