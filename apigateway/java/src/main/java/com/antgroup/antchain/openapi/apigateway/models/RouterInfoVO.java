// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RouterInfoVO extends TeaModel {
    // api数
    @NameInMap("api_count")
    public Long apiCount;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // operator
    @NameInMap("operator")
    public String operator;

    // routerConfigs
    @NameInMap("router_configs")
    public java.util.List<RouterConfigVO> routerConfigs;

    // router_id
    @NameInMap("router_id")
    public String routerId;

    // routerName
    @NameInMap("router_name")
    public String routerName;

    // routerType
    @NameInMap("router_type")
    public String routerType;

    // upstream_protocol
    @NameInMap("upstream_protocol")
    public String upstreamProtocol;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static RouterInfoVO build(java.util.Map<String, ?> map) throws Exception {
        RouterInfoVO self = new RouterInfoVO();
        return TeaModel.build(map, self);
    }

    public RouterInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public RouterInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public RouterInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RouterInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RouterInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RouterInfoVO setRouterConfigs(java.util.List<RouterConfigVO> routerConfigs) {
        this.routerConfigs = routerConfigs;
        return this;
    }
    public java.util.List<RouterConfigVO> getRouterConfigs() {
        return this.routerConfigs;
    }

    public RouterInfoVO setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public RouterInfoVO setRouterName(String routerName) {
        this.routerName = routerName;
        return this;
    }
    public String getRouterName() {
        return this.routerName;
    }

    public RouterInfoVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public RouterInfoVO setUpstreamProtocol(String upstreamProtocol) {
        this.upstreamProtocol = upstreamProtocol;
        return this;
    }
    public String getUpstreamProtocol() {
        return this.upstreamProtocol;
    }

    public RouterInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RouterInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
