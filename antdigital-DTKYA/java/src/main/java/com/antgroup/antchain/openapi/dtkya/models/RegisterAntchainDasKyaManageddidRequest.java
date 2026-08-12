// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class RegisterAntchainDasKyaManageddidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实体类型
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 实体id
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 实体名称
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // 扩展信息，建议传 JSON 形式字符串
    @NameInMap("extra_info")
    public String extraInfo;

    // 服务端点
    @NameInMap("services")
    public java.util.List<ServiceInput> services;

    public static RegisterAntchainDasKyaManageddidRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterAntchainDasKyaManageddidRequest self = new RegisterAntchainDasKyaManageddidRequest();
        return TeaModel.build(map, self);
    }

    public RegisterAntchainDasKyaManageddidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterAntchainDasKyaManageddidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterAntchainDasKyaManageddidRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public RegisterAntchainDasKyaManageddidRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public RegisterAntchainDasKyaManageddidRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public RegisterAntchainDasKyaManageddidRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RegisterAntchainDasKyaManageddidRequest setServices(java.util.List<ServiceInput> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ServiceInput> getServices() {
        return this.services;
    }

}
