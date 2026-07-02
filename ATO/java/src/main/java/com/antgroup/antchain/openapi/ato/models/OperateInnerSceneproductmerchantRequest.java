// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperateInnerSceneproductmerchantRequest extends TeaModel {
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

    // 商家商品spuid列表
    @NameInMap("merchant_product_id_list")
    public java.util.List<String> merchantProductIdList;

    public static OperateInnerSceneproductmerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateInnerSceneproductmerchantRequest self = new OperateInnerSceneproductmerchantRequest();
        return TeaModel.build(map, self);
    }

    public OperateInnerSceneproductmerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateInnerSceneproductmerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateInnerSceneproductmerchantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OperateInnerSceneproductmerchantRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public OperateInnerSceneproductmerchantRequest setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public OperateInnerSceneproductmerchantRequest setMerchantProductIdList(java.util.List<String> merchantProductIdList) {
        this.merchantProductIdList = merchantProductIdList;
        return this;
    }
    public java.util.List<String> getMerchantProductIdList() {
        return this.merchantProductIdList;
    }

}
