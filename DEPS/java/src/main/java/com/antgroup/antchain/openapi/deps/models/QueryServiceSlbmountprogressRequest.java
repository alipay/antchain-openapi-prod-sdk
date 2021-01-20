// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceSlbmountprogressRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // process_id
    @NameInMap("process_id")
    public String processId;

    // region_identity
    @NameInMap("region_identity")
    public String regionIdentity;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryServiceSlbmountprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceSlbmountprogressRequest self = new QueryServiceSlbmountprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceSlbmountprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceSlbmountprogressRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public QueryServiceSlbmountprogressRequest setRegionIdentity(String regionIdentity) {
        this.regionIdentity = regionIdentity;
        return this;
    }
    public String getRegionIdentity() {
        return this.regionIdentity;
    }

    public QueryServiceSlbmountprogressRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryServiceSlbmountprogressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
