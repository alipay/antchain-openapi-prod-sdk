// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosy.models;

import com.aliyun.tea.*;

public class XxxDemoAaaBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("date")
    @Validation(required = true)
    public DemoClass date;

    // 123
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static XxxDemoAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        XxxDemoAaaBbbCccRequest self = new XxxDemoAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public XxxDemoAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public XxxDemoAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public XxxDemoAaaBbbCccRequest setDate(DemoClass date) {
        this.date = date;
        return this;
    }
    public DemoClass getDate() {
        return this.date;
    }

    public XxxDemoAaaBbbCccRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
