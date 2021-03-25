// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarReleaseVersion extends TeaModel {
    // sidecar版本描述
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreated;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // release note
    @NameInMap("release_note")
    public String releaseNote;

    // scope生效范围详情
    @NameInMap("scope_detail")
    @Validation(required = true)
    public SidecarScopeDetail scopeDetail;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本id
    @NameInMap("sidecar_release_version_id")
    @Validation(required = true)
    public String sidecarReleaseVersionId;

    // sidecar版本号
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // 版本状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 发布、下线、废弃原因
    @NameInMap("status_reason")
    public String statusReason;

    // sidecar模板内容
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // sidecar模板配置
    @NameInMap("template_configs")
    @Validation(required = true)
    public java.util.List<SidecarTemplateConfig> templateConfigs;

    // sidecar版本类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 版本周期：alpha/beta/release
    @NameInMap("version_period")
    @Validation(required = true)
    public String versionPeriod;

    public static SidecarReleaseVersion build(java.util.Map<String, ?> map) throws Exception {
        SidecarReleaseVersion self = new SidecarReleaseVersion();
        return TeaModel.build(map, self);
    }

    public SidecarReleaseVersion setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SidecarReleaseVersion setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public SidecarReleaseVersion setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SidecarReleaseVersion setReleaseNote(String releaseNote) {
        this.releaseNote = releaseNote;
        return this;
    }
    public String getReleaseNote() {
        return this.releaseNote;
    }

    public SidecarReleaseVersion setScopeDetail(SidecarScopeDetail scopeDetail) {
        this.scopeDetail = scopeDetail;
        return this;
    }
    public SidecarScopeDetail getScopeDetail() {
        return this.scopeDetail;
    }

    public SidecarReleaseVersion setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarReleaseVersion setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

    public SidecarReleaseVersion setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public SidecarReleaseVersion setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SidecarReleaseVersion setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public SidecarReleaseVersion setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SidecarReleaseVersion setTemplateConfigs(java.util.List<SidecarTemplateConfig> templateConfigs) {
        this.templateConfigs = templateConfigs;
        return this;
    }
    public java.util.List<SidecarTemplateConfig> getTemplateConfigs() {
        return this.templateConfigs;
    }

    public SidecarReleaseVersion setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SidecarReleaseVersion setVersionPeriod(String versionPeriod) {
        this.versionPeriod = versionPeriod;
        return this;
    }
    public String getVersionPeriod() {
        return this.versionPeriod;
    }

}
