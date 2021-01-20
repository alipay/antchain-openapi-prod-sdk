// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppConfigTemplate extends TeaModel {
    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 描述
    @NameInMap("comment")
    public String comment;

    // 应用参数模板 id
    @NameInMap("id")
    public String id;

    // 操作人 id
    @NameInMap("operator_id")
    public String operatorId;

    // 参数定义列表
    @NameInMap("params")
    public java.util.List<TemplateParamDef> params;

    // 参数模板发布时间
    @NameInMap("release_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String releaseTime;

    // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
    @NameInMap("state")
    public String state;

    // 租户 id
    @NameInMap("tenant_id")
    public String tenantId;

    // 模板版本
    @NameInMap("tpl_version")
    public String tplVersion;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    public static AppConfigTemplate build(java.util.Map<String, ?> map) throws Exception {
        AppConfigTemplate self = new AppConfigTemplate();
        return TeaModel.build(map, self);
    }

    public AppConfigTemplate setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppConfigTemplate setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AppConfigTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppConfigTemplate setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AppConfigTemplate setParams(java.util.List<TemplateParamDef> params) {
        this.params = params;
        return this;
    }
    public java.util.List<TemplateParamDef> getParams() {
        return this.params;
    }

    public AppConfigTemplate setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public AppConfigTemplate setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public AppConfigTemplate setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AppConfigTemplate setTplVersion(String tplVersion) {
        this.tplVersion = tplVersion;
        return this;
    }
    public String getTplVersion() {
        return this.tplVersion;
    }

    public AppConfigTemplate setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public AppConfigTemplate setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

}
