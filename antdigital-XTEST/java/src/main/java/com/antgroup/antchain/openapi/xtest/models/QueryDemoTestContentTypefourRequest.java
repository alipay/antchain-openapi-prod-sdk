// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.xtest.models;

import com.aliyun.tea.*;

public class QueryDemoTestContentTypefourRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询输入
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static QueryDemoTestContentTypefourRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestContentTypefourRequest self = new QueryDemoTestContentTypefourRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestContentTypefourRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestContentTypefourRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestContentTypefourRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
