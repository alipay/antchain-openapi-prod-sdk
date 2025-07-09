// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class DeleteUniversalsaasDigitalhumanLlmModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模型编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 模型id
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    public static DeleteUniversalsaasDigitalhumanLlmModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniversalsaasDigitalhumanLlmModelRequest self = new DeleteUniversalsaasDigitalhumanLlmModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUniversalsaasDigitalhumanLlmModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteUniversalsaasDigitalhumanLlmModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteUniversalsaasDigitalhumanLlmModelRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public DeleteUniversalsaasDigitalhumanLlmModelRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

}
