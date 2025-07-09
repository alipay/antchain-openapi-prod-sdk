// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanLlmChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 大模型对话配置名称
    @NameInMap("llm_chat_name")
    @Validation(required = true)
    public String llmChatName;

    // 模型配置id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    // 大模型对话配置描述
    @NameInMap("description")
    public String description;

    // 大模型对话自定义配置明细
    @NameInMap("config")
    public String config;

    public static AddUniversalsaasDigitalhumanLlmChatRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanLlmChatRequest self = new AddUniversalsaasDigitalhumanLlmChatRequest();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setLlmChatName(String llmChatName) {
        this.llmChatName = llmChatName;
        return this;
    }
    public String getLlmChatName() {
        return this.llmChatName;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddUniversalsaasDigitalhumanLlmChatRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
