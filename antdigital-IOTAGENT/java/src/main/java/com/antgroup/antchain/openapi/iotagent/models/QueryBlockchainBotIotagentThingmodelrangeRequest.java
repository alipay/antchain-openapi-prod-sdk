// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentThingmodelrangeRequest extends TeaModel {
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

    public static QueryBlockchainBotIotagentThingmodelrangeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentThingmodelrangeRequest self = new QueryBlockchainBotIotagentThingmodelrangeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentThingmodelrangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotIotagentThingmodelrangeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotIotagentThingmodelrangeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryBlockchainBotIotagentThingmodelrangeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryBlockchainBotIotagentThingmodelrangeRequest setFeatureId(String featureId) {
        this.featureId = featureId;
        return this;
    }
    public String getFeatureId() {
        return this.featureId;
    }

}
