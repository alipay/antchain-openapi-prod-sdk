// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UpdateAuthStatusRequest extends TeaModel {
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

    // 被授权方企业信用代码
    @NameInMap("auth_enterprise_code")
    @Validation(required = true)
    public String authEnterpriseCode;

    // 场景码
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 授权状态
    @NameInMap("auth_status")
    @Validation(required = true)
    public Boolean authStatus;

    public static UpdateAuthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthStatusRequest self = new UpdateAuthStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAuthStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAuthStatusRequest setSourceServiceNodeId(String sourceServiceNodeId) {
        this.sourceServiceNodeId = sourceServiceNodeId;
        return this;
    }
    public String getSourceServiceNodeId() {
        return this.sourceServiceNodeId;
    }

    public UpdateAuthStatusRequest setSourceTenantId(String sourceTenantId) {
        this.sourceTenantId = sourceTenantId;
        return this;
    }
    public String getSourceTenantId() {
        return this.sourceTenantId;
    }

    public UpdateAuthStatusRequest setAuthEnterpriseCode(String authEnterpriseCode) {
        this.authEnterpriseCode = authEnterpriseCode;
        return this;
    }
    public String getAuthEnterpriseCode() {
        return this.authEnterpriseCode;
    }

    public UpdateAuthStatusRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public UpdateAuthStatusRequest setAuthStatus(Boolean authStatus) {
        this.authStatus = authStatus;
        return this;
    }
    public Boolean getAuthStatus() {
        return this.authStatus;
    }

}
