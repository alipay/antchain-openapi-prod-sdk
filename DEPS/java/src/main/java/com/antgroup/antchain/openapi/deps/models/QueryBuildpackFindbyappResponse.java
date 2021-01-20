// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindbyappResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // bgEnable
    @NameInMap("bg_enable")
    public Boolean bgEnable;

    // buildpackArch
    @NameInMap("buildpack_arch")
    public String buildpackArch;

    // buildScriptId
    @NameInMap("build_script_id")
    public String buildScriptId;

    // commandId
    @NameInMap("command_id")
    public String commandId;

    // componentId
    @NameInMap("component_id")
    public String componentId;

    // configId
    @NameInMap("config_id")
    public String configId;

    // creator
    @NameInMap("creator")
    public String creator;

    // customerIds
    @NameInMap("customer_ids")
    public java.util.List<String> customerIds;

    // deployScriptId
    @NameInMap("deploy_script_id")
    public String deployScriptId;

    // des
    @NameInMap("des")
    public String des;

    // fullVersion
    @NameInMap("full_version")
    public String fullVersion;

    // gmtCreate
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // gmtModified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // supportedOS
    @NameInMap("supported_o_s")
    public java.util.List<BuildpackOS> supportedOS;

    // supportedRegions
    @NameInMap("supported_regions")
    public java.util.List<BuildpackRegionRelationDetail> supportedRegions;

    // techstack
    @NameInMap("techstack")
    public Techstack techstack;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // version
    @NameInMap("version")
    public String version;

    public static QueryBuildpackFindbyappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindbyappResponse self = new QueryBuildpackFindbyappResponse();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindbyappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBuildpackFindbyappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBuildpackFindbyappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBuildpackFindbyappResponse setBgEnable(Boolean bgEnable) {
        this.bgEnable = bgEnable;
        return this;
    }
    public Boolean getBgEnable() {
        return this.bgEnable;
    }

    public QueryBuildpackFindbyappResponse setBuildpackArch(String buildpackArch) {
        this.buildpackArch = buildpackArch;
        return this;
    }
    public String getBuildpackArch() {
        return this.buildpackArch;
    }

    public QueryBuildpackFindbyappResponse setBuildScriptId(String buildScriptId) {
        this.buildScriptId = buildScriptId;
        return this;
    }
    public String getBuildScriptId() {
        return this.buildScriptId;
    }

    public QueryBuildpackFindbyappResponse setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

    public QueryBuildpackFindbyappResponse setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public QueryBuildpackFindbyappResponse setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public QueryBuildpackFindbyappResponse setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public QueryBuildpackFindbyappResponse setCustomerIds(java.util.List<String> customerIds) {
        this.customerIds = customerIds;
        return this;
    }
    public java.util.List<String> getCustomerIds() {
        return this.customerIds;
    }

    public QueryBuildpackFindbyappResponse setDeployScriptId(String deployScriptId) {
        this.deployScriptId = deployScriptId;
        return this;
    }
    public String getDeployScriptId() {
        return this.deployScriptId;
    }

    public QueryBuildpackFindbyappResponse setDes(String des) {
        this.des = des;
        return this;
    }
    public String getDes() {
        return this.des;
    }

    public QueryBuildpackFindbyappResponse setFullVersion(String fullVersion) {
        this.fullVersion = fullVersion;
        return this;
    }
    public String getFullVersion() {
        return this.fullVersion;
    }

    public QueryBuildpackFindbyappResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryBuildpackFindbyappResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryBuildpackFindbyappResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryBuildpackFindbyappResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryBuildpackFindbyappResponse setSupportedOS(java.util.List<BuildpackOS> supportedOS) {
        this.supportedOS = supportedOS;
        return this;
    }
    public java.util.List<BuildpackOS> getSupportedOS() {
        return this.supportedOS;
    }

    public QueryBuildpackFindbyappResponse setSupportedRegions(java.util.List<BuildpackRegionRelationDetail> supportedRegions) {
        this.supportedRegions = supportedRegions;
        return this;
    }
    public java.util.List<BuildpackRegionRelationDetail> getSupportedRegions() {
        return this.supportedRegions;
    }

    public QueryBuildpackFindbyappResponse setTechstack(Techstack techstack) {
        this.techstack = techstack;
        return this;
    }
    public Techstack getTechstack() {
        return this.techstack;
    }

    public QueryBuildpackFindbyappResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryBuildpackFindbyappResponse setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public QueryBuildpackFindbyappResponse setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public QueryBuildpackFindbyappResponse setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
