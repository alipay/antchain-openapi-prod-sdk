// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdksy.models;

import com.aliyun.tea.*;

public class QueryBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // fd
    @NameInMap("tes")
    public String tes;

    // 测试
    @NameInMap("test_req")
    @Validation(required = true)
    public TessReq testReq;

    public static QueryBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBbbCccRequest self = new QueryBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBbbCccRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryBbbCccRequest setTes(String tes) {
        this.tes = tes;
        return this;
    }
    public String getTes() {
        return this.tes;
    }

    public QueryBbbCccRequest setTestReq(TessReq testReq) {
        this.testReq = testReq;
        return this;
    }
    public TessReq getTestReq() {
        return this.testReq;
    }

}
