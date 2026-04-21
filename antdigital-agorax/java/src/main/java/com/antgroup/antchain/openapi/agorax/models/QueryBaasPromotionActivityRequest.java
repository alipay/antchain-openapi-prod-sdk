// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryBaasPromotionActivityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活动ID，由运营线下通知分配
    @NameInMap("activity_id")
    @Validation(required = true)
    public String activityId;

    public static QueryBaasPromotionActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBaasPromotionActivityRequest self = new QueryBaasPromotionActivityRequest();
        return TeaModel.build(map, self);
    }

    public QueryBaasPromotionActivityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBaasPromotionActivityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBaasPromotionActivityRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

}
