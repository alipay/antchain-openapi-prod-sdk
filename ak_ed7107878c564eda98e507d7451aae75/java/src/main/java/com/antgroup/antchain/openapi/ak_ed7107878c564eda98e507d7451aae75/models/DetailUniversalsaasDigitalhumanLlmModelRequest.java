// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class DetailUniversalsaasDigitalhumanLlmModelRequest extends TeaModel {
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

    public static DetailUniversalsaasDigitalhumanLlmModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailUniversalsaasDigitalhumanLlmModelRequest self = new DetailUniversalsaasDigitalhumanLlmModelRequest();
        return TeaModel.build(map, self);
    }

    public DetailUniversalsaasDigitalhumanLlmModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailUniversalsaasDigitalhumanLlmModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailUniversalsaasDigitalhumanLlmModelRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public DetailUniversalsaasDigitalhumanLlmModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
