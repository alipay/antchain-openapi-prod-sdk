// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseOrderProductInfo extends TeaModel {
    // 商品编码 长度不可超过50
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 产品版本，每个版本可以对应一个价格 长度不可超过50，版本号未正整数，示例"123"
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("product_version")
    @Validation(required = true)
    public String productVersion;

    // 商品名称 长度不可超过50
    /**
     * <strong>example:</strong>
     * <p>iphone13</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 采购价  精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 供应商Id，用以做索引 长度不可超过50
    /**
     * <strong>example:</strong>
     * <p>小米</p>
     */
    @NameInMap("supplier_isv_account")
    @Validation(required = true)
    public String supplierIsvAccount;

    public static LeaseOrderProductInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseOrderProductInfo self = new LeaseOrderProductInfo();
        return TeaModel.build(map, self);
    }

    public LeaseOrderProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public LeaseOrderProductInfo setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public LeaseOrderProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public LeaseOrderProductInfo setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public LeaseOrderProductInfo setSupplierIsvAccount(String supplierIsvAccount) {
        this.supplierIsvAccount = supplierIsvAccount;
        return this;
    }
    public String getSupplierIsvAccount() {
        return this.supplierIsvAccount;
    }

}
