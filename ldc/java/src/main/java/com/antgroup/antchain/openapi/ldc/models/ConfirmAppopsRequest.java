// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ConfirmAppopsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 运维单timeSeriesId
    @NameInMap("operation_id")
    @Validation(required = true)
    public String operationId;

    // 操作人账号
    @NameInMap("operator")
    public String operator;

    // 租户编码
    @NameInMap("tenant_name")
    public String tenantName;

    // 服务分组id
    @NameInMap("service_group_id")
    public String serviceGroupId;

    public static ConfirmAppopsRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAppopsRequest self = new ConfirmAppopsRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAppopsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmAppopsRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ConfirmAppopsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ConfirmAppopsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ConfirmAppopsRequest setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

}
