// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class UpdateUniversalsaasDigitalhumanLlmChatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 大模型对话配置编码
    @NameInMap("llm_chat_code")
    @Validation(required = true)
    public String llmChatCode;

    // 大模型对话配置名称
    @NameInMap("llm_chat_name")
    public String llmChatName;

    // 模型配置id
    @NameInMap("model_id")
    public String modelId;

    // 大模型对话配置名称
    @NameInMap("description")
    public String description;

    // 大模型对话自定义配置明细
    @NameInMap("config")
    public String config;

    public static UpdateUniversalsaasDigitalhumanLlmChatRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUniversalsaasDigitalhumanLlmChatRequest self = new UpdateUniversalsaasDigitalhumanLlmChatRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setLlmChatCode(String llmChatCode) {
        this.llmChatCode = llmChatCode;
        return this;
    }
    public String getLlmChatCode() {
        return this.llmChatCode;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setLlmChatName(String llmChatName) {
        this.llmChatName = llmChatName;
        return this;
    }
    public String getLlmChatName() {
        return this.llmChatName;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUniversalsaasDigitalhumanLlmChatRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
