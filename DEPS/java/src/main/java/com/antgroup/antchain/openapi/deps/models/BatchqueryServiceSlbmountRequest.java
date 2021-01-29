// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BatchqueryServiceSlbmountRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // service_id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // slb_ids
    @NameInMap("slb_ids")
    @Validation(required = true)
    public java.util.List<String> slbIds;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static BatchqueryServiceSlbmountRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryServiceSlbmountRequest self = new BatchqueryServiceSlbmountRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryServiceSlbmountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryServiceSlbmountRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public BatchqueryServiceSlbmountRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public BatchqueryServiceSlbmountRequest setSlbIds(java.util.List<String> slbIds) {
        this.slbIds = slbIds;
        return this;
    }
    public java.util.List<String> getSlbIds() {
        return this.slbIds;
    }

    public BatchqueryServiceSlbmountRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
