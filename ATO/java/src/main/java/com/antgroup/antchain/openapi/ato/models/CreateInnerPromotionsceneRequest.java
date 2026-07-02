// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerPromotionsceneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 场景名称
    @NameInMap("scene_name")
    @Validation(required = true)
    public String sceneName;

    // 场景备注
    @NameInMap("scene_remark")
    public String sceneRemark;

    public static CreateInnerPromotionsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerPromotionsceneRequest self = new CreateInnerPromotionsceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerPromotionsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerPromotionsceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerPromotionsceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerPromotionsceneRequest setSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }
    public String getSceneName() {
        return this.sceneName;
    }

    public CreateInnerPromotionsceneRequest setSceneRemark(String sceneRemark) {
        this.sceneRemark = sceneRemark;
        return this;
    }
    public String getSceneRemark() {
        return this.sceneRemark;
    }

}
