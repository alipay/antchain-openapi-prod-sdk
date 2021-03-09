// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class UpdateOperatorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 邮箱
    @NameInMap("email")
    public String email;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    // 操作员昵称
    @NameInMap("nickname")
    public String nickname;

    // 操作员唯一ID
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    // 操作员真实姓名
    @NameInMap("real_name")
    public String realName;

    public static UpdateOperatorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperatorRequest self = new UpdateOperatorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOperatorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOperatorRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateOperatorRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public UpdateOperatorRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public UpdateOperatorRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public UpdateOperatorRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

}
