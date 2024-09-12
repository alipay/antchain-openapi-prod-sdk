// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class QueryAccessorRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 网关调用的服务access key
    @NameInMap("user_access_key")
    @Validation(required = true)
    public String userAccessKey;

    public static QueryAccessorRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAccessorRequest self = new QueryAccessorRequest();
        return TeaModel.build(map, self);
    }

    public QueryAccessorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAccessorRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAccessorRequest setUserAccessKey(String userAccessKey) {
        this.userAccessKey = userAccessKey;
        return this;
    }
    public String getUserAccessKey() {
        return this.userAccessKey;
    }

}
