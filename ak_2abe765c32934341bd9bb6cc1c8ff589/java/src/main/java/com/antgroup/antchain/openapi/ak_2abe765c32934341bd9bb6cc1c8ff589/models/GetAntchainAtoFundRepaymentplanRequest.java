// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class GetAntchainAtoFundRepaymentplanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id，不可为空
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商户在数科注册的tenantId，不可为空
    @NameInMap("merchant_tenant_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String merchantTenantId;

    // 用户的支付宝uid
    @NameInMap("alipay_uid")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String alipayUid;

    public static GetAntchainAtoFundRepaymentplanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoFundRepaymentplanRequest self = new GetAntchainAtoFundRepaymentplanRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoFundRepaymentplanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainAtoFundRepaymentplanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainAtoFundRepaymentplanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoFundRepaymentplanRequest setMerchantTenantId(String merchantTenantId) {
        this.merchantTenantId = merchantTenantId;
        return this;
    }
    public String getMerchantTenantId() {
        return this.merchantTenantId;
    }

    public GetAntchainAtoFundRepaymentplanRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
