// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerPromotionsceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 场景名称
    @NameInMap("scene_name")
    public String sceneName;

    // 场景备注
    @NameInMap("scene_remark")
    public String sceneRemark;

    public static UpdateInnerPromotionsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerPromotionsceneRequest self = new UpdateInnerPromotionsceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerPromotionsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerPromotionsceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerPromotionsceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerPromotionsceneRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UpdateInnerPromotionsceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public UpdateInnerPromotionsceneRequest setSceneRemark(String sceneRemark) {
        this.sceneRemark = sceneRemark;
        return this;
    }
    public String getSceneRemark() {
        return this.sceneRemark;
    }

}
