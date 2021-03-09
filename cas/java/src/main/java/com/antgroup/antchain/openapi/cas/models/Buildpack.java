// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Buildpack extends TeaModel {
    // 技术栈标识ID
    @NameInMap("id")
    public String id;

    // 技术栈名称
    @NameInMap("name")
    public String name;

    // 技术栈描述
    @NameInMap("des")
    public String des;

    // 技术栈版本
    @NameInMap("version")
    public String version;

    // 技术栈类别
    @NameInMap("stack")
    public String stack;

    // 部署脚本id
    @NameInMap("deploy_script_id")
    public String deployScriptId;

    // 构建脚本ID
    @NameInMap("build_script_id")
    public String buildScriptId;

    // 配置id
    @NameInMap("config_id")
    public String configId;

    // 组件id
    @NameInMap("component_id")
    public String componentId;

    // 命令id
    @NameInMap("command_id")
    public String commandId;

    // 启用蓝绿
    @NameInMap("bg_enable")
    public Boolean bgEnable;

    // 创建人
    @NameInMap("creator")
    public String creator;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 客户id列表
    @NameInMap("customer_ids")
    public java.util.List<String> customerIds;

    // 技术栈定义类型
    // 系统模板 TEMPLATE
    // 用户自定义 CUSTOM
    // 后台服务 BACKGROUND_SERVICE
    @NameInMap("type")
    public String type;

    // 技术栈状态
    // 草稿 DRAFT
    // 已提交 COMMITED 
    // 已对外发布 PUBLISHED
    // 已退役 RETIRED
    @NameInMap("status")
    public String status;

    // 创建日期
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // 最近修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // 技术栈信息汇总
    @NameInMap("result_msg")
    public String resultMsg;

    // 可用 USABLE
    // 不可用 UNUSABLE
    @NameInMap("version_status")
    public String versionStatus;

    // 运行时属性
    @NameInMap("instances")
    public BuildpackInstances instances;

    public static Buildpack build(java.util.Map<String, ?> map) throws Exception {
        Buildpack self = new Buildpack();
        return TeaModel.build(map, self);
    }

    public Buildpack setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Buildpack setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Buildpack setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public Buildpack setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Buildpack setStack(String stack) {
        this.stack = stack;
        return this;
    }
    public String getStack() {
        return this.stack;
    }

    public Buildpack setDeployScriptId(String deployScriptId) {
        this.deployScriptId = deployScriptId;
        return this;
    }
    public String getDeployScriptId() {
        return this.deployScriptId;
    }

    public Buildpack setBuildScriptId(String buildScriptId) {
        this.buildScriptId = buildScriptId;
        return this;
    }
    public String getBuildScriptId() {
        return this.buildScriptId;
    }

    public Buildpack setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public Buildpack setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public Buildpack setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public Buildpack setBgEnable(Boolean bgEnable) {
        this.bgEnable = bgEnable;
        return this;
    }
    public Boolean getBgEnable() {
        return this.bgEnable;
    }

    public Buildpack setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Buildpack setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Buildpack setCustomerIds(java.util.List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }
    public java.util.List<String> getCustomerIds() {
        return this.customerIds;
    }

    public Buildpack setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Buildpack setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Buildpack setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Buildpack setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Buildpack setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public Buildpack setVersionStatus(String versionStatus) {
        this.versionStatus = versionStatus;
        return this;
    }
    public String getVersionStatus() {
        return this.versionStatus;
    }

    public Buildpack setInstances(BuildpackInstances instances) {
        this.instances = instances;
        return this;
    }
    public BuildpackInstances getInstances() {
        return this.instances;
    }

}
