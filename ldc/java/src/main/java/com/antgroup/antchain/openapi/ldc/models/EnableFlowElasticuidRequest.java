// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EnableFlowElasticuidRequest extends TeaModel {
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

    // 弹出的 UID 信息
    @NameInMap("pop_out_uids")
    @Validation(required = true)
    public java.util.List<PopOutUid> popOutUids;

    // 是否压测流量（默认 false）
    @NameInMap("press")
    public Boolean press;

    // 是否灰度流量（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    public static EnableFlowElasticuidRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableFlowElasticuidRequest self = new EnableFlowElasticuidRequest();
        return TeaModel.build(map, self);
    }

    public EnableFlowElasticuidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public EnableFlowElasticuidRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public EnableFlowElasticuidRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public EnableFlowElasticuidRequest setPopOutUids(java.util.List<PopOutUid> popOutUids) {
        this.popOutUids = popOutUids;
        return this;
    }
    public java.util.List<PopOutUid> getPopOutUids() {
        return this.popOutUids;
    }

    public EnableFlowElasticuidRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public EnableFlowElasticuidRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

}
