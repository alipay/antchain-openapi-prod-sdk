// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VComputerGroup extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // load_balancer
    @NameInMap("load_balancer")
    @Validation(required = true)
    public LoadBalancer loadBalancer;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static VComputerGroup build(java.util.Map<String, ?> map) throws Exception {
        VComputerGroup self = new VComputerGroup();
        return TeaModel.build(map, self);
    }

    public VComputerGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VComputerGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public VComputerGroup setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public VComputerGroup setLoadBalancer(LoadBalancer loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }
    public LoadBalancer getLoadBalancer() {
        return this.loadBalancer;
    }

    public VComputerGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
