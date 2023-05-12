// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class QueryAppsDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用id
    @NameInMap("app_id")
    @Validation(required = true)
    public Long appId;

    // instance
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static QueryAppsDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppsDetailRequest self = new QueryAppsDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppsDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppsDetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAppsDetailRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public QueryAppsDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
