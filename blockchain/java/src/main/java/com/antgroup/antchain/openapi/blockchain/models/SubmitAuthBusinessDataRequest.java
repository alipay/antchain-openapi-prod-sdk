// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SubmitAuthBusinessDataRequest extends TeaModel {
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

    // 推送的数据内容，json字符串形式
    @NameInMap("push_data_content")
    @Validation(required = true)
    public String pushDataContent;

    public static SubmitAuthBusinessDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAuthBusinessDataRequest self = new SubmitAuthBusinessDataRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAuthBusinessDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAuthBusinessDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAuthBusinessDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SubmitAuthBusinessDataRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public SubmitAuthBusinessDataRequest setPushDataContent(String pushDataContent) {
        this.pushDataContent = pushDataContent;
        return this;
    }
    public String getPushDataContent() {
        return this.pushDataContent;
    }

}
