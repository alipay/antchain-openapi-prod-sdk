// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierProductItem extends TeaModel {
    // 供应商名称
    @NameInMap("supplier_name")
    public String supplierName;

    // 商品型号
    @NameInMap("product_model")
    @Validation(required = true)
    public String productModel;

    // 供应商id
    @NameInMap("supplier_id")
    public String supplierId;

    // 商品唯一id
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 3C
    @NameInMap("main_class")
    @Validation(required = true)
    public String mainClass;

    // 预计发货量
    @NameInMap("estimated_shipment")
    public Long estimatedShipment;

    // 二级类目
    @NameInMap("sub_class")
    @Validation(required = true)
    public String subClass;

    // 商品详情
    @NameInMap("product_detail_info")
    @Validation(required = true)
    public String productDetailInfo;

    // 商品品牌
    @NameInMap("product_brand")
    @Validation(required = true)
    public String productBrand;

    // 商品来源
    @NameInMap("product_origin")
    @Validation(required = true)
    public Long productOrigin;

    // 商品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 商品版本
    @NameInMap("product_version")
    @Validation(required = true)
    public Long productVersion;

    // 商品安装费用
    @NameInMap("install_price")
    public Long installPrice;

    // 实际库存
    @NameInMap("real_stock")
    public Long realStock;

    // 保证金
    @NameInMap("deposit_price")
    public Long depositPrice;

    // 商品url
    @NameInMap("product_url")
    public String productUrl;

    // 官网价
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 商品预留字段
    @NameInMap("extra_info")
    public String extraInfo;

    public static SupplierProductItem build(java.util.Map<String, ?> map) throws Exception {
        SupplierProductItem self = new SupplierProductItem();
        return TeaModel.build(map, self);
    }

    public SupplierProductItem setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public SupplierProductItem setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public SupplierProductItem setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public SupplierProductItem setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public SupplierProductItem setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public SupplierProductItem setEstimatedShipment(Long estimatedShipment) {
        this.estimatedShipment = estimatedShipment;
        return this;
    }
    public Long getEstimatedShipment() {
        return this.estimatedShipment;
    }

    public SupplierProductItem setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public SupplierProductItem setProductDetailInfo(String productDetailInfo) {
        this.productDetailInfo = productDetailInfo;
        return this;
    }
    public String getProductDetailInfo() {
        return this.productDetailInfo;
    }

    public SupplierProductItem setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public SupplierProductItem setProductOrigin(Long productOrigin) {
        this.productOrigin = productOrigin;
        return this;
    }
    public Long getProductOrigin() {
        return this.productOrigin;
    }

    public SupplierProductItem setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public SupplierProductItem setProductVersion(Long productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public Long getProductVersion() {
        return this.productVersion;
    }

    public SupplierProductItem setInstallPrice(Long installPrice) {
        this.installPrice = installPrice;
        return this;
    }
    public Long getInstallPrice() {
        return this.installPrice;
    }

    public SupplierProductItem setRealStock(Long realStock) {
        this.realStock = realStock;
        return this;
    }
    public Long getRealStock() {
        return this.realStock;
    }

    public SupplierProductItem setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

    public SupplierProductItem setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public SupplierProductItem setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public SupplierProductItem setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
