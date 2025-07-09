// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class UpdateUniversalsaasDigitalhumanLlmModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 模型编码
    @NameInMap("model_code")
    public String modelCode;

    // 模型名称
    @NameInMap("model_name")
    public String modelName;

    // 模型描述
    @NameInMap("description")
    public String description;

    // 模型图片url
    @NameInMap("image_url")
    public String imageUrl;

    public static UpdateUniversalsaasDigitalhumanLlmModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUniversalsaasDigitalhumanLlmModelRequest self = new UpdateUniversalsaasDigitalhumanLlmModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUniversalsaasDigitalhumanLlmModelRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
