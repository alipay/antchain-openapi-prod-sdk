// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotagentPlugincontractRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 插件ID，由蚂蚁侧提供
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 客户端ID，一般是设备 MAC 地址
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    public static QueryIotagentPlugincontractRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIotagentPlugincontractRequest self = new QueryIotagentPlugincontractRequest();
        return TeaModel.build(map, self);
    }

    public QueryIotagentPlugincontractRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIotagentPlugincontractRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIotagentPlugincontractRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public QueryIotagentPlugincontractRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
