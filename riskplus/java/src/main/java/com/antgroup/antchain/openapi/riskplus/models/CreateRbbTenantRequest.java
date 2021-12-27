// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateRbbTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户过期时间，不填表示永不过期
    @NameInMap("effective_end_date")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effectiveEndDate;

    // 租户编码，必须全局唯一
    @NameInMap("tenant_code")
    @Validation(required = true, maxLength = 64, minLength = 2)
    public String tenantCode;

    // 租户名称
    @NameInMap("tenant_name")
    @Validation(required = true, maxLength = 64, minLength = 2)
    public String tenantName;

    // 租户自定义属性，JSON格式，可以为空
    @NameInMap("tenant_property_json")
    public String tenantPropertyJson;

    public static CreateRbbTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbbTenantRequest self = new CreateRbbTenantRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbbTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRbbTenantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRbbTenantRequest setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
        return this;
    }
    public String getEffectiveEndDate() {
        return this.effectiveEndDate;
    }

    public CreateRbbTenantRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public CreateRbbTenantRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateRbbTenantRequest setTenantPropertyJson(String tenantPropertyJson) {
        this.tenantPropertyJson = tenantPropertyJson;
        return this;
    }
    public String getTenantPropertyJson() {
        return this.tenantPropertyJson;
    }

}
