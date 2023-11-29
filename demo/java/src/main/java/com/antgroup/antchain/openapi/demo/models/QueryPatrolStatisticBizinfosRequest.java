// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryPatrolStatisticBizinfosRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 日期
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static QueryPatrolStatisticBizinfosRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPatrolStatisticBizinfosRequest self = new QueryPatrolStatisticBizinfosRequest();
        return TeaModel.build(map, self);
    }

    public QueryPatrolStatisticBizinfosRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPatrolStatisticBizinfosRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPatrolStatisticBizinfosRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
