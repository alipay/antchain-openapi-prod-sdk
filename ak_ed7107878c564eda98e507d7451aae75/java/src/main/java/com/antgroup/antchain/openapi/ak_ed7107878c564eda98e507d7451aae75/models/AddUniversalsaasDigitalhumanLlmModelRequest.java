// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanLlmModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 模型名称
    @NameInMap("model_name")
    @Validation(required = true)
    public String modelName;

    // 模型编码
    @NameInMap("model_code")
    @Validation(required = true)
    public String modelCode;

    // 模型图片url
    @NameInMap("image_url")
    public String imageUrl;

    // 模型描述
    @NameInMap("description")
    public String description;

    public static AddUniversalsaasDigitalhumanLlmModelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanLlmModelRequest self = new AddUniversalsaasDigitalhumanLlmModelRequest();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddUniversalsaasDigitalhumanLlmModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
