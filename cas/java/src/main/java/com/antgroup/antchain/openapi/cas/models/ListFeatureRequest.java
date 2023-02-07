// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListFeatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // feature_name
    @NameInMap("feature_name")
    public String featureName;

    public static ListFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureRequest self = new ListFeatureRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFeatureRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFeatureRequest setFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }
    public String getFeatureName() {
        return this.featureName;
    }

}
