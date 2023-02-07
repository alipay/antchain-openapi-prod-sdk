// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryFeatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // paas_region_id cafe的region_id，是一串数字
    @NameInMap("paas_region_id")
    @Validation(required = true)
    public String paasRegionId;

    // project_id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 要查询的功能
    @NameInMap("feature_name")
    public String featureName;

    public static QueryFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFeatureRequest self = new QueryFeatureRequest();
        return TeaModel.build(map, self);
    }

    public QueryFeatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFeatureRequest setPaasRegionId(String paasRegionId) {
        this.paasRegionId = paasRegionId;
        return this;
    }
    public String getPaasRegionId() {
        return this.paasRegionId;
    }

    public QueryFeatureRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryFeatureRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public QueryFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

}
