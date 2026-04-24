// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypefiveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询入参
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryTestContentTypefiveRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypefiveRequest self = new QueryTestContentTypefiveRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypefiveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestContentTypefiveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestContentTypefiveRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
