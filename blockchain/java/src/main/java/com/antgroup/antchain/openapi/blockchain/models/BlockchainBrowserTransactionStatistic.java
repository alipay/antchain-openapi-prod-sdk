// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BlockchainBrowserTransactionStatistic extends TeaModel {
    // 蚂蚁链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 开始时间
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 时间点
    @NameInMap("date_time")
    @Validation(required = true)
    public String dateTime;

    // 统计时间内最新块高度
    @NameInMap("last_sum_block_height")
    @Validation(required = true)
    public Long lastSumBlockHeight;

    // 统计周期内交易的数量
    @NameInMap("trans_count")
    @Validation(required = true)
    public Long transCount;

    public static BlockchainBrowserTransactionStatistic build(java.util.Map<String, ?> map) throws Exception {
        BlockchainBrowserTransactionStatistic self = new BlockchainBrowserTransactionStatistic();
        return TeaModel.build(map, self);
    }

    public BlockchainBrowserTransactionStatistic setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public BlockchainBrowserTransactionStatistic setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BlockchainBrowserTransactionStatistic setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public BlockchainBrowserTransactionStatistic setLastSumBlockHeight(Long lastSumBlockHeight) {
        this.lastSumBlockHeight = lastSumBlockHeight;
        return this;
    }
    public Long getLastSumBlockHeight() {
        return this.lastSumBlockHeight;
    }

    public BlockchainBrowserTransactionStatistic setTransCount(Long transCount) {
        this.transCount = transCount;
        return this;
    }
    public Long getTransCount() {
        return this.transCount;
    }

}
