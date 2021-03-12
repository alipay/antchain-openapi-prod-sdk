// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TransactionInfo extends TeaModel {
    // 交易时间戳
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 交易hash
    @NameInMap("hash")
    @Validation(required = true)
    public String hash;

    // 交易块高
    @NameInMap("height")
    @Validation(required = true)
    public Long height;

    // 交易所在块高
    @NameInMap("blockhash")
    @Validation(required = true)
    public String blockhash;

    // 交易来源
    @NameInMap("from")
    @Validation(required = true)
    public String from;

    // 交易地址
    @NameInMap("to")
    @Validation(required = true)
    public String to;

    // 交易类型
    @NameInMap("txtype")
    @Validation(required = true)
    public Long txtype;

    // 转账额度
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // logs
    @NameInMap("logs")
    @Validation(required = true)
    public String logs;

    // 燃料消耗
    @NameInMap("gasused")
    @Validation(required = true)
    public Long gasused;

    // result
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 拓展json字段
    @NameInMap("json")
    @Validation(required = true)
    public String json;

    public static TransactionInfo build(java.util.Map<String, ?> map) throws Exception {
        TransactionInfo self = new TransactionInfo();
        return TeaModel.build(map, self);
    }

    public TransactionInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TransactionInfo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public TransactionInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public TransactionInfo setBlockhash(String blockhash) {
        this.blockhash = blockhash;
        return this;
    }
    public String getBlockhash() {
        return this.blockhash;
    }

    public TransactionInfo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public TransactionInfo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public TransactionInfo setTxtype(Long txtype) {
        this.txtype = txtype;
        return this;
    }
    public Long getTxtype() {
        return this.txtype;
    }

    public TransactionInfo setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public TransactionInfo setLogs(String logs) {
        this.logs = logs;
        return this;
    }
    public String getLogs() {
        return this.logs;
    }

    public TransactionInfo setGasused(Long gasused) {
        this.gasused = gasused;
        return this;
    }
    public Long getGasused() {
        return this.gasused;
    }

    public TransactionInfo setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public TransactionInfo setJson(String json) {
        this.json = json;
        return this;
    }
    public String getJson() {
        return this.json;
    }

}
