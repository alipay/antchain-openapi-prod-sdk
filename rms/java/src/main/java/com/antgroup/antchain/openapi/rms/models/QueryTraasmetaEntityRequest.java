// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // entity_name
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // 工作空间名称
    @NameInMap("workspace_name")
    public String workspaceName;

    public static QueryTraasmetaEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaEntityRequest self = new QueryTraasmetaEntityRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraasmetaEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public QueryTraasmetaEntityRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
