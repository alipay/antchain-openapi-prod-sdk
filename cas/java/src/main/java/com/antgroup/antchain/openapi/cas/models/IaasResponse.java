// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class IaasResponse extends TeaModel {
    // response_body
    @NameInMap("response_body")
    public String responseBody;

    // response_headers
    @NameInMap("response_headers")
    public java.util.List<MapStringToStringEntity> responseHeaders;

    public static IaasResponse build(java.util.Map<String, ?> map) throws Exception {
        IaasResponse self = new IaasResponse();
        return TeaModel.build(map, self);
    }

    public IaasResponse setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }
    public String getResponseBody() {
        return this.responseBody;
    }

    public IaasResponse setResponseHeaders(java.util.List<MapStringToStringEntity> responseHeaders) {
        this.responseHeaders = responseHeaders;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getResponseHeaders() {
        return this.responseHeaders;
    }

}
