// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateBclProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品编码
    // 最大长度不能超过32
    @NameInMap("product_outer_id")
    @Validation(required = true, maxLength = 32)
    public String productOuterId;

    // 商品版本;
    // 每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
    @NameInMap("product_version")
    @Validation(required = true, maxLength = 8)
    public String productVersion;

    // 商品名称，
    // 长度不超过64位
    @NameInMap("product_name")
    @Validation(required = true, maxLength = 64)
    public String productName;

    // 商品官网价格,单位为分。如：856400，表示8564元，大于0
    @NameInMap("product_price")
    @Validation(required = true, minimum = 1)
    public Long productPrice;

    // 一级行业代码，
    // 本期暂时只支持 3C，后续扩充  
    @NameInMap("main_class")
    @Validation(required = true, maxLength = 32)
    public String mainClass;

    // 二级行业代码
    // 1.手机：3c_mobile
    // 2.电脑：3c_pc
    // 3.摄影：3c_camera
    // 4.办公设备：3c_office
    // 5.3C其他：3c_other
    @NameInMap("sub_class")
    @Validation(required = true, maxLength = 32)
    public String subClass;

    // 供应商名称
    // 商品从供应商采购为供应商名称，否则为平台自己名称，最大长度不能超过64
    @NameInMap("supplier_name")
    @Validation(required = true, maxLength = 64)
    public String supplierName;

    // 供应商数字科技租户ID
    // 商品从供应商采购为供应商租户ID，否则为平台自己租户ID
    @NameInMap("supplier_id")
    @Validation(required = true, maxLength = 8)
    public String supplierId;

    // 安装服务费，单位为分，150000则表示1500元；
    // 不能为负数；
    @NameInMap("install_price")
    public Long installPrice;

    // 商品来源
    // 长度不超过32位
    // 1.供应商：SUPPLIER
    // 2.租赁机构：LEASING_COMPANY
    @NameInMap("product_origin")
    @Validation(required = true, maxLength = 32)
    public String productOrigin;

    // 实际库存量，不能为负数
    @NameInMap("real_stock")
    @Validation(required = true, minimum = 1)
    public Long realStock;

    // 预估出货量,不能为负数
    @NameInMap("estimated_shipment")
    @Validation(required = true, minimum = 1)
    public Long estimatedShipment;

    // 商品详情
    // 最大长度不能超过256
    @NameInMap("product_detail_info")
    @Validation(required = true, maxLength = 256)
    public String productDetailInfo;

    // 商品链接
    // 最大长度不能超过256
    @NameInMap("product_url")
    @Validation(required = true, maxLength = 256)
    public String productUrl;

    // 商品品牌
    // 最大长度不能超过64
    @NameInMap("product_brand")
    @Validation(required = true, maxLength = 64)
    public String productBrand;

    // 产品规格
    // 识别物品的编号，最大长度不能超过256
    @NameInMap("product_model")
    @Validation(required = true, maxLength = 256)
    public String productModel;

    // 免押金额，单位：分
    // 示例：15600表示免押金额为156元，最小值需大于0
    @NameInMap("deposit_price")
    public Long depositPrice;

    public static CreateBclProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBclProductRequest self = new CreateBclProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateBclProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBclProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBclProductRequest setProductOuterId(String productOuterId) {
        this.productOuterId = productOuterId;
        return this;
    }
    public String getProductOuterId() {
        return this.productOuterId;
    }

    public CreateBclProductRequest setProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }
    public String getProductVersion() {
        return this.productVersion;
    }

    public CreateBclProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateBclProductRequest setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public CreateBclProductRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public CreateBclProductRequest setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public CreateBclProductRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public CreateBclProductRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public CreateBclProductRequest setInstallPrice(Long installPrice) {
        this.installPrice = installPrice;
        return this;
    }
    public Long getInstallPrice() {
        return this.installPrice;
    }

    public CreateBclProductRequest setProductOrigin(String productOrigin) {
        this.productOrigin = productOrigin;
        return this;
    }
    public String getProductOrigin() {
        return this.productOrigin;
    }

    public CreateBclProductRequest setRealStock(Long realStock) {
        this.realStock = realStock;
        return this;
    }
    public Long getRealStock() {
        return this.realStock;
    }

    public CreateBclProductRequest setEstimatedShipment(Long estimatedShipment) {
        this.estimatedShipment = estimatedShipment;
        return this;
    }
    public Long getEstimatedShipment() {
        return this.estimatedShipment;
    }

    public CreateBclProductRequest setProductDetailInfo(String productDetailInfo) {
        this.productDetailInfo = productDetailInfo;
        return this;
    }
    public String getProductDetailInfo() {
        return this.productDetailInfo;
    }

    public CreateBclProductRequest setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public CreateBclProductRequest setProductBrand(String productBrand) {
        this.productBrand = productBrand;
        return this;
    }
    public String getProductBrand() {
        return this.productBrand;
    }

    public CreateBclProductRequest setProductModel(String productModel) {
        this.productModel = productModel;
        return this;
    }
    public String getProductModel() {
        return this.productModel;
    }

    public CreateBclProductRequest setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

}
