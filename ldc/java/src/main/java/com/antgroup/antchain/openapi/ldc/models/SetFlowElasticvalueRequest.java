// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SetFlowElasticvalueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 弹性值，对应zdal里的弹性位，比如52，53等
    @NameInMap("elastic_values")
    @Validation(required = true)
    public java.util.List<String> elasticValues;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 是否弹性（默认 false）
    @NameInMap("press")
    public Boolean press;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static SetFlowElasticvalueRequest build(java.util.Map<String, ?> map) throws Exception {
        SetFlowElasticvalueRequest self = new SetFlowElasticvalueRequest();
        return TeaModel.build(map, self);
    }

    public SetFlowElasticvalueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetFlowElasticvalueRequest setElasticValues(java.util.List<String> elasticValues) {
        this.elasticValues = elasticValues;
        return this;
    }
    public java.util.List<String> getElasticValues() {
        return this.elasticValues;
    }

    public SetFlowElasticvalueRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public SetFlowElasticvalueRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SetFlowElasticvalueRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public SetFlowElasticvalueRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
