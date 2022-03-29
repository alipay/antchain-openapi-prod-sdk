// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXdatasourceSearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    //  
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    //  
    @NameInMap("name")
    public String name;

    //  
    @NameInMap("enabled")
    public Boolean enabled;

    //  
    @NameInMap("target_resource_kind")
    public String targetResourceKind;

    //  
    @NameInMap("target_resource_name")
    public String targetResourceName;

    //  
    @NameInMap("rule_type")
    public String ruleType;

    //  
    @NameInMap("created_by")
    public String createdBy;

    //  
    @NameInMap("parent_uuid")
    public String parentUuid;

    //  
    @NameInMap("datasource_type")
    public String datasourceType;

    public static QueryXdatasourceSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXdatasourceSearchRequest self = new QueryXdatasourceSearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryXdatasourceSearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXdatasourceSearchRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryXdatasourceSearchRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryXdatasourceSearchRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public QueryXdatasourceSearchRequest setTargetResourceKind(String targetResourceKind) {
        this.targetResourceKind = targetResourceKind;
        return this;
    }
    public String getTargetResourceKind() {
        return this.targetResourceKind;
    }

    public QueryXdatasourceSearchRequest setTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }
    public String getTargetResourceName() {
        return this.targetResourceName;
    }

    public QueryXdatasourceSearchRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public QueryXdatasourceSearchRequest setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public QueryXdatasourceSearchRequest setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public QueryXdatasourceSearchRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

}
