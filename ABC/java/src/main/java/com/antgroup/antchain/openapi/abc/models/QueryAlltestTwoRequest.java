// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryAlltestTwoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // 1
    @NameInMap("a")
    @Validation(required = true)
    public TestDemo a;

    public static QueryAlltestTwoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAlltestTwoRequest self = new QueryAlltestTwoRequest();
        return TeaModel.build(map, self);
    }

    public QueryAlltestTwoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAlltestTwoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAlltestTwoRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public QueryAlltestTwoRequest setA(TestDemo a) {
        this.a = a;
        return this;
    }
    public TestDemo getA() {
        return this.a;
    }

}
