// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class VerifyDataAuthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户表示类型
    @NameInMap("user_type")
    public String userType;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 数据源连接器空间id
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 企业信用代码
    @NameInMap("enterprise_code")
    @Validation(required = true)
    public String enterpriseCode;

    // 授权token
    @NameInMap("authorized_token")
    @Validation(required = true)
    public String authorizedToken;

    // 国标产品标识码
    @NameInMap("product_identity_id")
    @Validation(required = true)
    public String productIdentityId;

    public static VerifyDataAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDataAuthRequest self = new VerifyDataAuthRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDataAuthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyDataAuthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyDataAuthRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyDataAuthRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public VerifyDataAuthRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public VerifyDataAuthRequest setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public VerifyDataAuthRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public VerifyDataAuthRequest setAuthorizedToken(String authorizedToken) {
        this.authorizedToken = authorizedToken;
        return this;
    }
    public String getAuthorizedToken() {
        return this.authorizedToken;
    }

    public VerifyDataAuthRequest setProductIdentityId(String productIdentityId) {
        this.productIdentityId = productIdentityId;
        return this;
    }
    public String getProductIdentityId() {
        return this.productIdentityId;
    }

}
