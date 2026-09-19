// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ProductItem extends TeaModel {
    // 订单商品类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（积分商品订单专用，区分普通实物商品）、MEMBER-会员订阅
    /**
     * <strong>example:</strong>
     * <p>PET</p>
     */
    @NameInMap("product_type")
    @Validation(required = true)
    public String productType;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 商品金额，单位元，两位小数
    /**
     * <strong>example:</strong>
     * <p>99.22</p>
     */
    @NameInMap("product_amount")
    @Validation(required = true)
    public String productAmount;

    // 该行商品收款主体
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static ProductItem build(java.util.Map<String, ?> map) throws Exception {
        ProductItem self = new ProductItem();
        return TeaModel.build(map, self);
    }

    public ProductItem setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ProductItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductItem setProductAmount(String productAmount) {
        this.productAmount = productAmount;
        return this;
    }
    public String getProductAmount() {
        return this.productAmount;
    }

    public ProductItem setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
