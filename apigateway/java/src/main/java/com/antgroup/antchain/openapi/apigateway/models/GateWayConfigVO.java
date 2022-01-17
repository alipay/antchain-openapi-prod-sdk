// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class GateWayConfigVO extends TeaModel {
    // 唯一标识
    @NameInMap("gateway_id")
    public String gatewayId;

    // host
    @NameInMap("host")
    public String host;

    // 唯一性标识
    @NameInMap("id")
    public String id;

    // zone名称、网关名称
    @NameInMap("name")
    public String name;

    // 注册中心
    @NameInMap("routers")
    public java.util.List<RegistryVO> routers;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // zone
    @NameInMap("zone")
    public String zone;

    // 流量比例
    @NameInMap("weight")
    public Long weight;

    public static GateWayConfigVO build(java.util.Map<String, ?> map) throws Exception {
        GateWayConfigVO self = new GateWayConfigVO();
        return TeaModel.build(map, self);
    }

    public GateWayConfigVO setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public GateWayConfigVO setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GateWayConfigVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GateWayConfigVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GateWayConfigVO setRouters(java.util.List<RegistryVO> routers) {
        this.routers = routers;
        return this;
    }
    public java.util.List<RegistryVO> getRouters() {
        return this.routers;
    }

    public GateWayConfigVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GateWayConfigVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GateWayConfigVO setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public GateWayConfigVO setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
