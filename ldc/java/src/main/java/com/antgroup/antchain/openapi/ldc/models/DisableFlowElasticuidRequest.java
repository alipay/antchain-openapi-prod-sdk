// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DisableFlowElasticuidRequest extends TeaModel {
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

    // 弹回的 UID 分片
    @NameInMap("resume_uids")
    @Validation(required = true)
    public java.util.List<Long> resumeUids;

    // 是否压测（默认 false）
    @NameInMap("press")
    public Boolean press;

    // 是否灰度（默认 false）
    @NameInMap("gray")
    public Boolean gray;

    public static DisableFlowElasticuidRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableFlowElasticuidRequest self = new DisableFlowElasticuidRequest();
        return TeaModel.build(map, self);
    }

    public DisableFlowElasticuidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableFlowElasticuidRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DisableFlowElasticuidRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DisableFlowElasticuidRequest setResumeUids(java.util.List<Long> resumeUids) {
        this.resumeUids = resumeUids;
        return this;
    }
    public java.util.List<Long> getResumeUids() {
        return this.resumeUids;
    }

    public DisableFlowElasticuidRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public DisableFlowElasticuidRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

}
