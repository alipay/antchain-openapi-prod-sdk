// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class IaasRequest extends TeaModel {
    // requestMethod
    @NameInMap("request_method")
    public String requestMethod;

    // requestUrl
    @NameInMap("request_url")
    public String requestUrl;

    // requestBody
    @NameInMap("request_body")
    public String requestBody;

    // request_headers
    @NameInMap("request_headers")
    public java.util.List<MapStringToStringEntity> requestHeaders;

    public static IaasRequest build(java.util.Map<String, ?> map) throws Exception {
        IaasRequest self = new IaasRequest();
        return TeaModel.build(map, self);
    }

    public IaasRequest setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }
    public String getRequestMethod() {
        return this.requestMethod;
    }

    public IaasRequest setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }
    public String getRequestUrl() {
        return this.requestUrl;
    }

    public IaasRequest setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    public String getRequestBody() {
        return this.requestBody;
    }

    public IaasRequest setRequestHeaders(java.util.List<MapStringToStringEntity> requestHeaders) {
        this.requestHeaders = requestHeaders;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getRequestHeaders() {
        return this.requestHeaders;
    }

}
