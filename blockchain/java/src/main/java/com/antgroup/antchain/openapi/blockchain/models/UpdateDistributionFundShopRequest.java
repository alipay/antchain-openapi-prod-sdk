// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDistributionFundShopRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 审批中额度
    @NameInMap("approve_quota")
    @Validation(required = true)
    public String approveQuota;

    // 可提现余额
    @NameInMap("balance")
    @Validation(required = true)
    public String balance;

    // 已到账额度
    @NameInMap("finish_quota")
    @Validation(required = true)
    public String finishQuota;

    // 商户id
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    public static UpdateDistributionFundShopRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDistributionFundShopRequest self = new UpdateDistributionFundShopRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDistributionFundShopRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDistributionFundShopRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDistributionFundShopRequest setApproveQuota(String approveQuota) {
        this.approveQuota = approveQuota;
        return this;
    }
    public String getApproveQuota() {
        return this.approveQuota;
    }

    public UpdateDistributionFundShopRequest setBalance(String balance) {
        this.balance = balance;
        return this;
    }
    public String getBalance() {
        return this.balance;
    }

    public UpdateDistributionFundShopRequest setFinishQuota(String finishQuota) {
        this.finishQuota = finishQuota;
        return this;
    }
    public String getFinishQuota() {
        return this.finishQuota;
    }

    public UpdateDistributionFundShopRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

}
