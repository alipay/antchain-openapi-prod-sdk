// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1fef8815252948ebb01da07898dd0fb2.models;

import com.aliyun.tea.*;

public class QueryAntchainBbpCustomerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询内容
    @NameInMap("condition_map")
    @Validation(required = true)
    public java.util.List<QueryMap> conditionMap;

    public static QueryAntchainBbpCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainBbpCustomerRequest self = new QueryAntchainBbpCustomerRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainBbpCustomerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainBbpCustomerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainBbpCustomerRequest setConditionMap(java.util.List<QueryMap> conditionMap) {
        this.conditionMap = conditionMap;
        return this;
    }
    public java.util.List<QueryMap> getConditionMap() {
        return this.conditionMap;
    }

}
