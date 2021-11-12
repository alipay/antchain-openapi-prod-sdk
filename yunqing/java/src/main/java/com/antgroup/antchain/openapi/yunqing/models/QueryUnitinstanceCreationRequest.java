// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryUnitinstanceCreationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发布单ID
    @NameInMap("ops_plan_id")
    @Validation(required = true)
    public String opsPlanId;

    public static QueryUnitinstanceCreationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUnitinstanceCreationRequest self = new QueryUnitinstanceCreationRequest();
        return TeaModel.build(map, self);
    }

    public QueryUnitinstanceCreationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUnitinstanceCreationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryUnitinstanceCreationRequest setOpsPlanId(String opsPlanId) {
        this.opsPlanId = opsPlanId;
        return this;
    }
    public String getOpsPlanId() {
        return this.opsPlanId;
    }

}
