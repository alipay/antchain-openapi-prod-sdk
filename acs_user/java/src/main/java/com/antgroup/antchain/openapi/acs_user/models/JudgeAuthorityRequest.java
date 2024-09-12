// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class JudgeAuthorityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id，和参数token二者必须有一个不能为空
    @NameInMap("user_id")
    public String userId;

    // 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
    @NameInMap("token")
    public String token;

    // 产品编码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 对应的权限码或者是角色编码
    @NameInMap("action_code")
    @Validation(required = true)
    public String actionCode;

    // 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
    @NameInMap("action_type")
    @Validation(required = true)
    public String actionType;

    public static JudgeAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAuthorityRequest self = new JudgeAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAuthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAuthorityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public JudgeAuthorityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public JudgeAuthorityRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public JudgeAuthorityRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public JudgeAuthorityRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public JudgeAuthorityRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

}
