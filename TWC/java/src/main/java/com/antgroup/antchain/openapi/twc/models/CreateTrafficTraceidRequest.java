// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateTrafficTraceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 用户Id
    @NameInMap("user_id")
    public String userId;

    // 渠道说明
    @NameInMap("source")
    public String source;

    public static CreateTrafficTraceidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrafficTraceidRequest self = new CreateTrafficTraceidRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrafficTraceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTrafficTraceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTrafficTraceidRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public CreateTrafficTraceidRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateTrafficTraceidRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
