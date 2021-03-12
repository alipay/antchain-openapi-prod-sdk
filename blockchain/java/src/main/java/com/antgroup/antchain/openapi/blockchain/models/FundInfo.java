// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class FundInfo extends TeaModel {
    // 可提现余额
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 待结算额度
    @NameInMap("settle_quota")
    @Validation(required = true)
    public String settleQuota;

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    public static FundInfo build(java.util.Map<String, ?> map) throws Exception {
        FundInfo self = new FundInfo();
        return TeaModel.build(map, self);
    }

    public FundInfo setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public FundInfo setSettleQuota(String settleQuota) {
        this.settleQuota = settleQuota;
        return this;
    }
    public String getSettleQuota() {
        return this.settleQuota;
    }

    public FundInfo setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
