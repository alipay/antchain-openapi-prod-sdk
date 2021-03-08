// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class JudgeAuthorityRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 操作点id
    @NameInMap("action_id")
    @Validation(required = true)
    public String actionId;

    // 鉴权条件
    @NameInMap("conditions")
    public java.util.List<Condition> conditions;

    // 鉴权对象id
    @NameInMap("operator_id")
    @Validation(required = true)
    public String operatorId;

    public static JudgeAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        JudgeAuthorityRequest self = new JudgeAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public JudgeAuthorityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public JudgeAuthorityRequest setActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }
    public String getActionId() {
        return this.actionId;
    }

    public JudgeAuthorityRequest setConditions(java.util.List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<Condition> getConditions() {
        return this.conditions;
    }

    public JudgeAuthorityRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

}
