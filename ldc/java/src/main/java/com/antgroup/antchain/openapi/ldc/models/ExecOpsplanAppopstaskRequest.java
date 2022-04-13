// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecOpsplanAppopstaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 操作类型
    @NameInMap("control_type")
    @Validation(required = true)
    public String controlType;

    // pipeline stage 名字
    @NameInMap("action_code")
    @Validation(required = true)
    public String actionCode;

    // 任务id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // operator名字
    @NameInMap("operator")
    public String operator;

    // [huanyu场景使用]，当cancel_plan_flag为true, control_type=CANCEL且action_code=CLOUD_NATIVE_DEPLOY时，整个运维单将被取消
    @NameInMap("cancel_plan_flag")
    public Boolean cancelPlanFlag;

    public static ExecOpsplanAppopstaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecOpsplanAppopstaskRequest self = new ExecOpsplanAppopstaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecOpsplanAppopstaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecOpsplanAppopstaskRequest setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public ExecOpsplanAppopstaskRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public ExecOpsplanAppopstaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecOpsplanAppopstaskRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ExecOpsplanAppopstaskRequest setCancelPlanFlag(Boolean cancelPlanFlag) {
        this.cancelPlanFlag = cancelPlanFlag;
        return this;
    }
    public Boolean getCancelPlanFlag() {
        return this.cancelPlanFlag;
    }

}
