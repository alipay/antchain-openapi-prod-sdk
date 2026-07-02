// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DeleteInnerPromotionsceneRequest extends TeaModel {
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

    public static DeleteInnerPromotionsceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInnerPromotionsceneRequest self = new DeleteInnerPromotionsceneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInnerPromotionsceneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteInnerPromotionsceneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteInnerPromotionsceneRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteInnerPromotionsceneRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
