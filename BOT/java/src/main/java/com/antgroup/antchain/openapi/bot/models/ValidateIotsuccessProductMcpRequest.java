// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ValidateIotsuccessProductMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // JSON对象字符串
    @NameInMap("headers")
    public String headers;

    public static ValidateIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateIotsuccessProductMcpRequest self = new ValidateIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public ValidateIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ValidateIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ValidateIotsuccessProductMcpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ValidateIotsuccessProductMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

}
