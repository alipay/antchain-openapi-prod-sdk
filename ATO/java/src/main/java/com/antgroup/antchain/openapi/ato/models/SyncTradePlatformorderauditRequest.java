// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradePlatformorderauditRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商家id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 平台订单id
    @NameInMap("platform_order_id")
    @Validation(required = true)
    public String platformOrderId;

    // APPROVED同意REJECTED拒绝
    @NameInMap("operation")
    @Validation(required = true)
    public String operation;

    public static SyncTradePlatformorderauditRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradePlatformorderauditRequest self = new SyncTradePlatformorderauditRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradePlatformorderauditRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradePlatformorderauditRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradePlatformorderauditRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncTradePlatformorderauditRequest setPlatformOrderId(String platformOrderId) {
        this.platformOrderId = platformOrderId;
        return this;
    }
    public String getPlatformOrderId() {
        return this.platformOrderId;
    }

    public SyncTradePlatformorderauditRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
