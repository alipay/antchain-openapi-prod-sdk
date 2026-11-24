// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateIotsuccessProductMcpRequest extends TeaModel {
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

    public static UpdateIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIotsuccessProductMcpRequest self = new UpdateIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateIotsuccessProductMcpRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UpdateIotsuccessProductMcpRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateIotsuccessProductMcpRequest setHeaders(String headers) {
        this.headers = headers;
        return this;
    }
    public String getHeaders() {
        return this.headers;
    }

    public UpdateIotsuccessProductMcpRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

}
