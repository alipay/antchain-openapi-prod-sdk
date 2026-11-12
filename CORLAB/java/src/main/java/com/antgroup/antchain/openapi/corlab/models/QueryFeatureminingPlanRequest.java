// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class QueryFeatureminingPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 特征计划任务ID
    @NameInMap("plan_no")
    @Validation(required = true)
    public String planNo;

    public static QueryFeatureminingPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFeatureminingPlanRequest self = new QueryFeatureminingPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryFeatureminingPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFeatureminingPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFeatureminingPlanRequest setPlanNo(String planNo) {
        this.planNo = planNo;
        return this;
    }
    public String getPlanNo() {
        return this.planNo;
    }

}
