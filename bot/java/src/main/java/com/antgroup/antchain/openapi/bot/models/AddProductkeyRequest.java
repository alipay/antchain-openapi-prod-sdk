// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddProductkeyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备端productKey
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 租户ID
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // 数据模型
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // sdk前缀
    @NameInMap("sdk_version_prefix")
    @Validation(required = true)
    public String sdkVersionPrefix;

    // 制造商
    @NameInMap("manufacturer")
    @Validation(required = true)
    public String manufacturer;

    // 顾客
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 是否为测试数据
    @NameInMap("mock")
    public Boolean mock;

    public static AddProductkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductkeyRequest self = new AddProductkeyRequest();
        return TeaModel.build(map, self);
    }

    public AddProductkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddProductkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddProductkeyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public AddProductkeyRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddProductkeyRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public AddProductkeyRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public AddProductkeyRequest setSdkVersionPrefix(String sdkVersionPrefix) {
        this.sdkVersionPrefix = sdkVersionPrefix;
        return this;
    }
    public String getSdkVersionPrefix() {
        return this.sdkVersionPrefix;
    }

    public AddProductkeyRequest setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }

    public AddProductkeyRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public AddProductkeyRequest setMock(Boolean mock) {
        this.mock = mock;
        return this;
    }
    public Boolean getMock() {
        return this.mock;
    }

}
