// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightTransactionInfo extends TeaModel {
    // 交易ID
    @NameInMap("id")
    public String id;

    // 交易类型
    @NameInMap("type")
    public String type;

    // 交易发起者
    @NameInMap("from")
    public String from;

    // 交易接收者
    @NameInMap("to")
    public String to;

    // 交易成块高度
    @NameInMap("height")
    public Long height;

    // 交易成块时间，毫秒时间戳
    @NameInMap("timestamp")
    public Long timestamp;

    // 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
    @NameInMap("abi_status")
    public String abiStatus;

    public static ChainInsightTransactionInfo build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightTransactionInfo self = new ChainInsightTransactionInfo();
        return TeaModel.build(map, self);
    }

    public ChainInsightTransactionInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainInsightTransactionInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightTransactionInfo setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ChainInsightTransactionInfo setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

    public ChainInsightTransactionInfo setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ChainInsightTransactionInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ChainInsightTransactionInfo setAbiStatus(String abiStatus) {
        this.abiStatus = abiStatus;
        return this;
    }
    public String getAbiStatus() {
        return this.abiStatus;
    }

}
