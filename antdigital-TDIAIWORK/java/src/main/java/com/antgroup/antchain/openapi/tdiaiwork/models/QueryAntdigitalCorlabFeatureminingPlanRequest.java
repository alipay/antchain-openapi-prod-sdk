// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class QueryAntdigitalCorlabFeatureminingPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 特征计划任务ID
    @NameInMap("plan_no")
    @Validation(required = true)
    public String planNo;

    public static QueryAntdigitalCorlabFeatureminingPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalCorlabFeatureminingPlanRequest self = new QueryAntdigitalCorlabFeatureminingPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalCorlabFeatureminingPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalCorlabFeatureminingPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalCorlabFeatureminingPlanRequest setPlanNo(String planNo) {
        this.planNo = planNo;
        return this;
    }
    public String getPlanNo() {
        return this.planNo;
    }

}
