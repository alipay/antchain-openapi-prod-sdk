// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class InitGateWayServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 测试
    @NameInMap("user")
    @Validation(required = true)
    public String user;

    // 测试
    @NameInMap("pass")
    @Validation(required = true)
    public String pass;

    public static InitGateWayServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitGateWayServiceRequest self = new InitGateWayServiceRequest();
        return TeaModel.build(map, self);
    }

    public InitGateWayServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitGateWayServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitGateWayServiceRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

    public InitGateWayServiceRequest setPass(String pass) {
        this.pass = pass;
        return this;
    }
    public String getPass() {
        return this.pass;
    }

}
