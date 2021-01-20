// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryServiceSlbmountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // slb_id
    @NameInMap("slb_id")
    public String slbId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryServiceSlbmountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryServiceSlbmountRequest self = new QueryServiceSlbmountRequest();
        return TeaModel.build(map, self);
    }

    public QueryServiceSlbmountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryServiceSlbmountRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryServiceSlbmountRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public QueryServiceSlbmountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
