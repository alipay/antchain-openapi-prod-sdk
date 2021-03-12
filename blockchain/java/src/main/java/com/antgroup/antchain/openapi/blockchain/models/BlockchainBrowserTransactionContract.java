// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserTransactionContract extends TeaModel {
    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // from
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // to
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // gas
    @NameInMap("gas")
    @Validation(required = true)
    public Long gas;

    // hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // nonce
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // period
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // signature_list
    @NameInMap("signature_list")
    @Validation(required = true)
    public java.util.List<String> signatureList;

    // timestamp
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // transaction_type
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // value
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
