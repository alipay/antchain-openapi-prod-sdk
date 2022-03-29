// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateAlarmwebhookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
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

    // headers
    @NameInMap("headers")
    public java.util.List<KeySet> headers;

    // params
    @NameInMap("params")
    public java.util.List<KeySet> params;

    // config
    @NameInMap("config")
    public java.util.List<KeySet> config;

    // body_template
    @NameInMap("body_template")
    public String bodyTemplate;

    // scope_global
    @NameInMap("scope_global")
    @Validation(required = true)
    public Boolean scopeGlobal;

    public static UpdateAlarmwebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmwebhookRequest self = new UpdateAlarmwebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmwebhookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAlarmwebhookRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateAlarmwebhookRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlarmwebhookRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlarmwebhookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateAlarmwebhookRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public UpdateAlarmwebhookRequest setHeaders(java.util.List<KeySet> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<KeySet> getHeaders() {
        return this.headers;
    }

    public UpdateAlarmwebhookRequest setParams(java.util.List<KeySet> params) {
        this.params = params;
        return this;
    }
    public java.util.List<KeySet> getParams() {
        return this.params;
    }

    public UpdateAlarmwebhookRequest setConfig(java.util.List<KeySet> config) {
        this.config = config;
        return this;
    }
    public java.util.List<KeySet> getConfig() {
        return this.config;
    }

    public UpdateAlarmwebhookRequest setBodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
        return this;
    }
    public String getBodyTemplate() {
        return this.bodyTemplate;
    }

    public UpdateAlarmwebhookRequest setScopeGlobal(Boolean scopeGlobal) {
        this.scopeGlobal = scopeGlobal;
        return this;
    }
    public Boolean getScopeGlobal() {
        return this.scopeGlobal;
    }

}
