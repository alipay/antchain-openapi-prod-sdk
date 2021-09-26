// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportIotplatformMeshidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 客户的金融云租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 客户的公司名称
    @NameInMap("company_name")
    @Validation(required = true)
    public String companyName;

    // 设备按照MeshAgent后获取的MeshId
    @NameInMap("mesh_id")
    @Validation(required = true)
    public String meshId;

    // 客户自定义的业务上使用的设备标识，需要与租赁业务上使用的ID进行对应
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备类型字段
    @NameInMap("type")
    public String type;

    // 代理商名称，用于二级代理模式
    @NameInMap("agent_name")
    public String agentName;

    public static ImportIotplatformMeshidRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportIotplatformMeshidRequest self = new ImportIotplatformMeshidRequest();
        return TeaModel.build(map, self);
    }

    public ImportIotplatformMeshidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportIotplatformMeshidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportIotplatformMeshidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ImportIotplatformMeshidRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public ImportIotplatformMeshidRequest setMeshId(String meshId) {
        this.meshId = meshId;
        return this;
    }
    public String getMeshId() {
        return this.meshId;
    }

    public ImportIotplatformMeshidRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public ImportIotplatformMeshidRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ImportIotplatformMeshidRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

}
