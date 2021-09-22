// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateProductkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主键id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 设备端productKey
    // 
    @NameInMap("product_key")
    public String productKey;

    // 场景码
    // 
    @NameInMap("scene")
    public String scene;

    // 租户ID
    // 
    @NameInMap("tenant_name")
    public String tenantName;

    // 数据模型
    // 
    @NameInMap("data_model_id")
    public String dataModelId;

    // sdk前缀
    @NameInMap("sdk_version_prefix")
    public String sdkVersionPrefix;

    // 制造商
    // 
    @NameInMap("manufacturer")
    public String manufacturer;

    // 顾客
    @NameInMap("customer")
    public String customer;

    public static UpdateProductkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductkeyRequest self = new UpdateProductkeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateProductkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateProductkeyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateProductkeyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateProductkeyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateProductkeyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateProductkeyRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public UpdateProductkeyRequest setSdkVersionPrefix(String sdkVersionPrefix) {
        this.sdkVersionPrefix = sdkVersionPrefix;
        return this;
    }
    public String getSdkVersionPrefix() {
        return this.sdkVersionPrefix;
    }

    public UpdateProductkeyRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public UpdateProductkeyRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

}
