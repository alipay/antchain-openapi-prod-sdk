// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ProductInfo extends TeaModel {
    // 是否需要创建did
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("need_did")
    public Boolean needDid;

    // 产品品牌，长度不超过50
    /**
     * <strong>example:</strong>
     * <p>大金</p>
     */
    @NameInMap("product_brand")
    public String productBrand;

    // 产品Id，长度不超过50
    /**
     * <strong>example:</strong>
     * <p>productId</p>
     */
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 唯一标识码，imeiID，长度不超过50
    /**
     * <strong>example:</strong>
     * <p>sn_number</p>
     */
    @NameInMap("product_imei_id")
    public String productImeiId;

    // 产品规格型号，长度不超过255
    /**
     * <strong>example:</strong>
     * <p>LP3001</p>
     */
    @NameInMap("product_model")
    public String productModel;

    // 产品名称，长度不超过50
    /**
     * <strong>example:</strong>
     * <p>大金空调</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 产品数量
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("product_number")
    @Validation(required = true)
    public Long productNumber;

    // 产品采购含税价 精确到毫厘，即123400表示12.34元
    /**
     * <strong>example:</strong>
     * <p>123400</p>
     */
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 供应商id
    /**
     * <strong>example:</strong>
     * <p>supplierId</p>
     */
    @NameInMap("supplier_id")
    public String supplierId;

    // 供应商对应的产品版本，每个版本可以对应一个价格
    /**
     * <strong>example:</strong>
     * <p>001</p>
     */
    @NameInMap("supplier_version")
    public String supplierVersion;

    // 额外字段
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

    public static ProductInfo build(java.util.Map<String, ?> map) throws Exception {
        ProductInfo self = new ProductInfo();
        return TeaModel.build(map, self);
    }

    public ProductInfo setNeedDid(Boolean needDid) {
        this.needDid = needDid;
        return this;
    }
    public Boolean getNeedDid() {
        return this.needDid;
    }

    public ProductInfo setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public ProductInfo setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ProductInfo setProductImeiId(String productImeiId) {
        this.productImeiId = productImeiId;
        return this;
    }
    public String getProductImeiId() {
        return this.productImeiId;
    }

    public ProductInfo setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public ProductInfo setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ProductInfo setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
        return this;
    }
    public Long getProductNumber() {
        return this.productNumber;
    }

    public ProductInfo setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public ProductInfo setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public ProductInfo setSupplierVersion(String supplierVersion) {
        this.supplierVersion = supplierVersion;
        return this;
    }
    public String getSupplierVersion() {
        return this.supplierVersion;
    }

    public ProductInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
