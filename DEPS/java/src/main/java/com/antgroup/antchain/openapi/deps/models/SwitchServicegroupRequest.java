// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SwitchServicegroupRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // service_group_id
    @NameInMap("service_group_id")
    public String serviceGroupId;

    // service_id
    @NameInMap("service_id")
    public String serviceId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static SwitchServicegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchServicegroupRequest self = new SwitchServicegroupRequest();
        return TeaModel.build(map, self);
    }

    public SwitchServicegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SwitchServicegroupRequest setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    public SwitchServicegroupRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public SwitchServicegroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
