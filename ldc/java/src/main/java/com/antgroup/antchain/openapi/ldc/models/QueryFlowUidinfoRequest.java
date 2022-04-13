// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryFlowUidinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 是否弹性（默认 false）
    @NameInMap("elastic")
    public Boolean elastic;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    // 是否压测（默认 false）
    @NameInMap("press")
    public Boolean press;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static QueryFlowUidinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFlowUidinfoRequest self = new QueryFlowUidinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryFlowUidinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFlowUidinfoRequest setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

    public QueryFlowUidinfoRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public QueryFlowUidinfoRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public QueryFlowUidinfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
