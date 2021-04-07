// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryFeatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // project_id
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

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

    public QueryFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryFeatureRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
