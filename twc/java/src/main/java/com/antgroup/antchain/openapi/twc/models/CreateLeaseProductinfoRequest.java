// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseProductinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合约id
    @NameInMap("application_id")
    public String applicationId;

    // 保证金  精确到毫厘，即123400表示12.34元
    @NameInMap("deposit_price")
    @Validation(required = true)
    public Long depositPrice;

    // 安装拆卸费 精确到毫厘，即123400表示12.34元
    @NameInMap("install_price")
    @Validation(required = true)
    public Long installPrice;

    // 租赁服务平台id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 一级分类
    @NameInMap("main_class")
    @Validation(required = true)
    public String mainClass;

    // 商品编码 长度不可超过50
    @NameInMap("product_id")
    @Validation(required = true)
    public String productId;

    // 商品名称
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 采购价  精确到毫厘，即123400表示12.34元
    @NameInMap("product_price")
    @Validation(required = true)
    public Long productPrice;

    // 出租详细信息
    @NameInMap("rentinfos")
    @Validation(required = true)
    public java.util.List<RentInfo> rentinfos;

    // 二级分类
    @NameInMap("sub_class")
    @Validation(required = true)
    public String subClass;

    // 供应商id
    @NameInMap("supplier_id")
    public String supplierId;

    // 供应商
    @NameInMap("supplier_name")
    @Validation(required = true)
    public String supplierName;

    // 供应商对该产品版本
    @NameInMap("supplier_version")
    public String supplierVersion;

    // 商品目录额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static CreateLeaseProductinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseProductinfoRequest self = new CreateLeaseProductinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseProductinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseProductinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseProductinfoRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseProductinfoRequest setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

    public CreateLeaseProductinfoRequest setInstallPrice(Long installPrice) {
        this.installPrice = installPrice;
        return this;
    }
    public Long getInstallPrice() {
        return this.installPrice;
    }

    public CreateLeaseProductinfoRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseProductinfoRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public CreateLeaseProductinfoRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateLeaseProductinfoRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateLeaseProductinfoRequest setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
        return this;
    }
    public Long getProductPrice() {
        return this.productPrice;
    }

    public CreateLeaseProductinfoRequest setRentinfos(java.util.List<RentInfo> rentinfos) {
        this.rentinfos = rentinfos;
        return this;
    }
    public java.util.List<RentInfo> getRentinfos() {
        return this.rentinfos;
    }

    public CreateLeaseProductinfoRequest setSubClass(String subClass) {
        this.subClass = subClass;
        return this;
    }
    public String getSubClass() {
        return this.subClass;
    }

    public CreateLeaseProductinfoRequest setSupplierId(String supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public String getSupplierId() {
        return this.supplierId;
    }

    public CreateLeaseProductinfoRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public CreateLeaseProductinfoRequest setSupplierVersion(String supplierVersion) {
        this.supplierVersion = supplierVersion;
        return this;
    }
    public String getSupplierVersion() {
        return this.supplierVersion;
    }

    public CreateLeaseProductinfoRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
