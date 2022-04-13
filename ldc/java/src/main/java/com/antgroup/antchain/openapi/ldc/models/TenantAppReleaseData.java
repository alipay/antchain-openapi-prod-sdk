// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class TenantAppReleaseData extends TeaModel {
    // 是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 机构名称
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 发布单ID
    @NameInMap("release_id")
    @Validation(required = true)
    public String releaseId;

    // 环境
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static TenantAppReleaseData build(java.util.Map<String, ?> map) throws Exception {
        TenantAppReleaseData self = new TenantAppReleaseData();
        return TeaModel.build(map, self);
    }

    public TenantAppReleaseData setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TenantAppReleaseData setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public TenantAppReleaseData setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public TenantAppReleaseData setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
