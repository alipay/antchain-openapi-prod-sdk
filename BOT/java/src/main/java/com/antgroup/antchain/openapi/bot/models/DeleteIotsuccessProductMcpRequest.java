// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeleteIotsuccessProductMcpRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    public static DeleteIotsuccessProductMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIotsuccessProductMcpRequest self = new DeleteIotsuccessProductMcpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIotsuccessProductMcpRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteIotsuccessProductMcpRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteIotsuccessProductMcpRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
