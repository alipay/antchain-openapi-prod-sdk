// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AuthAuthBusinessUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加密后的授权记录bizId
    @NameInMap("encrypt_biz_id")
    @Validation(required = true)
    public String encryptBizId;

    // 唯一场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static AuthAuthBusinessUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthAuthBusinessUserRequest self = new AuthAuthBusinessUserRequest();
        return TeaModel.build(map, self);
    }

    public AuthAuthBusinessUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AuthAuthBusinessUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AuthAuthBusinessUserRequest setEncryptBizId(String encryptBizId) {
        this.encryptBizId = encryptBizId;
        return this;
    }
    public String getEncryptBizId() {
        return this.encryptBizId;
    }

    public AuthAuthBusinessUserRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
