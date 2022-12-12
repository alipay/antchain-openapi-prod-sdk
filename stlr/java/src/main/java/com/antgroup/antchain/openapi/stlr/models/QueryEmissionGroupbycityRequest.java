// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEmissionGroupbycityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 活动编码
    @NameInMap("activity_no")
    @Validation(required = true)
    public String activityNo;

    public static QueryEmissionGroupbycityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEmissionGroupbycityRequest self = new QueryEmissionGroupbycityRequest();
        return TeaModel.build(map, self);
    }

    public QueryEmissionGroupbycityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEmissionGroupbycityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEmissionGroupbycityRequest setActivityNo(String activityNo) {
        this.activityNo = activityNo;
        return this;
    }
    public String getActivityNo() {
        return this.activityNo;
    }

}
