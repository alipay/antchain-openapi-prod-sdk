// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class BindUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 支付宝：ALIPAY
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    // 开放平台用户id
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    public static BindUserRequest build(java.util.Map<String, ?> map) throws Exception {
        BindUserRequest self = new BindUserRequest();
        return TeaModel.build(map, self);
    }

    public BindUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BindUserRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public BindUserRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
