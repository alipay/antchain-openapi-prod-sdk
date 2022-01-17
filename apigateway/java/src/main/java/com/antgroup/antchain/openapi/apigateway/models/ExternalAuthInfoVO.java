// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ExternalAuthInfoVO extends TeaModel {
    // 绑定api数量
    @NameInMap("api_count")
    public Long apiCount;

    // 缓存开关
    @NameInMap("cache_switch")
    public String cacheSwitch;

    // 缓存时间
    @NameInMap("cache_ttl")
    public Long cacheTtl;

    // 能否删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // description
    @NameInMap("description")
    public String description;

    // 外部系统标识
    @NameInMap("external_auth_id")
    public String externalAuthId;

    // 外部授权名称
    @NameInMap("external_auth_name")
    public String externalAuthName;

    // 	
    // 方法名
    @NameInMap("function_name")
    public String functionName;

    // 	
    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 	
    // 更改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 后端接口名
    @NameInMap("interface_name")
    public String interfaceName;

    // 请求方法
    @NameInMap("method")
    public String method;

    // operationtype
    @NameInMap("operation_type")
    public String operationType;

    // 		
    // 创建人
    @NameInMap("operator")
    public String operator;

    // 外部api参数
    @NameInMap("params")
    public java.util.List<ApiParamVO> params;

    // 路由标识
    @NameInMap("router_id")
    public String routerId;

    // 路由规则
    @NameInMap("router_info")
    public RouterInfoVO routerInfo;

    // 路由策略类型
    @NameInMap("router_type")
    public String routerType;

    // SystemClusterVO
    @NameInMap("system_cluster")
    public SystemClusterVO systemCluster;

    // 系统集群标识
    @NameInMap("sys_id")
    public String sysId;

    // 	
    // 租户标识
    @NameInMap("tenant_id")
    public String tenantId;

    // timeout
    @NameInMap("timeout")
    public Long timeout;

    // 服务标识
    @NameInMap("unique_id")
    public String uniqueId;

    // 后端路径
    @NameInMap("upstream_path")
    public String upstreamPath;

    // 后端协议类型
    @NameInMap("upstream_protocol")
    public String upstreamProtocol;

    // 后端服务类型
    @NameInMap("upstream_type")
    public String upstreamType;

    // 工作空间标识
    @NameInMap("workspace_id")
    public String workspaceId;

    public static ExternalAuthInfoVO build(java.util.Map<String, ?> map) throws Exception {
        ExternalAuthInfoVO self = new ExternalAuthInfoVO();
        return TeaModel.build(map, self);
    }

    public ExternalAuthInfoVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public ExternalAuthInfoVO setCacheSwitch(String cacheSwitch) {
        this.cacheSwitch = cacheSwitch;
        return this;
    }
    public String getCacheSwitch() {
        return this.cacheSwitch;
    }

    public ExternalAuthInfoVO setCacheTtl(Long cacheTtl) {
        this.cacheTtl = cacheTtl;
        return this;
    }
    public Long getCacheTtl() {
        return this.cacheTtl;
    }

    public ExternalAuthInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public ExternalAuthInfoVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExternalAuthInfoVO setExternalAuthId(String externalAuthId) {
        this.externalAuthId = externalAuthId;
        return this;
    }
    public String getExternalAuthId() {
        return this.externalAuthId;
    }

    public ExternalAuthInfoVO setExternalAuthName(String externalAuthName) {
        this.externalAuthName = externalAuthName;
        return this;
    }
    public String getExternalAuthName() {
        return this.externalAuthName;
    }

    public ExternalAuthInfoVO setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public ExternalAuthInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ExternalAuthInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ExternalAuthInfoVO setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public ExternalAuthInfoVO setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public ExternalAuthInfoVO setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ExternalAuthInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExternalAuthInfoVO setParams(java.util.List<ApiParamVO> params) {
        this.params = params;
        return this;
    }
    public java.util.List<ApiParamVO> getParams() {
        return this.params;
    }

    public ExternalAuthInfoVO setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public ExternalAuthInfoVO setRouterInfo(RouterInfoVO routerInfo) {
        this.routerInfo = routerInfo;
        return this;
    }
    public RouterInfoVO getRouterInfo() {
        return this.routerInfo;
    }

    public ExternalAuthInfoVO setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public ExternalAuthInfoVO setSystemCluster(SystemClusterVO systemCluster) {
        this.systemCluster = systemCluster;
        return this;
    }
    public SystemClusterVO getSystemCluster() {
        return this.systemCluster;
    }

    public ExternalAuthInfoVO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public ExternalAuthInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ExternalAuthInfoVO setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public ExternalAuthInfoVO setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public ExternalAuthInfoVO setUpstreamPath(String upstreamPath) {
        this.upstreamPath = upstreamPath;
        return this;
    }
    public String getUpstreamPath() {
        return this.upstreamPath;
    }

    public ExternalAuthInfoVO setUpstreamProtocol(String upstreamProtocol) {
        this.upstreamProtocol = upstreamProtocol;
        return this;
    }
    public String getUpstreamProtocol() {
        return this.upstreamProtocol;
    }

    public ExternalAuthInfoVO setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public ExternalAuthInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
