// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteSlsConfigRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 要删除的日志配置名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

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

    public static DeleteSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlsConfigRequest self = new DeleteSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSlsConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSlsConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteSlsConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteSlsConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public DeleteSlsConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
