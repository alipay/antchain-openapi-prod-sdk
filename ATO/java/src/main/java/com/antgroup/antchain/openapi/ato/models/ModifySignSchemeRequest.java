// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ModifySignSchemeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号，须为商户名下短租订单，且尚未发起签约
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 调整后的押金方案，JSON 字符串，参考 RentalSignSchemeModRequest 定义
    @NameInMap("scheme_info")
    @Validation(required = true)
    public RentalSignSchemeModRequest schemeInfo;

    public static ModifySignSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySignSchemeRequest self = new ModifySignSchemeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySignSchemeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ModifySignSchemeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ModifySignSchemeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ModifySignSchemeRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ModifySignSchemeRequest setSchemeInfo(RentalSignSchemeModRequest schemeInfo) {
        this.schemeInfo = schemeInfo;
        return this;
    }
    public RentalSignSchemeModRequest getSchemeInfo() {
        return this.schemeInfo;
    }

}
