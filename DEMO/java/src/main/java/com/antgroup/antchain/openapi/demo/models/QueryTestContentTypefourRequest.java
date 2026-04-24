// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypefourRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询输入
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryTestContentTypefourRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypefourRequest self = new QueryTestContentTypefourRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypefourRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestContentTypefourRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestContentTypefourRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
