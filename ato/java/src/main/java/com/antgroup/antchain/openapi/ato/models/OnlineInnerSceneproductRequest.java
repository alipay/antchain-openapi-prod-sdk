// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OnlineInnerSceneproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    public String tenantId;

    // 场景Code
    @NameInMap("scene_code")
    public String sceneCode;

    // 平台商品ID
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 上下架状态
    @NameInMap("display_status")
    public String displayStatus;

    // 推广方式
    @NameInMap("delivery_mode")
    public String deliveryMode;

    public static OnlineInnerSceneproductRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineInnerSceneproductRequest self = new OnlineInnerSceneproductRequest();
        return TeaModel.build(map, self);
    }

    public OnlineInnerSceneproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineInnerSceneproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineInnerSceneproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OnlineInnerSceneproductRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public OnlineInnerSceneproductRequest setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public OnlineInnerSceneproductRequest setDisplayStatus(String displayStatus) {
        this.displayStatus = displayStatus;
        return this;
    }
    public String getDisplayStatus() {
        return this.displayStatus;
    }

    public OnlineInnerSceneproductRequest setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }
    public String getDeliveryMode() {
        return this.deliveryMode;
    }

}
