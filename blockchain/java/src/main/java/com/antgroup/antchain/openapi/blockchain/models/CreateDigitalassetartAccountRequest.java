// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDigitalassetartAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户手机号
    @NameInMap("phone")
    @Validation(required = true)
    public String phone;

    // 用户的支付宝账号
    @NameInMap("user_account")
    @Validation(required = true)
    public String userAccount;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static CreateDigitalassetartAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalassetartAccountRequest self = new CreateDigitalassetartAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalassetartAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDigitalassetartAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDigitalassetartAccountRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateDigitalassetartAccountRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public CreateDigitalassetartAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
