// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListServiceRollbackversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // limit
    @NameInMap("limit")
    public Long limit;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ListServiceRollbackversionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRollbackversionRequest self = new ListServiceRollbackversionRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceRollbackversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListServiceRollbackversionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ListServiceRollbackversionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListServiceRollbackversionRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ListServiceRollbackversionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
