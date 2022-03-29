// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateAlarmwebhookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作区名
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // web hook 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // web hook http url
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // web hook http method
    @NameInMap("http_method")
    @Validation(required = true)
    public String httpMethod;

    // web hook http headers
    @NameInMap("headers")
    public java.util.List<KeySet> headers;

    // web hook http params
    @NameInMap("params")
    public java.util.List<KeySet> params;

    // 配置项（timeOut，retryCount）
    @NameInMap("config")
    public java.util.List<KeySet> config;

    // body_template
    @NameInMap("body_template")
    public String bodyTemplate;

    // scope_global
    @NameInMap("scope_global")
    @Validation(required = true)
    public Boolean scopeGlobal;

    // 当前workspace有效，还是当前租户有效
    @NameInMap("valid_scope")
    @Validation(required = true)
    public Long validScope;

    public static CreateAlarmwebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmwebhookRequest self = new CreateAlarmwebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmwebhookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAlarmwebhookRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateAlarmwebhookRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlarmwebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateAlarmwebhookRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public CreateAlarmwebhookRequest setHeaders(java.util.List<KeySet> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<KeySet> getHeaders() {
        return this.headers;
    }

    public CreateAlarmwebhookRequest setParams(java.util.List<KeySet> params) {
        this.params = params;
        return this;
    }
    public java.util.List<KeySet> getParams() {
        return this.params;
    }

    public CreateAlarmwebhookRequest setConfig(java.util.List<KeySet> config) {
        this.config = config;
        return this;
    }
    public java.util.List<KeySet> getConfig() {
        return this.config;
    }

    public CreateAlarmwebhookRequest setBodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }
    public String getBodyTemplate() {
        return this.bodyTemplate;
    }

    public CreateAlarmwebhookRequest setScopeGlobal(Boolean scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
        return this;
    }
    public Boolean getScopeGlobal() {
        return this.scopeGlobal;
    }

    public CreateAlarmwebhookRequest setValidScope(Long validScope) {
        this.validScope = validScope;
        return this;
    }
    public Long getValidScope() {
        return this.validScope;
    }

}
