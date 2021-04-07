// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateComputerInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // description
    @NameInMap("description")
    public String description;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // computer_id
    @NameInMap("computer_id")
    @Validation(required = true)
    public String computerId;

    public static UpdateComputerInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputerInfoRequest self = new UpdateComputerInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComputerInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateComputerInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateComputerInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateComputerInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateComputerInfoRequest setComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }
    public String getComputerId() {
        return this.computerId;
    }

}
