// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DisableFlowElasticvalueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 是否弹性（默认 false）
    @NameInMap("press")
    public Boolean press;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    public static DisableFlowElasticvalueRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowElasticvalueRequest self = new DisableFlowElasticvalueRequest();
        return TeaModel.build(map, self);
    }

    public DisableFlowElasticvalueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableFlowElasticvalueRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DisableFlowElasticvalueRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DisableFlowElasticvalueRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public DisableFlowElasticvalueRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

}
