// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryCustomflowtemplateSummaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 模板类型
    @NameInMap("template_type")
    public String templateType;

    // 模板子类型
    @NameInMap("sub_template_type")
    public String subTemplateType;

    public static QueryCustomflowtemplateSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomflowtemplateSummaryRequest self = new QueryCustomflowtemplateSummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomflowtemplateSummaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomflowtemplateSummaryRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryCustomflowtemplateSummaryRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryCustomflowtemplateSummaryRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public QueryCustomflowtemplateSummaryRequest setSubTemplateType(String subTemplateType) {
        this.subTemplateType = subTemplateType;
        return this;
    }
    public String getSubTemplateType() {
        return this.subTemplateType;
    }

}
