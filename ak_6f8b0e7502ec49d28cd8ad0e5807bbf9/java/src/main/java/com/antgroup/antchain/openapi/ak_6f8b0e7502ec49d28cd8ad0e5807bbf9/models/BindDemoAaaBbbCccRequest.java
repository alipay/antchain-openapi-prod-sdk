// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_6f8b0e7502ec49d28cd8ad0e5807bbf9.models;

import com.aliyun.tea.*;

public class BindDemoAaaBbbCccRequest extends TeaModel {
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

    public static BindDemoAaaBbbCccRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoAaaBbbCccRequest self = new BindDemoAaaBbbCccRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoAaaBbbCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoAaaBbbCccRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindDemoAaaBbbCccRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public BindDemoAaaBbbCccRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
