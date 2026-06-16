// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class QueryMultiCciuRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aaa
    @NameInMap("aaaaa")
    public TestParams aaaaa;

    // bbbbb
    @NameInMap("bbbbb")
    public String bbbbb;

    public static QueryMultiCciuRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMultiCciuRequest self = new QueryMultiCciuRequest();
        return TeaModel.build(map, self);
    }

    public QueryMultiCciuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMultiCciuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMultiCciuRequest setAaaaa(TestParams aaaaa) {
        this.aaaaa = aaaaa;
        return this;
    }
    public TestParams getAaaaa() {
        return this.aaaaa;
    }

    public QueryMultiCciuRequest setBbbbb(String bbbbb) {
        this.bbbbb = bbbbb;
        return this;
    }
    public String getBbbbb() {
        return this.bbbbb;
    }

}
