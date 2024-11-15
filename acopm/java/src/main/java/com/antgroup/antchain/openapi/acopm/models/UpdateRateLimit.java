// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateRateLimit extends TeaModel {
    // api_name
    @NameInMap("api_name")
    @Validation(required = true)
    public String apiName;

    // provider_id
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // update_scope_value
    @NameInMap("update_scope_value")
    @Validation(required = true)
    public UpdateScopeValue updateScopeValue;

    public static UpdateRateLimit build(java.util.Map<String, ?> map) throws Exception {
        UpdateRateLimit self = new UpdateRateLimit();
        return TeaModel.build(map, self);
    }

    public UpdateRateLimit setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public UpdateRateLimit setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public UpdateRateLimit setUpdateScopeValue(UpdateScopeValue updateScopeValue) {
        this.updateScopeValue = updateScopeValue;
        return this;
    }
    public UpdateScopeValue getUpdateScopeValue() {
        return this.updateScopeValue;
    }

}
