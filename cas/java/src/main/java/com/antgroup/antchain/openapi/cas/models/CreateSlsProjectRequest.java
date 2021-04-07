// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSlsProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 日志项目名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 区域id
    @NameInMap("sls_region_id")
    public String slsRegionId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    public static CreateSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsProjectRequest self = new CreateSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlsProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSlsProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateSlsProjectRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateSlsProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
