// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class UpdateTenantCountryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 国家代码
    @NameInMap("country_code")
    @Validation(required = true)
    public String countryCode;

    // 场景码
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    public static UpdateTenantCountryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTenantCountryRequest self = new UpdateTenantCountryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTenantCountryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTenantCountryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateTenantCountryRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public UpdateTenantCountryRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

}
