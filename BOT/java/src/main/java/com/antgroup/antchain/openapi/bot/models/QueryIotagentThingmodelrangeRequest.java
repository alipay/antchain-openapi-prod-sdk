// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentThingmodelrangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    @NameInMap("device_id")
    public String deviceId;

    @NameInMap("feature_id")
    @Validation(required = true)
    public String featureId;

    public static QueryIotagentThingmodelrangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentThingmodelrangeRequest self = new QueryIotagentThingmodelrangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotagentThingmodelrangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotagentThingmodelrangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotagentThingmodelrangeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryIotagentThingmodelrangeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryIotagentThingmodelrangeRequest setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

}
