// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class SystemClusterVO extends TeaModel {
    // api数
    @NameInMap("api_count")
    public Long apiCount;

    // 认证配置
    @NameInMap("authentication_config")
    public AuthenticationConfigVO authenticationConfig;

    // 认证方式
    @NameInMap("authentication_type")
    public String authenticationType;

    // 是否可以删除
    @NameInMap("can_delete")
    public Boolean canDelete;

    // 描述
    @NameInMap("description")
    public String description;

    // 绑定的外部授权数量
    @NameInMap("external_auth_count")
    public Long externalAuthCount;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 系统host地址
    @NameInMap("host")
    public java.util.List<String> host;

    // 负载均衡策略类型
    @NameInMap("lb_type")
    public String lbType;

    // 创建人
    @NameInMap("operator")
    public String operator;

    // 端口
    @NameInMap("port")
    public Long port;

    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // sys_id
    @NameInMap("sys_id")
    public String sysId;

    // sys_name
    @NameInMap("sys_name")
    public String sysName;

    // 系统类型(手工配置/sofa注册中心/zk)
    @NameInMap("sys_type")
    public String sysType;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // unique_id
    @NameInMap("unique_id")
    public String uniqueId;

    // upstream_protocol
    @NameInMap("upstream_protocol")
    public String upstreamProtocol;

    // 下发协议的开头
    @NameInMap("url_type")
    public String urlType;

    // vpc_id
    @NameInMap("vpc_id")
    public String vpcId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // registry_id
    @NameInMap("registry_id")
    public String registryId;

    // registry_info
    @NameInMap("registry_info")
    public RegistryInfoVO registryInfo;

    // triple域名
    @NameInMap("triple_host")
    public String tripleHost;

    // need_tls
    @NameInMap("need_tls")
    public Boolean needTls;

    // 证书类型
    @NameInMap("tls_type")
    public String tlsType;

    public static SystemClusterVO build(java.util.Map<String, ?> map) throws Exception {
        SystemClusterVO self = new SystemClusterVO();
        return TeaModel.build(map, self);
    }

    public SystemClusterVO setApiCount(Long apiCount) {
        this.apiCount = apiCount;
        return this;
    }
    public Long getApiCount() {
        return this.apiCount;
    }

    public SystemClusterVO setAuthenticationConfig(AuthenticationConfigVO authenticationConfig) {
        this.authenticationConfig = authenticationConfig;
        return this;
    }
    public AuthenticationConfigVO getAuthenticationConfig() {
        return this.authenticationConfig;
    }

    public SystemClusterVO setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public SystemClusterVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public SystemClusterVO setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SystemClusterVO setExternalAuthCount(Long externalAuthCount) {
        this.externalAuthCount = externalAuthCount;
        return this;
    }
    public Long getExternalAuthCount() {
        return this.externalAuthCount;
    }

    public SystemClusterVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SystemClusterVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SystemClusterVO setHost(java.util.List<String> host) {
        this.host = host;
        return this;
    }
    public java.util.List<String> getHost() {
        return this.host;
    }

    public SystemClusterVO setLbType(String lbType) {
        this.lbType = lbType;
        return this;
    }
    public String getLbType() {
        return this.lbType;
    }

    public SystemClusterVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SystemClusterVO setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public SystemClusterVO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SystemClusterVO setSysId(String sysId) {
        this.sysId = sysId;
        return this;
    }
    public String getSysId() {
        return this.sysId;
    }

    public SystemClusterVO setSysName(String sysName) {
        this.sysName = sysName;
        return this;
    }
    public String getSysName() {
        return this.sysName;
    }

    public SystemClusterVO setSysType(String sysType) {
        this.sysType = sysType;
        return this;
    }
    public String getSysType() {
        return this.sysType;
    }

    public SystemClusterVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SystemClusterVO setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

    public SystemClusterVO setUpstreamProtocol(String upstreamProtocol) {
        this.upstreamProtocol = upstreamProtocol;
        return this;
    }
    public String getUpstreamProtocol() {
        return this.upstreamProtocol;
    }

    public SystemClusterVO setUrlType(String urlType) {
        this.urlType = urlType;
        return this;
    }
    public String getUrlType() {
        return this.urlType;
    }

    public SystemClusterVO setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public SystemClusterVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public SystemClusterVO setRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }
    public String getRegistryId() {
        return this.registryId;
    }

    public SystemClusterVO setRegistryInfo(RegistryInfoVO registryInfo) {
        this.registryInfo = registryInfo;
        return this;
    }
    public RegistryInfoVO getRegistryInfo() {
        return this.registryInfo;
    }

    public SystemClusterVO setTripleHost(String tripleHost) {
        this.tripleHost = tripleHost;
        return this;
    }
    public String getTripleHost() {
        return this.tripleHost;
    }

    public SystemClusterVO setNeedTls(Boolean needTls) {
        this.needTls = needTls;
        return this;
    }
    public Boolean getNeedTls() {
        return this.needTls;
    }

    public SystemClusterVO setTlsType(String tlsType) {
        this.tlsType = tlsType;
        return this;
    }
    public String getTlsType() {
        return this.tlsType;
    }

}
