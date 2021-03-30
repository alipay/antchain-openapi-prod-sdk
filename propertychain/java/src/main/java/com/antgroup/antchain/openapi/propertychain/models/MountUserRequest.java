// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class MountUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 物证平台用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 平台类别
    @NameInMap("platform")
    @Validation(required = true)
    public String platform;

    // 外部平台id
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    public static MountUserRequest build(java.util.Map<String, ?> map) throws Exception {
        MountUserRequest self = new MountUserRequest();
        return TeaModel.build(map, self);
    }

    public MountUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MountUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MountUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public MountUserRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public MountUserRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
