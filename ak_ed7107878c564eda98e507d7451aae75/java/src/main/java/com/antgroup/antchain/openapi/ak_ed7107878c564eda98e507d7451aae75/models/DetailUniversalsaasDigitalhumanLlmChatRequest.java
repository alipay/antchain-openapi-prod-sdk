// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class DetailUniversalsaasDigitalhumanLlmChatRequest extends TeaModel {
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

    public static DetailUniversalsaasDigitalhumanLlmChatRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailUniversalsaasDigitalhumanLlmChatRequest self = new DetailUniversalsaasDigitalhumanLlmChatRequest();
        return TeaModel.build(map, self);
    }

    public DetailUniversalsaasDigitalhumanLlmChatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailUniversalsaasDigitalhumanLlmChatRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailUniversalsaasDigitalhumanLlmChatRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public DetailUniversalsaasDigitalhumanLlmChatRequest setLlmChatCode(String llmChatCode) {
        this.llmChatCode = llmChatCode;
        return this;
    }
    public String getLlmChatCode() {
        return this.llmChatCode;
    }

}
