// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TenantAppReleasePipeline extends TeaModel {
    // 机构名称
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用发布releaseId
    @NameInMap("release_id")
    @Validation(required = true)
    public String releaseId;

    // 发布单序列号
    @NameInMap("release_time_series_id")
    @Validation(required = true)
    public String releaseTimeSeriesId;

    // 应用发布状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 应用发布单详情url
    @NameInMap("url")
    public String url;

    // 应用列表
    @NameInMap("apps")
    @Validation(required = true)
    public java.util.List<String> apps;

    // 操作人员
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 发布单ID
    @NameInMap("approve_plan_id")
    public String approvePlanId;

    // 发布审批单Url
    @NameInMap("approve_plan_url")
    public String approvePlanUrl;

    public static TenantAppReleasePipeline build(java.util.Map<String, ?> map) throws Exception {
        TenantAppReleasePipeline self = new TenantAppReleasePipeline();
        return TeaModel.build(map, self);
    }

    public TenantAppReleasePipeline setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public TenantAppReleasePipeline setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public TenantAppReleasePipeline setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public TenantAppReleasePipeline setReleaseTimeSeriesId(String releaseTimeSeriesId) {
        this.releaseTimeSeriesId = releaseTimeSeriesId;
        return this;
    }
    public String getReleaseTimeSeriesId() {
        return this.releaseTimeSeriesId;
    }

    public TenantAppReleasePipeline setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public TenantAppReleasePipeline setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public TenantAppReleasePipeline setApps(java.util.List<String> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<String> getApps() {
        return this.apps;
    }

    public TenantAppReleasePipeline setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TenantAppReleasePipeline setApprovePlanId(String approvePlanId) {
        this.approvePlanId = approvePlanId;
        return this;
    }
    public String getApprovePlanId() {
        return this.approvePlanId;
    }

    public TenantAppReleasePipeline setApprovePlanUrl(String approvePlanUrl) {
        this.approvePlanUrl = approvePlanUrl;
        return this;
    }
    public String getApprovePlanUrl() {
        return this.approvePlanUrl;
    }

}
