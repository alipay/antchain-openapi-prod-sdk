// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DetailAuthConfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源可信空间id
    @NameInMap("source_service_node_id")
    @Validation(required = true)
    public String sourceServiceNodeId;

    // 数据源租户id
    @NameInMap("source_tenant_id")
    @Validation(required = true)
    public String sourceTenantId;

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

    public DetailAuthConfigRequest setSourceServiceNodeId(String sourceServiceNodeId) {
        this.sourceServiceNodeId = sourceServiceNodeId;
        return this;
    }
    public String getSourceServiceNodeId() {
        return this.sourceServiceNodeId;
    }

    public DetailAuthConfigRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public DetailAuthConfigRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
