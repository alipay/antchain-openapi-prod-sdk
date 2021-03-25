// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteServicegroupcollectionRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // arrangement_id
    @NameInMap("arrangement_id")
    @Validation(required = true)
    public String arrangementId;

    // process_definition_id
    @NameInMap("process_definition_id")
    @Validation(required = true)
    public String processDefinitionId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static DeleteServicegroupcollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServicegroupcollectionRequest self = new DeleteServicegroupcollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServicegroupcollectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteServicegroupcollectionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteServicegroupcollectionRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public DeleteServicegroupcollectionRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public DeleteServicegroupcollectionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
