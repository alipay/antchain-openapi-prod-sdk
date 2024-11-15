// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryTenantRatelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户id
    @NameInMap("tenant_id_list")
    @Validation(required = true)
    public java.util.List<String> tenantIdList;

    // api名
    @NameInMap("api_name_list")
    @Validation(required = true)
    public java.util.List<String> apiNameList;

    public static QueryTenantRatelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantRatelimitRequest self = new QueryTenantRatelimitRequest();
        return TeaModel.build(map, self);
    }

    public QueryTenantRatelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTenantRatelimitRequest setTenantIdList(java.util.List<String> tenantIdList) {
        this.tenantIdList = tenantIdList;
        return this;
    }
    public java.util.List<String> getTenantIdList() {
        return this.tenantIdList;
    }

    public QueryTenantRatelimitRequest setApiNameList(java.util.List<String> apiNameList) {
        this.apiNameList = apiNameList;
        return this;
    }
    public java.util.List<String> getApiNameList() {
        return this.apiNameList;
    }

}
