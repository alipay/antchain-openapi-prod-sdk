// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunTransaction extends TeaModel {
    // tx_type
    @NameInMap("tx_type")
    public String txType;

    // data
    @NameInMap("data")
    public String data;

    // hash
    @NameInMap("hash")
    public String hash;

    // from
    @NameInMap("from")
    public String from;

    // to
    @NameInMap("to")
    public String to;

    // timestamp
    @NameInMap("timestamp")
    public Long timestamp;

    // period
    @NameInMap("period")
    public Long period;

    // nonce
    @NameInMap("nonce")
    public String nonce;

    // gas
    @NameInMap("gas")
    public String gas;

    // value
    @NameInMap("value")
    public String value;

    // signatures
    @NameInMap("signatures")
    public java.util.List<String> signatures;

    // extentions
    @NameInMap("extentions")
    public java.util.List<String> extentions;

    public static ALiYunTransaction build(java.util.Map<String, ?> map) throws Exception {
        ALiYunTransaction self = new ALiYunTransaction();
        return TeaModel.build(map, self);
    }

    public ALiYunTransaction setTxType(String txType) {
        this.txType = txType;
        return this;
    }
    public String getTxType() {
        return this.txType;
    }

    public ALiYunTransaction setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ALiYunTransaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ALiYunTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ALiYunTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ALiYunTransaction setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ALiYunTransaction setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public ALiYunTransaction setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public ALiYunTransaction setGas(String gas) {
        this.gas = gas;
        return this;
    }
    public String getGas() {
        return this.gas;
    }

    public ALiYunTransaction setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ALiYunTransaction setSignatures(java.util.List<String> signatures) {
        this.signatures = signatures;
        return this;
    }
    public java.util.List<String> getSignatures() {
        return this.signatures;
    }

    public ALiYunTransaction setExtentions(java.util.List<String> extentions) {
        this.extentions = extentions;
        return this;
    }
    public java.util.List<String> getExtentions() {
        return this.extentions;
    }

}
