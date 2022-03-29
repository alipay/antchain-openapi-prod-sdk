// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AgentInstance extends TeaModel {
    // agent版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // agent 采集对象的唯一标识符
    @NameInMap("collect_id")
    @Validation(required = true)
    public String collectId;

    // app 名称
    @NameInMap("app_name")
    public String appName;

    // IP 地址
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // hostname 名称
    @NameInMap("hostname")
    public String hostname;

    // 租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // 工作空间 ID
    @NameInMap("workspace_id")
    @Validation(required = true)
    public Long workspaceId;

    // agent 状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 容器/ECS
    @NameInMap("deploy_type")
    @Validation(required = true)
    public String deployType;

    // agent 附加信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 更新时间
    @NameInMap("gmt_modified")
    public Long gmtModified;

    // 是否开启告警标志
    @NameInMap("label")
    @Validation(required = true)
    public Long label;

    public static AgentInstance build(java.util.Map<String, ?> map) throws Exception {
        AgentInstance self = new AgentInstance();
        return TeaModel.build(map, self);
    }

    public AgentInstance setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AgentInstance setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public AgentInstance setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AgentInstance setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AgentInstance setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public AgentInstance setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public AgentInstance setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public AgentInstance setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public AgentInstance setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public AgentInstance setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public AgentInstance setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public AgentInstance setLabel(Long label) {
        this.label = label;
        return this;
    }
    public Long getLabel() {
        return this.label;
    }

}
