// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateAgentLabelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 唯一标识数组
    @NameInMap("collect_ids")
    @Validation(required = true)
    public java.util.List<String> collectIds;

    // 标记是否开启告警
    // 1：开启告警
    // 0：关闭告警
    @NameInMap("label")
    @Validation(required = true)
    public Long label;

    public static UpdateAgentLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentLabelRequest self = new UpdateAgentLabelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentLabelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAgentLabelRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateAgentLabelRequest setCollectIds(java.util.List<String> collectIds) {
        this.collectIds = collectIds;
        return this;
    }
    public java.util.List<String> getCollectIds() {
        return this.collectIds;
    }

    public UpdateAgentLabelRequest setLabel(Long label) {
        this.label = label;
        return this;
    }
    public Long getLabel() {
        return this.label;
    }

}
