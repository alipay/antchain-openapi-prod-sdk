// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockTransaction extends TeaModel {
    // 交易信息
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 交易扩展信息
    @NameInMap("extension")
    @Validation(required = true)
    public java.util.List<Extension> extension;

    // 交易发起方
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 交易gas消耗
    @NameInMap("gas")
    @Validation(required = true)
    public Long gas;

    // 分组id，暂时没用
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 交易哈希
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 交易随机数
    @NameInMap("nonce")
    @Validation(required = true)
    public String nonce;

    // 交易时间
    @NameInMap("period")
    @Validation(required = true)
    public Long period;

    // 交易签名
    @NameInMap("signature")
    @Validation(required = true)
    public java.util.List<String> signature;

    // 交易时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 交易接收方
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 2
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 交易转账金额
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 2
    @NameInMap("version")
    @Validation(required = true)
    public Long version;

    public static BlockTransaction build(java.util.Map<String, ?> map) throws Exception {
        BlockTransaction self = new BlockTransaction();
        return TeaModel.build(map, self);
    }

    public BlockTransaction setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BlockTransaction setExtension(java.util.List<Extension> extension) {
        this.extension = extension;
        return this;
    }
    public java.util.List<Extension> getExtension() {
        return this.extension;
    }

    public BlockTransaction setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BlockTransaction setGas(Long gas) {
        this.gas = gas;
        return this;
    }
    public Long getGas() {
        return this.gas;
    }

    public BlockTransaction setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public BlockTransaction setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public BlockTransaction setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public BlockTransaction setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public BlockTransaction setSignature(java.util.List<String> signature) {
        this.signature = signature;
        return this;
    }
    public java.util.List<String> getSignature() {
        return this.signature;
    }

    public BlockTransaction setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public BlockTransaction setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public BlockTransaction setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public BlockTransaction setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public BlockTransaction setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
