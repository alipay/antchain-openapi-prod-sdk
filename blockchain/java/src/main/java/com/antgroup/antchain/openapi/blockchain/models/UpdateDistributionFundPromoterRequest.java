// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDistributionFundPromoterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可提现余额
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 推广人id
    @NameInMap("promoter_id")
    @Validation(required = true)
    public String promoterId;

    // 待结算
    @NameInMap("settle_quota")
    @Validation(required = true)
    public String settleQuota;

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    public static UpdateDistributionFundPromoterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributionFundPromoterRequest self = new UpdateDistributionFundPromoterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDistributionFundPromoterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDistributionFundPromoterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDistributionFundPromoterRequest setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public UpdateDistributionFundPromoterRequest setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

    public UpdateDistributionFundPromoterRequest setSettleQuota(String settleQuota) {
        this.settleQuota = settleQuota;
        return this;
    }
    public String getSettleQuota() {
        return this.settleQuota;
    }

    public UpdateDistributionFundPromoterRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
