// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryPromotionActivityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活动ID，由运营线下通知分配
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    public static QueryPromotionActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionActivityRequest self = new QueryPromotionActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryPromotionActivityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPromotionActivityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPromotionActivityRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

}
