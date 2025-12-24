// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ListInnerSceneproductmerchantRequest extends TeaModel {
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

    public static ListInnerSceneproductmerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInnerSceneproductmerchantRequest self = new ListInnerSceneproductmerchantRequest();
        return TeaModel.build(map, self);
    }

    public ListInnerSceneproductmerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListInnerSceneproductmerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListInnerSceneproductmerchantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListInnerSceneproductmerchantRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public ListInnerSceneproductmerchantRequest setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

}
