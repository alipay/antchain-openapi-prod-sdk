// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TransactionPo extends TeaModel {
    // 交易所在块hash
    /**
     * <strong>example:</strong>
     * <p>b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0</p>
     */
    @NameInMap("block_hash")
    public String blockHash;

    // 交易来源
    /**
     * <strong>example:</strong>
     * <p>b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0</p>
     */
    @NameInMap("from")
    public String from;

    // gas消耗
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("gas_used")
    public Long gasUsed;

    // 交易hash
    /**
     * <strong>example:</strong>
     * <p>ce386c5510df2e358056893b86ba77178fcf00d90de9c56bd788fd1968c9b58d</p>
     */
    @NameInMap("hash")
    public String hash;

    // 交易所在块 块高
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("height")
    public Long height;

    // 交易返回结果
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result")
    public String result;

    // 交易时间
    /**
     * <strong>example:</strong>
     * <p>1573401600000</p>
     */
    @NameInMap("timestamp")
    public Long timestamp;

    // 交易地址
    /**
     * <strong>example:</strong>
     * <p>4a5e107d0ea041f25ca7bfb58503e6549913e67e5d07aadfe359418440359fec</p>
     */
    @NameInMap("to")
    public String to;

    // 交易类型 同SDK
    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("tx_type")
    public Long txType;

    // 转账额度
    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("value")
    public Long value;

    public static TransactionPo build(java.util.Map<String, ?> map) throws Exception {
        TransactionPo self = new TransactionPo();
        return TeaModel.build(map, self);
    }

    public TransactionPo setBlockHash(String blockHash) {
        this.blockHash = blockHash;
        return this;
    }
    public String getBlockHash() {
        return this.blockHash;
    }

    public TransactionPo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TransactionPo setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public TransactionPo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public TransactionPo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public TransactionPo setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public TransactionPo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TransactionPo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TransactionPo setTxType(Long txType) {
        this.txType = txType;
        return this;
    }
    public Long getTxType() {
        return this.txType;
    }

    public TransactionPo setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
