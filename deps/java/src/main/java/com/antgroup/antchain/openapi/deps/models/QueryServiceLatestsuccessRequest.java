// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceLatestsuccessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // service_paas_id
    @NameInMap("service_paas_id")
    @Validation(required = true)
    public String servicePaasId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryServiceLatestsuccessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceLatestsuccessRequest self = new QueryServiceLatestsuccessRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceLatestsuccessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceLatestsuccessRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryServiceLatestsuccessRequest setServicePaasId(String servicePaasId) {
        this.servicePaasId = servicePaasId;
        return this;
    }
    public String getServicePaasId() {
        return this.servicePaasId;
    }

    public QueryServiceLatestsuccessRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
