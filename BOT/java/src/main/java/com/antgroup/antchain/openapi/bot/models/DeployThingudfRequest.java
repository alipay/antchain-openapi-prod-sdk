// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeployThingudfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // UDF 唯一ID
    @NameInMap("udf_id")
    @Validation(required = true)
    public String udfId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 物模型功能ID
    @NameInMap("feature_id")
    @Validation(required = true)
    public String featureId;

    // 租户ID
    @NameInMap("customer_tenant")
    @Validation(required = true)
    public String customerTenant;

    // UDF类型枚举
    @NameInMap("udf_type")
    @Validation(required = true)
    public String udfType;

    // 物模型UDF实例表
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static DeployThingudfRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployThingudfRequest self = new DeployThingudfRequest();
        return TeaModel.build(map, self);
    }

    public DeployThingudfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeployThingudfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeployThingudfRequest setUdfId(String udfId) {
        this.udfId = udfId;
        return this;
    }
    public String getUdfId() {
        return this.udfId;
    }

    public DeployThingudfRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DeployThingudfRequest setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

    public DeployThingudfRequest setCustomerTenant(String customerTenant) {
        this.customerTenant = customerTenant;
        return this;
    }
    public String getCustomerTenant() {
        return this.customerTenant;
    }

    public DeployThingudfRequest setUdfType(String udfType) {
        this.udfType = udfType;
        return this;
    }
    public String getUdfType() {
        return this.udfType;
    }

    public DeployThingudfRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
