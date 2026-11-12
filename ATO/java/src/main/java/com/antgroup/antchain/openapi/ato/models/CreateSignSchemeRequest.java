// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSignSchemeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单且处于已进件状态（未建单）
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 初始押金方案，JSON 字符串，参考 RentalSignSchemeCreateRequest 定义
    @NameInMap("scheme_info")
    @Validation(required = true)
    public RentalSignSchemeCreateRequest schemeInfo;

    public static CreateSignSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSignSchemeRequest self = new CreateSignSchemeRequest();
        return TeaModel.build(map, self);
    }

    public CreateSignSchemeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSignSchemeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSignSchemeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSignSchemeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateSignSchemeRequest setSchemeInfo(RentalSignSchemeCreateRequest schemeInfo) {
        this.schemeInfo = schemeInfo;
        return this;
    }
    public RentalSignSchemeCreateRequest getSchemeInfo() {
        return this.schemeInfo;
    }

}
