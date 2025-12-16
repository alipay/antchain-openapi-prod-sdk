// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DetailAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 空间id
    @NameInMap("source_space_id")
    @Validation(required = true)
    public String sourceSpaceId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    public static DetailAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAuthConfigRequest self = new DetailAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public DetailAuthConfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAuthConfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAuthConfigRequest setSourceSpaceId(String sourceSpaceId) {
        this.sourceSpaceId = sourceSpaceId;
        return this;
    }
    public String getSourceSpaceId() {
        return this.sourceSpaceId;
    }

    public DetailAuthConfigRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
