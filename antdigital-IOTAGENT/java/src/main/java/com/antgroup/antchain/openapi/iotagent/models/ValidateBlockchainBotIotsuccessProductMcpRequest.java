// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ValidateBlockchainBotIotsuccessProductMcpRequest extends TeaModel {
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

    public static ValidateBlockchainBotIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateBlockchainBotIotsuccessProductMcpRequest self = new ValidateBlockchainBotIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public ValidateBlockchainBotIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ValidateBlockchainBotIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ValidateBlockchainBotIotsuccessProductMcpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ValidateBlockchainBotIotsuccessProductMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

}
