// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryNotaryBidreasonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 公证处 ID
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    public static QueryNotaryBidreasonRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryNotaryBidreasonRequest self = new QueryNotaryBidreasonRequest();
        return TeaModel.build(map, self);
    }

    public QueryNotaryBidreasonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryNotaryBidreasonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryNotaryBidreasonRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

}
