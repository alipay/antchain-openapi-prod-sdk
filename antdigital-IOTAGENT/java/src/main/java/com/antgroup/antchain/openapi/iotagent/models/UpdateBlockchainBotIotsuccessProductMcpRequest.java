// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UpdateBlockchainBotIotsuccessProductMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    @NameInMap("url")
    public String url;

    // JSON对象字符串
    @NameInMap("headers")
    public String headers;

    @NameInMap("purpose")
    public String purpose;

    public static UpdateBlockchainBotIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBlockchainBotIotsuccessProductMcpRequest self = new UpdateBlockchainBotIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public UpdateBlockchainBotIotsuccessProductMcpRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}
