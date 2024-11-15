// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class UpdateInstanceTenantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 实例ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 履约幂等号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户操作
    @NameInMap("tenant_operator_enum")
    @Validation(required = true)
    public String tenantOperatorEnum;

    // 扩展信息
    @NameInMap("extension_info")
    public String extensionInfo;

    // 修改时间戳
    @NameInMap("version_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String versionTimestamp;

    public static UpdateInstanceTenantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceTenantRequest self = new UpdateInstanceTenantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceTenantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInstanceTenantRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceTenantRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public UpdateInstanceTenantRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInstanceTenantRequest setTenantOperatorEnum(String tenantOperatorEnum) {
        this.tenantOperatorEnum = tenantOperatorEnum;
        return this;
    }
    public String getTenantOperatorEnum() {
        return this.tenantOperatorEnum;
    }

    public UpdateInstanceTenantRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public UpdateInstanceTenantRequest setVersionTimestamp(String versionTimestamp) {
        this.versionTimestamp = versionTimestamp;
        return this;
    }
    public String getVersionTimestamp() {
        return this.versionTimestamp;
    }

}
