// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateSlsConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 日志配置详情
    @NameInMap("config")
    @Validation(required = true)
    public SLSConfig config;

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

    public static CreateSlsConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlsConfigRequest self = new CreateSlsConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlsConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSlsConfigRequest setConfig(SLSConfig config) {
        this.config = config;
        return this;
    }
    public SLSConfig getConfig() {
        return this.config;
    }

    public CreateSlsConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateSlsConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public CreateSlsConfigRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
