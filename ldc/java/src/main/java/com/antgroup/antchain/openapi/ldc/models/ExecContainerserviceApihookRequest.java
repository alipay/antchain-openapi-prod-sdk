// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ExecContainerserviceApihookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // url地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // GET/POST
    @NameInMap("http_method")
    @Validation(required = true)
    public String httpMethod;

    // 请求参数
    @NameInMap("query_params")
    public String queryParams;

    // 请求body
    @NameInMap("body")
    public String body;

    // application/x-www-form-urlencoded或application/json
    @NameInMap("content_type")
    public String contentType;

    public static ExecContainerserviceApihookRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecContainerserviceApihookRequest self = new ExecContainerserviceApihookRequest();
        return TeaModel.build(map, self);
    }

    public ExecContainerserviceApihookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecContainerserviceApihookRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ExecContainerserviceApihookRequest setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public String getHttpMethod() {
        return this.httpMethod;
    }

    public ExecContainerserviceApihookRequest setQueryParams(String queryParams) {
        this.queryParams = queryParams;
        return this;
    }
    public String getQueryParams() {
        return this.queryParams;
    }

    public ExecContainerserviceApihookRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ExecContainerserviceApihookRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

}
