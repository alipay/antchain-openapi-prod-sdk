// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryXxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 213
    @NameInMap("test")
    public String test;

    // 123
    @NameInMap("idcard")
    public ContentTest idcard;

    public static QueryXxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryXxRequest self = new QueryXxRequest();
        return TeaModel.build(map, self);
    }

    public QueryXxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryXxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryXxRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

    public QueryXxRequest setIdcard(ContentTest idcard) {
        this.idcard = idcard;
        return this;
    }
    public ContentTest getIdcard() {
        return this.idcard;
    }

}
