// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCustomflowtemplateBindRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryCustomflowtemplateBindRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomflowtemplateBindRequest self = new QueryCustomflowtemplateBindRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomflowtemplateBindRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomflowtemplateBindRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCustomflowtemplateBindRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryCustomflowtemplateBindRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
