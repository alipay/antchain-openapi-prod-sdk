// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class SaveTenantconfigSpiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // configKey参数名称
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // end_point
    @NameInMap("end_point")
    @Validation(required = true)
    public String endPoint;

    // 默认为CamelCase
    @NameInMap("field_naming_strategy")
    public String fieldNamingStrategy;

    // 云厂商类型
    @NameInMap("cloud_vendor_type")
    public String cloudVendorType;

    public static SaveTenantconfigSpiRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTenantconfigSpiRequest self = new SaveTenantconfigSpiRequest();
        return TeaModel.build(map, self);
    }

    public SaveTenantconfigSpiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveTenantconfigSpiRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public SaveTenantconfigSpiRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public SaveTenantconfigSpiRequest setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

    public SaveTenantconfigSpiRequest setFieldNamingStrategy(String fieldNamingStrategy) {
        this.fieldNamingStrategy = fieldNamingStrategy;
        return this;
    }
    public String getFieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public SaveTenantconfigSpiRequest setCloudVendorType(String cloudVendorType) {
        this.cloudVendorType = cloudVendorType;
        return this;
    }
    public String getCloudVendorType() {
        return this.cloudVendorType;
    }

}
