// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowElasticruleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 弹性规则 ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 弹性规则服务名称。
    // RPC：对应接口名，例如：com.alipay.cif.facade.AckCodeService:1.0:cif。
    // APP：对应应用名，例如：cif。
    // MSG或ANTQ：对应消息groupId，例如：S-UNIQUERY-SYNC。
    @NameInMap("service_name")
    @Validation(required = true)
    public String serviceName;

    // 弹性规则状态，可选值 VALID("线上生效")，PRESS("仅压测生效")，INVALID("无效状态");
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateFlowElasticruleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowElasticruleRequest self = new UpdateFlowElasticruleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowElasticruleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowElasticruleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFlowElasticruleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowElasticruleRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateFlowElasticruleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateFlowElasticruleRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
