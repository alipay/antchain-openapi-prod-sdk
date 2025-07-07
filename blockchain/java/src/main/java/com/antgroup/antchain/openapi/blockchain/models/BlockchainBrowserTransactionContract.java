// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserTransactionContract extends TeaModel {
    // data
    /**
     * <strong>example:</strong>
     * <p>asdfasdfsadfsdafasd</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // from
    /**
     * <strong>example:</strong>
     * <p>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</p>
     */
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // to
    /**
     * <strong>example:</strong>
     * <p>eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612</p>
     */
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // gas
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("gas")
    @Validation(required = true)
    public Long gas;

    // hash
    /**
     * <strong>example:</strong>
     * <p>65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c</p>
     */
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // nonce
    /**
     * <strong>example:</strong>
     * <p>395460146568219584</p>
     */
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // period
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // signature_list
    /**
     * <strong>example:</strong>
     * <p>signature_list</p>
     */
    @NameInMap("signature_list")
    @Validation(required = true)
    public java.util.List<String> signatureList;

    // timestamp
    /**
     * <strong>example:</strong>
     * <p>1604565299516</p>
     */
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // transaction_type
    /**
     * <strong>example:</strong>
     * <p>TX_DEPOSIT_DATA</p>
     */
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // value
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    public static BlockchainBrowserTransactionContract build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserTransactionContract self = new BlockchainBrowserTransactionContract();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserTransactionContract setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BlockchainBrowserTransactionContract setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BlockchainBrowserTransactionContract setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BlockchainBrowserTransactionContract setGas(Long gas) {
        this.gas = gas;
        return this;
    }
    public Long getGas() {
        return this.gas;
    }

    public BlockchainBrowserTransactionContract setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public BlockchainBrowserTransactionContract setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public BlockchainBrowserTransactionContract setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public BlockchainBrowserTransactionContract setSignatureList(java.util.List<String> signatureList) {
        this.signatureList = signatureList;
        return this;
    }
    public java.util.List<String> getSignatureList() {
        return this.signatureList;
    }

    public BlockchainBrowserTransactionContract setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BlockchainBrowserTransactionContract setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public BlockchainBrowserTransactionContract setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

}
