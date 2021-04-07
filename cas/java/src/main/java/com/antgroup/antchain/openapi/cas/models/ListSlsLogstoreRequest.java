// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListSlsLogstoreRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用于请求的 Logstore 名称（支持部分匹配）。
    @NameInMap("logstore_name")
    public String logstoreName;

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

    public static ListSlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSlsLogstoreRequest self = new ListSlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public ListSlsLogstoreRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListSlsLogstoreRequest setLogstoreName(String logstoreName) {
        this.logstoreName = logstoreName;
        return this;
    }
    public String getLogstoreName() {
        return this.logstoreName;
    }

    public ListSlsLogstoreRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListSlsLogstoreRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public ListSlsLogstoreRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
