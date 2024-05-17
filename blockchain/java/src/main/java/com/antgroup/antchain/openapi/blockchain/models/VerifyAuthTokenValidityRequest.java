// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyAuthTokenValidityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 授权凭证
    @NameInMap("authorized_token")
    @Validation(required = true)
    public String authorizedToken;

    // 数据产品类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 授权场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static VerifyAuthTokenValidityRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthTokenValidityRequest self = new VerifyAuthTokenValidityRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAuthTokenValidityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAuthTokenValidityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAuthTokenValidityRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyAuthTokenValidityRequest setAuthorizedToken(String authorizedToken) {
        this.authorizedToken = authorizedToken;
        return this;
    }
    public String getAuthorizedToken() {
        return this.authorizedToken;
    }

    public VerifyAuthTokenValidityRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public VerifyAuthTokenValidityRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
