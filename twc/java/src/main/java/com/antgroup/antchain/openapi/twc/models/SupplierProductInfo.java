// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierProductInfo extends TeaModel {
    // 产品额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 产品id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 电子商品唯一标识码
    @NameInMap("product_imei_id")
    @Validation(required = true)
    public String productImeiId;

    // 产品名称
    @NameInMap("product_name")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String productName;

    // 采购产品的个数
    @NameInMap("product_number")
    @Validation(required = true)
    public Long productNumber;

    // 采购产品的价格，精确到毫厘，如12.34元表示为123400
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 产品版本
    @NameInMap("supplier_version")
    public String supplierVersion;

    public static SupplierProductInfo build(java.util.Map<String, ?> map) throws Exception {
        SupplierProductInfo self = new SupplierProductInfo();
        return TeaModel.build(map, self);
    }

    public SupplierProductInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public SupplierProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SupplierProductInfo setProductImeiId(String productImeiId) {
        this.productImeiId = productImeiId;
        return this;
    }
    public String getProductImeiId() {
        return this.productImeiId;
    }

    public SupplierProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SupplierProductInfo setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
        return this;
    }
    public Long getProductNumber() {
        return this.productNumber;
    }

    public SupplierProductInfo setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public SupplierProductInfo setSupplierVersion(String supplierVersion) {
        this.supplierVersion = supplierVersion;
        return this;
    }
    public String getSupplierVersion() {
        return this.supplierVersion;
    }

}
