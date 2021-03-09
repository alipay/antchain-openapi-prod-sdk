// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // computer_sequences
    @NameInMap("computer_sequences")
    @Validation(required = true)
    public java.util.List<String> computerSequences;

    // 后续这个字段必填
    @NameInMap("workspace_id")
    public String workspaceId;

    // 是否强制删除
    @NameInMap("force")
    public Boolean force;

    public static DeleteComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputerRequest self = new DeleteComputerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteComputerRequest setComputerSequences(java.util.List<String> computerSequences) {
        this.computerSequences = computerSequences;
        return this;
    }
    public java.util.List<String> getComputerSequences() {
        return this.computerSequences;
    }

    public DeleteComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeleteComputerRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
