// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class RateLimitDetail extends TeaModel {
    // apiName
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // provider_id
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 已使用量
    @NameInMap("used")
    public Long used;

    // effectScope
    @NameInMap("effect_scope")
    public RateLimitEffectScopeDTO effectScope;

    public static RateLimitDetail build(java.util.Map<String, ?> map) throws Exception {
        RateLimitDetail self = new RateLimitDetail();
        return TeaModel.build(map, self);
    }

    public RateLimitDetail setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public RateLimitDetail setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public RateLimitDetail setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RateLimitDetail setUsed(Long used) {
        this.used = used;
        return this;
    }
    public Long getUsed() {
        return this.used;
    }

    public RateLimitDetail setEffectScope(RateLimitEffectScopeDTO effectScope) {
        this.effectScope = effectScope;
        return this;
    }
    public RateLimitEffectScopeDTO getEffectScope() {
        return this.effectScope;
    }

}
