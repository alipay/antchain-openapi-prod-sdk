// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryIotcseAsyncprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // {"key":"value"}
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static QueryIotcseAsyncprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotcseAsyncprocessRequest self = new QueryIotcseAsyncprocessRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotcseAsyncprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotcseAsyncprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotcseAsyncprocessRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
