// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCmdtemplateVersionsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模板类型
    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryCmdtemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCmdtemplateVersionsRequest self = new QueryCmdtemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryCmdtemplateVersionsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCmdtemplateVersionsRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCmdtemplateVersionsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryCmdtemplateVersionsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryCmdtemplateVersionsRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public QueryCmdtemplateVersionsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
