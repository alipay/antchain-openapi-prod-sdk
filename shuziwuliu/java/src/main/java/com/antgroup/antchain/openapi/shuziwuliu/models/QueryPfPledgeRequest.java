// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfPledgeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 质押id
    @NameInMap("pledge_id")
    @Validation(required = true, maxLength = 32, minLength = 16)
    public String pledgeId;

    public static QueryPfPledgeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPfPledgeRequest self = new QueryPfPledgeRequest();
        return TeaModel.build(map, self);
    }

    public QueryPfPledgeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPfPledgeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPfPledgeRequest setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
        return this;
    }
    public String getPledgeId() {
        return this.pledgeId;
    }

}
