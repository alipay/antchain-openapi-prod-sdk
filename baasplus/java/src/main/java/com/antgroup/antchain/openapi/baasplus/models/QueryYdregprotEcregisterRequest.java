// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdregprotEcregisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户手机号
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    public static QueryYdregprotEcregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYdregprotEcregisterRequest self = new QueryYdregprotEcregisterRequest();
        return TeaModel.build(map, self);
    }

    public QueryYdregprotEcregisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYdregprotEcregisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryYdregprotEcregisterRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
