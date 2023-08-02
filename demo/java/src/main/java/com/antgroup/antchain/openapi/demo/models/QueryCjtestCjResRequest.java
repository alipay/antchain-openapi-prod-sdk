// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryCjtestCjResRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1
    @NameInMap("test1")
    @Validation(required = true, maximum = 100, minimum = 1)
    public Long test1;

    // 2
    @NameInMap("test2")
    @Validation(required = true, maximum = 200, minimum = 100)
    public Long test2;

    public static QueryCjtestCjResRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCjtestCjResRequest self = new QueryCjtestCjResRequest();
        return TeaModel.build(map, self);
    }

    public QueryCjtestCjResRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCjtestCjResRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCjtestCjResRequest setTest1(Long test1) {
        this.test1 = test1;
        return this;
    }
    public Long getTest1() {
        return this.test1;
    }

    public QueryCjtestCjResRequest setTest2(Long test2) {
        this.test2 = test2;
        return this;
    }
    public Long getTest2() {
        return this.test2;
    }

}
