// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ProductKeyModel extends TeaModel {
    // 主键id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 设备端ProductKey
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 租户Id 
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 数据模型id 
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // sdk前缀
    @NameInMap("sdk_version_prefix")
    @Validation(required = true)
    public String sdkVersionPrefix;

    // 制造商
    @NameInMap("manufacturer")
    public String manufacturer;

    // 顾客
    @NameInMap("customer")
    public String customer;

    public static ProductKeyModel build(java.util.Map<String, ?> map) throws Exception {
        ProductKeyModel self = new ProductKeyModel();
        return TeaModel.build(map, self);
    }

    public ProductKeyModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProductKeyModel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ProductKeyModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ProductKeyModel setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ProductKeyModel setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ProductKeyModel setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ProductKeyModel setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public ProductKeyModel setSdkVersionPrefix(String sdkVersionPrefix) {
        this.sdkVersionPrefix = sdkVersionPrefix;
        return this;
    }
    public String getSdkVersionPrefix() {
        return this.sdkVersionPrefix;
    }

    public ProductKeyModel setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public ProductKeyModel setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

}
