// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightSearchStatus extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // Indexing,Enabled,Disabled
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 当前索引的区块高度
    @NameInMap("current_height")
    public Long currentHeight;

    // 当前区块链高度
    @NameInMap("ledger_height")
    public Long ledgerHeight;

    // 预计索引完成的时间，单位秒
    @NameInMap("estimate_time")
    public Long estimateTime;

    public static ChainInsightSearchStatus build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightSearchStatus self = new ChainInsightSearchStatus();
        return TeaModel.build(map, self);
    }

    public ChainInsightSearchStatus setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightSearchStatus setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightSearchStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ChainInsightSearchStatus setCurrentHeight(Long currentHeight) {
        this.currentHeight = currentHeight;
        return this;
    }
    public Long getCurrentHeight() {
        return this.currentHeight;
    }

    public ChainInsightSearchStatus setLedgerHeight(Long ledgerHeight) {
        this.ledgerHeight = ledgerHeight;
        return this;
    }
    public Long getLedgerHeight() {
        return this.ledgerHeight;
    }

    public ChainInsightSearchStatus setEstimateTime(Long estimateTime) {
        this.estimateTime = estimateTime;
        return this;
    }
    public Long getEstimateTime() {
        return this.estimateTime;
    }

}
