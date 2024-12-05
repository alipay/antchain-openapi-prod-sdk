// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class VerifyAuthBusinessUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户核验需要的额外信息，根据场景选择是否需要上传
    @NameInMap("verify_content")
    public String verifyContent;

    public static VerifyAuthBusinessUserRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAuthBusinessUserRequest self = new VerifyAuthBusinessUserRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAuthBusinessUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyAuthBusinessUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyAuthBusinessUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public VerifyAuthBusinessUserRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public VerifyAuthBusinessUserRequest setVerifyContent(String verifyContent) {
        this.verifyContent = verifyContent;
        return this;
    }
    public String getVerifyContent() {
        return this.verifyContent;
    }

}
