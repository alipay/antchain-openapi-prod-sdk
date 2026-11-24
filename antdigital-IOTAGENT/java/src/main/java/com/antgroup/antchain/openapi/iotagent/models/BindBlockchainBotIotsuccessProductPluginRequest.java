// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class BindBlockchainBotIotsuccessProductPluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("plugin_ids")
    @Validation(required = true)
    public java.util.List<String> pluginIds;

    public static BindBlockchainBotIotsuccessProductPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        BindBlockchainBotIotsuccessProductPluginRequest self = new BindBlockchainBotIotsuccessProductPluginRequest();
        return TeaModel.build(map, self);
    }

    public BindBlockchainBotIotsuccessProductPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindBlockchainBotIotsuccessProductPluginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BindBlockchainBotIotsuccessProductPluginRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public BindBlockchainBotIotsuccessProductPluginRequest setPluginIds(java.util.List<String> pluginIds) {
        this.pluginIds = pluginIds;
        return this;
    }
    public java.util.List<String> getPluginIds() {
        return this.pluginIds;
    }

}
