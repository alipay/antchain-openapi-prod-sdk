// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class RegisterTagChanganRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static RegisterTagChanganRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTagChanganRequest self = new RegisterTagChanganRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTagChanganRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterTagChanganRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterTagChanganRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
