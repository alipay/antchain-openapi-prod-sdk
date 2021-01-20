// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarVersionInstance extends TeaModel {
    // 版本实例描述
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreated;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // 版本实例名称
    @NameInMap("instance_name")
    public String instanceName;

    // 环境参数模板
    @NameInMap("params")
    public String params;

    // sidecar参数配置
    @NameInMap("params_configs")
    public java.util.List<SidecarParamsConfig> paramsConfigs;

    // sidecar版本发布说明
    @NameInMap("release_note")
    public String releaseNote;

    // scope生效范围详情
    @NameInMap("scope_detail")
    public SidecarScopeDetail scopeDetail;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    // sidecar版本id
    @NameInMap("sidecar_release_version_id")
    public String sidecarReleaseVersionId;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // sidecar版本实例id
    @NameInMap("sidecar_version_instance_id")
    public String sidecarVersionInstanceId;

    // 版本实例状态
    @NameInMap("status")
    public Long status;

    // 发布、下线、废弃原因
    // 
    @NameInMap("status_reason")
    public String statusReason;

    // sidecar版本模板
    @NameInMap("template")
    public String template;

    // sidecar模板配置
    @NameInMap("template_configs")
    public java.util.List<SidecarTemplateConfig> templateConfigs;

    public static SidecarVersionInstance build(java.util.Map<String, ?> map) throws Exception {
        SidecarVersionInstance self = new SidecarVersionInstance();
        return TeaModel.build(map, self);
    }

    public SidecarVersionInstance setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SidecarVersionInstance setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public SidecarVersionInstance setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SidecarVersionInstance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public SidecarVersionInstance setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SidecarVersionInstance setParamsConfigs(java.util.List<SidecarParamsConfig> paramsConfigs) {
        this.paramsConfigs = paramsConfigs;
        return this;
    }
    public java.util.List<SidecarParamsConfig> getParamsConfigs() {
        return this.paramsConfigs;
    }

    public SidecarVersionInstance setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public SidecarVersionInstance setScopeDetail(SidecarScopeDetail scopeDetail) {
        this.scopeDetail = scopeDetail;
        return this;
    }
    public SidecarScopeDetail getScopeDetail() {
        return this.scopeDetail;
    }

    public SidecarVersionInstance setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarVersionInstance setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

    public SidecarVersionInstance setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public SidecarVersionInstance setSidecarVersionInstanceId(String sidecarVersionInstanceId) {
        this.sidecarVersionInstanceId = sidecarVersionInstanceId;
        return this;
    }
    public String getSidecarVersionInstanceId() {
        return this.sidecarVersionInstanceId;
    }

    public SidecarVersionInstance setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SidecarVersionInstance setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public SidecarVersionInstance setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SidecarVersionInstance setTemplateConfigs(java.util.List<SidecarTemplateConfig> templateConfigs) {
        this.templateConfigs = templateConfigs;
        return this;
    }
    public java.util.List<SidecarTemplateConfig> getTemplateConfigs() {
        return this.templateConfigs;
    }

}
