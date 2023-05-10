// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d9fd09cd1986473d9a4b8dde727aa361.models;

import com.aliyun.tea.*;

public class CheckInternationalDemoZolozHealthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 1123
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static CheckInternationalDemoZolozHealthRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckInternationalDemoZolozHealthRequest self = new CheckInternationalDemoZolozHealthRequest();
        return TeaModel.build(map, self);
    }

    public CheckInternationalDemoZolozHealthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckInternationalDemoZolozHealthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckInternationalDemoZolozHealthRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
