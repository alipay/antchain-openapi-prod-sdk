// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateServicegroupcollectionRequest extends TeaModel {
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

    public static CreateServicegroupcollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServicegroupcollectionRequest self = new CreateServicegroupcollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateServicegroupcollectionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateServicegroupcollectionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateServicegroupcollectionRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public CreateServicegroupcollectionRequest setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public CreateServicegroupcollectionRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
