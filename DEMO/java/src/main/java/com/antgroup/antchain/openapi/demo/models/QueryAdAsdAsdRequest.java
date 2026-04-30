// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAdAsdAsdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1111
    @NameInMap("bnumber")
    @Validation(required = true, maxLength = 2, minLength = 1)
    public String bnumber;

    public static QueryAdAsdAsdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAdAsdAsdRequest self = new QueryAdAsdAsdRequest();
        return TeaModel.build(map, self);
    }

    public QueryAdAsdAsdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAdAsdAsdRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAdAsdAsdRequest setBnumber(String bnumber) {
        this.bnumber = bnumber;
        return this;
    }
    public String getBnumber() {
        return this.bnumber;
    }

}
