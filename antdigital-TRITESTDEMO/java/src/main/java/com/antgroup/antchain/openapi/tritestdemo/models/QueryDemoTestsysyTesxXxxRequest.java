// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryDemoTestsysyTesxXxxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 张三
    @NameInMap("name")
    public String name;

    public static QueryDemoTestsysyTesxXxxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestsysyTesxXxxRequest self = new QueryDemoTestsysyTesxXxxRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestsysyTesxXxxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestsysyTesxXxxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestsysyTesxXxxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
