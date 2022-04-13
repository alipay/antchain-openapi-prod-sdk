// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFlowUidrangeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 部署单元组
    @NameInMap("cell_group")
    @Validation(required = true)
    public String cellGroup;

    // 是否灰度流量（默认false）
    @NameInMap("gray")
    public Boolean gray;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 是否压测流量（默认 false）
    @NameInMap("press")
    public Boolean press;

    // uid 范围
    @NameInMap("uid_ranges")
    @Validation(required = true)
    public UidShardList uidRanges;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateFlowUidrangeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowUidrangeRequest self = new UpdateFlowUidrangeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowUidrangeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFlowUidrangeRequest setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public UpdateFlowUidrangeRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public UpdateFlowUidrangeRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateFlowUidrangeRequest setPress(Boolean press) {
        this.press = press;
        return this;
    }
    public Boolean getPress() {
        return this.press;
    }

    public UpdateFlowUidrangeRequest setUidRanges(UidShardList uidRanges) {
        this.uidRanges = uidRanges;
        return this;
    }
    public UidShardList getUidRanges() {
        return this.uidRanges;
    }

    public UpdateFlowUidrangeRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
