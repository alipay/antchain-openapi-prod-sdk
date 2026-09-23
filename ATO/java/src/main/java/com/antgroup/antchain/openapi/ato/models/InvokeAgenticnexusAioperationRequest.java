// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class InvokeAgenticnexusAioperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 业务场景标识
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 场景特定业务字段键值
    @NameInMap("biz_request")
    public String bizRequest;

    // 调用方系统名(
    @NameInMap("sys_name")
    @Validation(required = true)
    public String sysName;

    // 链路 ID
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static InvokeAgenticnexusAioperationRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeAgenticnexusAioperationRequest self = new InvokeAgenticnexusAioperationRequest();
        return TeaModel.build(map, self);
    }

    public InvokeAgenticnexusAioperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InvokeAgenticnexusAioperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InvokeAgenticnexusAioperationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public InvokeAgenticnexusAioperationRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public InvokeAgenticnexusAioperationRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public InvokeAgenticnexusAioperationRequest setBizRequest(String bizRequest) {
        this.bizRequest = bizRequest;
        return this;
    }
    public String getBizRequest() {
        return this.bizRequest;
    }

    public InvokeAgenticnexusAioperationRequest setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }
    public String getSysName() {
        return this.sysName;
    }

    public InvokeAgenticnexusAioperationRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
