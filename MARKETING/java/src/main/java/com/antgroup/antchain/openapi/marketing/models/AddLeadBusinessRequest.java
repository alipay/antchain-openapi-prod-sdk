// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class AddLeadBusinessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商机信息
    @NameInMap("request")
    @Validation(required = true)
    public java.util.List<BusinessRequest> request;

    // 线索服务化，多租户模型
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    public static AddLeadBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLeadBusinessRequest self = new AddLeadBusinessRequest();
        return TeaModel.build(map, self);
    }

    public AddLeadBusinessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddLeadBusinessRequest setRequest(java.util.List<BusinessRequest> request) {
        this.request = request;
        return this;
    }
    public java.util.List<BusinessRequest> getRequest() {
        return this.request;
    }

    public AddLeadBusinessRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
