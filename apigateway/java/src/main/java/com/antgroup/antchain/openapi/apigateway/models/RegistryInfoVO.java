// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class RegistryInfoVO extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // 注册中心标识
    @NameInMap("registry_id")
    public String registryId;

    // 注册中心类型
    @NameInMap("registry_type")
    public String registryType;

    // 名称
    @NameInMap("registry_name")
    public String registryName;

    // access_key
    @NameInMap("access_key")
    public String accessKey;

    // secret_key
    @NameInMap("secret_key")
    public String secretKey;

    // 集群数量
    @NameInMap("sys_count")
    public Long sysCount;

    // host
    @NameInMap("host")
    public java.util.List<String> host;

    // can_delete
    @NameInMap("can_delete")
    public Boolean canDelete;

    // port
    @NameInMap("port")
    public Long port;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // operator
    @NameInMap("operator")
    public String operator;

    // pub协议标识
    @NameInMap("pub_protocol")
    public String pubProtocol;

    // can_update
    @NameInMap("can_update")
    public Boolean canUpdate;

    // 注册中心分组
    @NameInMap("registry_group")
    public String registryGroup;

    // 协议版本
    @NameInMap("protocol_version")
    public String protocolVersion;

    // 命名空间
    @NameInMap("name_space")
    public String nameSpace;

    // 集群名称
    @NameInMap("cluster_name")
    public String clusterName;

    public static RegistryInfoVO build(java.util.Map<String, ?> map) throws Exception {
        RegistryInfoVO self = new RegistryInfoVO();
        return TeaModel.build(map, self);
    }

    public RegistryInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RegistryInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RegistryInfoVO setRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }
    public String getRegistryId() {
        return this.registryId;
    }

    public RegistryInfoVO setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public RegistryInfoVO setRegistryName(String registryName) {
        this.registryName = registryName;
        return this;
    }
    public String getRegistryName() {
        return this.registryName;
    }

    public RegistryInfoVO setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public RegistryInfoVO setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public RegistryInfoVO setSysCount(Long sysCount) {
        this.sysCount = sysCount;
        return this;
    }
    public Long getSysCount() {
        return this.sysCount;
    }

    public RegistryInfoVO setHost(java.util.List<String> host) {
        this.host = host;
        return this;
    }
    public java.util.List<String> getHost() {
        return this.host;
    }

    public RegistryInfoVO setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public RegistryInfoVO setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public RegistryInfoVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public RegistryInfoVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public RegistryInfoVO setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public RegistryInfoVO setPubProtocol(String pubProtocol) {
        this.pubProtocol = pubProtocol;
        return this;
    }
    public String getPubProtocol() {
        return this.pubProtocol;
    }

    public RegistryInfoVO setCanUpdate(Boolean canUpdate) {
        this.canUpdate = canUpdate;
        return this;
    }
    public Boolean getCanUpdate() {
        return this.canUpdate;
    }

    public RegistryInfoVO setRegistryGroup(String registryGroup) {
        this.registryGroup = registryGroup;
        return this;
    }
    public String getRegistryGroup() {
        return this.registryGroup;
    }

    public RegistryInfoVO setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }
    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public RegistryInfoVO setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public RegistryInfoVO setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

}
