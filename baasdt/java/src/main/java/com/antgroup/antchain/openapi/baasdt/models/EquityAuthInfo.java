// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class EquityAuthInfo extends TeaModel {
    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 授权租户
    @NameInMap("open_to_tenant_id")
    @Validation(required = true)
    public String openToTenantId;

    // 租户价格（自定义价格）
    @NameInMap("tenant_price")
    @Validation(required = true)
    public String tenantPrice;

    // 区块高度
    @NameInMap("block_number")
    @Validation(required = true)
    public String blockNumber;

    // 交易hash
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 区块时间戳
    @NameInMap("block_time")
    @Validation(required = true)
    public Long blockTime;

    public static EquityAuthInfo build(java.util.Map<String, ?> map) throws Exception {
        EquityAuthInfo self = new EquityAuthInfo();
        return TeaModel.build(map, self);
    }

    public EquityAuthInfo setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public EquityAuthInfo setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public EquityAuthInfo setOpenToTenantId(String openToTenantId) {
        this.openToTenantId = openToTenantId;
        return this;
    }
    public String getOpenToTenantId() {
        return this.openToTenantId;
    }

    public EquityAuthInfo setTenantPrice(String tenantPrice) {
        this.tenantPrice = tenantPrice;
        return this;
    }
    public String getTenantPrice() {
        return this.tenantPrice;
    }

    public EquityAuthInfo setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public String getBlockNumber() {
        return this.blockNumber;
    }

    public EquityAuthInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public EquityAuthInfo setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }
    public Long getBlockTime() {
        return this.blockTime;
    }

}
