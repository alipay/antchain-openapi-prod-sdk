// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BuildpackByAppV extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // des
    @NameInMap("des")
    public String des;

    // version
    @NameInMap("version")
    public String version;

    // deployScriptId
    @NameInMap("deploy_script_id")
    public String deployScriptId;

    // buildScriptId
    @NameInMap("build_script_id")
    public String buildScriptId;

    // configId
    @NameInMap("config_id")
    public String configId;

    // componentId
    @NameInMap("component_id")
    public String componentId;

    // commandId
    @NameInMap("command_id")
    public String commandId;

    // bgEnable
    @NameInMap("bg_enable")
    public Boolean bgEnable;

    // creator
    @NameInMap("creator")
    public String creator;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // customerIds
    @NameInMap("customer_ids")
    public String customerIds;

    // gmtCreate
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // gmtModified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // resultMsg
    @NameInMap("result_msg")
    public String resultMsg;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    public static BuildpackByAppV build(java.util.Map<String, ?> map) throws Exception {
        BuildpackByAppV self = new BuildpackByAppV();
        return TeaModel.build(map, self);
    }

    public BuildpackByAppV setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BuildpackByAppV setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BuildpackByAppV setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public BuildpackByAppV setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BuildpackByAppV setDeployScriptId(String deployScriptId) {
        this.deployScriptId = deployScriptId;
        return this;
    }
    public String getDeployScriptId() {
        return this.deployScriptId;
    }

    public BuildpackByAppV setBuildScriptId(String buildScriptId) {
        this.buildScriptId = buildScriptId;
        return this;
    }
    public String getBuildScriptId() {
        return this.buildScriptId;
    }

    public BuildpackByAppV setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public BuildpackByAppV setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public BuildpackByAppV setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public BuildpackByAppV setBgEnable(Boolean bgEnable) {
        this.bgEnable = bgEnable;
        return this;
    }
    public Boolean getBgEnable() {
        return this.bgEnable;
    }

    public BuildpackByAppV setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public BuildpackByAppV setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BuildpackByAppV setCustomerIds(String customerIds) {
        this.customerIds = customerIds;
        return this;
    }
    public String getCustomerIds() {
        return this.customerIds;
    }

    public BuildpackByAppV setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public BuildpackByAppV setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public BuildpackByAppV setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BuildpackByAppV setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public BuildpackByAppV setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
