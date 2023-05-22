// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RegisterEcarEnterprisememberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册会员在蚂蚁DIS服务的DID账号
    @NameInMap("account_did")
    public String accountDid;

    // 注册会员姓名
    @NameInMap("name")
    public String name;

    // 注册会员身份证号码
    @NameInMap("identity_card_code")
    public String identityCardCode;

    public static RegisterEcarEnterprisememberRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterEcarEnterprisememberRequest self = new RegisterEcarEnterprisememberRequest();
        return TeaModel.build(map, self);
    }

    public RegisterEcarEnterprisememberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterEcarEnterprisememberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterEcarEnterprisememberRequest setAccountDid(String accountDid) {
        this.accountDid = accountDid;
        return this;
    }
    public String getAccountDid() {
        return this.accountDid;
    }

    public RegisterEcarEnterprisememberRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterEcarEnterprisememberRequest setIdentityCardCode(String identityCardCode) {
        this.identityCardCode = identityCardCode;
        return this;
    }
    public String getIdentityCardCode() {
        return this.identityCardCode;
    }

}
