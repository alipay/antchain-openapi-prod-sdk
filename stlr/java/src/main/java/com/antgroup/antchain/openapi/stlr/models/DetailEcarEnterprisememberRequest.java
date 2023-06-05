// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DetailEcarEnterprisememberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 注册会员手机号码
    @NameInMap("mobile")
    public String mobile;

    // 注册会员身份证号码
    @NameInMap("identity_card_code")
    public String identityCardCode;

    public static DetailEcarEnterprisememberRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailEcarEnterprisememberRequest self = new DetailEcarEnterprisememberRequest();
        return TeaModel.build(map, self);
    }

    public DetailEcarEnterprisememberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailEcarEnterprisememberRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailEcarEnterprisememberRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public DetailEcarEnterprisememberRequest setIdentityCardCode(String identityCardCode) {
        this.identityCardCode = identityCardCode;
        return this;
    }
    public String getIdentityCardCode() {
        return this.identityCardCode;
    }

}
