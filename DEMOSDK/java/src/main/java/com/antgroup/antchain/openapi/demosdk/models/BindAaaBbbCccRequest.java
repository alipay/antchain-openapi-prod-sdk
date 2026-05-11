// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class BindAaaBbbCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date;

    // 123
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 测试参数
    @NameInMap("demo_class")
    @Validation(required = true)
    public DemoClass demoClass;

    public static BindAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAaaBbbCccRequest self = new BindAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public BindAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindAaaBbbCccRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public BindAaaBbbCccRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BindAaaBbbCccRequest setDemoClass(DemoClass demoClass) {
        this.demoClass = demoClass;
        return this;
    }
    public DemoClass getDemoClass() {
        return this.demoClass;
    }

}
