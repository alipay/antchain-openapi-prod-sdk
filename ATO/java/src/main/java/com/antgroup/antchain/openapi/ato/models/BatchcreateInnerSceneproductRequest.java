// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchcreateInnerSceneproductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务商租户
    @NameInMap("tenant_id")
    public String tenantId;

    // 场景Code
    @NameInMap("scene_code")
    public String sceneCode;

    // 平台商品ID列表
    @NameInMap("platform_product_id_list")
    public java.util.List<String> platformProductIdList;

    public static BatchcreateInnerSceneproductRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateInnerSceneproductRequest self = new BatchcreateInnerSceneproductRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateInnerSceneproductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateInnerSceneproductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateInnerSceneproductRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchcreateInnerSceneproductRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public BatchcreateInnerSceneproductRequest setPlatformProductIdList(java.util.List<String> platformProductIdList) {
        this.platformProductIdList = platformProductIdList;
        return this;
    }
    public java.util.List<String> getPlatformProductIdList() {
        return this.platformProductIdList;
    }

}
