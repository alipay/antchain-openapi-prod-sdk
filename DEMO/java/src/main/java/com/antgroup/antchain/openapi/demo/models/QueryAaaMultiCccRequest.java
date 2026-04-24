// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryAaaMultiCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 12
    @NameInMap("idcard")
    public CardInfo idcard;

    // 1
    @NameInMap("test")
    public String test;

    // 123456
    @NameInMap("demo_info")
    public DemoInfo demoInfo;

    public static QueryAaaMultiCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAaaMultiCccRequest self = new QueryAaaMultiCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryAaaMultiCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAaaMultiCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAaaMultiCccRequest setIdcard(CardInfo idcard) {
        this.idcard = idcard;
        return this;
    }
    public CardInfo getIdcard() {
        return this.idcard;
    }

    public QueryAaaMultiCccRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

    public QueryAaaMultiCccRequest setDemoInfo(DemoInfo demoInfo) {
        this.demoInfo = demoInfo;
        return this;
    }
    public DemoInfo getDemoInfo() {
        return this.demoInfo;
    }

}
