// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceLatestsuccessRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // service_paas_id
    @NameInMap("service_paas_id")
    public String servicePaasId;

    // workspace
    @NameInMap("workspace")
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
