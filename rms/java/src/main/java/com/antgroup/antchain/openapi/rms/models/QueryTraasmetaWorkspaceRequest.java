// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    public String uuid;

    // name
    @NameInMap("name")
    public String name;

    // 是否是模糊搜索，默认为false
    @NameInMap("search")
    @Validation(required = true)
    public Boolean search;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    public static QueryTraasmetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaWorkspaceRequest self = new QueryTraasmetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraasmetaWorkspaceRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public QueryTraasmetaWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryTraasmetaWorkspaceRequest setSearch(Boolean search) {
        this.search = search;
        return this;
    }
    public Boolean getSearch() {
        return this.search;
    }

    public QueryTraasmetaWorkspaceRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public QueryTraasmetaWorkspaceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
