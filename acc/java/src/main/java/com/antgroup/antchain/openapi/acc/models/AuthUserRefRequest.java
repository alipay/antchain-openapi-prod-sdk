// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class AuthUserRefRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作员id，一般是C类用户
    @NameInMap("operator_id")
    @Validation(required = true)
    public Long operatorId;

    // 待登录的B类账号id
    @NameInMap("ref_user_id")
    @Validation(required = true)
    public Long refUserId;

    // operatorId 用户登录时对应的accessToken
    // 
    // 
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 是否设为默认企业(1 设置默认企业 0 切换临时企业)
    // 
    // 
    @NameInMap("set_default")
    @Validation(required = true)
    public Long setDefault;

    public static AuthUserRefRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthUserRefRequest self = new AuthUserRefRequest();
        return TeaModel.build(map, self);
    }

    public AuthUserRefRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthUserRefRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthUserRefRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

    public AuthUserRefRequest setRefUserId(Long refUserId) {
        this.refUserId = refUserId;
        return this;
    }
    public Long getRefUserId() {
        return this.refUserId;
    }

    public AuthUserRefRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public AuthUserRefRequest setSetDefault(Long setDefault) {
        this.setDefault = setDefault;
        return this;
    }
    public Long getSetDefault() {
        return this.setDefault;
    }

}
