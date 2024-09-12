// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class UpdateUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户信息
    @NameInMap("user")
    @Validation(required = true)
    public ACSUserInfo user;

    // 用户登陆名
    @NameInMap("userid")
    public String userid;

    public static UpdateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserRequest self = new UpdateUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateUserRequest setUser(ACSUserInfo user) {
        this.user = user;
        return this;
    }
    public ACSUserInfo getUser() {
        return this.user;
    }

    public UpdateUserRequest setUserid(String userid) {
        this.userid = userid;
        return this;
    }
    public String getUserid() {
        return this.userid;
    }

}
