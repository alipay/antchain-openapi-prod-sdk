// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateAppgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // domain tree
    @NameInMap("domain")
    @Validation(required = true)
    public AppDomainFlatten domain;

    // 占位
    @NameInMap("tenant_id")
    public String tenantId;

    public static CreateAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppgroupRequest self = new CreateAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAppgroupRequest setDomain(AppDomainFlatten domain) {
        this.domain = domain;
        return this;
    }
    public AppDomainFlatten getDomain() {
        return this.domain;
    }

    public CreateAppgroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
