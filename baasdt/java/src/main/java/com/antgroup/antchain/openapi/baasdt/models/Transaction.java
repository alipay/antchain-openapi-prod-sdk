// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class Transaction extends TeaModel {
    // 交易数据，转换位十六进制
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 卡密管理员链上ID，64位十六进制。
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 交易hash，十六进制编码
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 交易随机数
    @NameInMap("nonce")
    @Validation(required = true)
    public Long nonce;

    // 交易时间
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // from账户对应的公钥，128位十六进制。
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // 交易签名，十六进制编码
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 交易时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 交易目标地址，64位十六进制。
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    public static Transaction build(java.util.Map<String, ?> map) throws Exception {
        Transaction self = new Transaction();
        return TeaModel.build(map, self);
    }

    public Transaction setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Transaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public Transaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public Transaction setNonce(Long nonce) {
        this.nonce = nonce;
        return this;
    }
    public Long getNonce() {
        return this.nonce;
    }

    public Transaction setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public Transaction setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public Transaction setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public Transaction setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Transaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
