// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CapitalInfo extends TeaModel {
    // 记录流水额度
    /**
     * <strong>example:</strong>
     * <p>15.9</p>
     */
    @NameInMap("balance_log")
    @Validation(required = true)
    public String balanceLog;

    // 商户id
    /**
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 记录时间
    /**
     * <strong>example:</strong>
     * <p>12.2</p>
     */
    @NameInMap("time_log")
    @Validation(required = true)
    public Long timeLog;

    // 链上地址
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static CapitalInfo build(java.util.Map<String, ?> map) throws Exception {
        CapitalInfo self = new CapitalInfo();
        return TeaModel.build(map, self);
    }

    public CapitalInfo setBalanceLog(String balanceLog) {
        this.balanceLog = balanceLog;
        return this;
    }
    public String getBalanceLog() {
        return this.balanceLog;
    }

    public CapitalInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public CapitalInfo setTimeLog(Long timeLog) {
        this.timeLog = timeLog;
        return this;
    }
    public Long getTimeLog() {
        return this.timeLog;
    }

    public CapitalInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
