// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainStatus extends TeaModel {
    // 链ID
    @NameInMap("biz_id")
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 主链ID
    @NameInMap("parent_biz_id")
    public String parentBizId;

    // 当前区块高度
    @NameInMap("ledger_height")
    public Long ledgerHeight;

    // 交易总量
    @NameInMap("tx_count")
    public Long txCount;

    // 链状态，ok, fail
    @NameInMap("status")
    public String status;

    public static ChainStatus build(java.util.Map<String, ?> map) throws Exception {
        ChainStatus self = new ChainStatus();
        return TeaModel.build(map, self);
    }

    public ChainStatus setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainStatus setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainStatus setParentBizId(String parentBizId) {
        this.parentBizId = parentBizId;
        return this;
    }
    public String getParentBizId() {
        return this.parentBizId;
    }

    public ChainStatus setLedgerHeight(Long ledgerHeight) {
        this.ledgerHeight = ledgerHeight;
        return this;
    }
    public Long getLedgerHeight() {
        return this.ledgerHeight;
    }

    public ChainStatus setTxCount(Long txCount) {
        this.txCount = txCount;
        return this;
    }
    public Long getTxCount() {
        return this.txCount;
    }

    public ChainStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
