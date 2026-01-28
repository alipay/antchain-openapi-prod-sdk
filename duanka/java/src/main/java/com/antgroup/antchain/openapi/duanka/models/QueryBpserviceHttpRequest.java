// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryBpserviceHttpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 请求头参数
    @NameInMap("headers")
    public java.util.List<NameValuePair> headers;

    // 请求体JSON String
    @NameInMap("request_body")
    public String requestBody;

    // 0-GET，1-POST，2-PUT，3-DELETE
    @NameInMap("http_method")
    @Validation(required = true)
    public Long httpMethod;

    public static QueryBpserviceHttpRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBpserviceHttpRequest self = new QueryBpserviceHttpRequest();
        return TeaModel.build(map, self);
    }

    public QueryBpserviceHttpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBpserviceHttpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryBpserviceHttpRequest setHeaders(java.util.List<NameValuePair> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<NameValuePair> getHeaders() {
        return this.headers;
    }

    public QueryBpserviceHttpRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

    public QueryBpserviceHttpRequest setHttpMethod(Long httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }
    public Long getHttpMethod() {
        return this.httpMethod;
    }

}
