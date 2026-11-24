// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DeleteBlockchainBotIotsuccessProductMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    public static DeleteBlockchainBotIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainBotIotsuccessProductMcpRequest self = new DeleteBlockchainBotIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainBotIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBlockchainBotIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBlockchainBotIotsuccessProductMcpRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
