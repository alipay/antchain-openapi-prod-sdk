// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkTesxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryAntchainDemosdkTesxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkTesxRequest self = new QueryAntchainDemosdkTesxRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkTesxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDemosdkTesxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDemosdkTesxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
