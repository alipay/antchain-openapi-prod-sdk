// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ProductInfo extends TeaModel {
    // 商家社会统一信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 商品名称
    @NameInMap("product_name")
    public String productName;

    // 商品id
    @NameInMap("product_id")
    public String productId;

    // 商品规格
    @NameInMap("product_model")
    public String productModel;

    // 商品版本
    @NameInMap("product_version")
    public String productVersion;

    // 指导价(单位分)
    @NameInMap("product_price")
    public Long productPrice;

    // 一级类目
    @NameInMap("main_class")
    public String mainClass;

    // 二级类目
    @NameInMap("sub_class")
    public String subClass;

    // 品牌
    @NameInMap("product_brand")
    public String productBrand;

    public static ProductInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductInfo self = new ProductInfo();
        return TeaModel.build(map, self);
    }

    public ProductInfo setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ProductInfo setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public ProductInfo setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public ProductInfo setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public ProductInfo setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public ProductInfo setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public ProductInfo setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

}
