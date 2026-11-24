// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class CreateBlockchainBotIotsuccessProductMcpRequest extends TeaModel {
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

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    public static CreateBlockchainBotIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainBotIotsuccessProductMcpRequest self = new CreateBlockchainBotIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBlockchainBotIotsuccessProductMcpRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}
