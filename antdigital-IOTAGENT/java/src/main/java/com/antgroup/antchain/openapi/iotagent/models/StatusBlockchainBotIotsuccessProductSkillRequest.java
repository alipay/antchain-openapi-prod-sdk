// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class StatusBlockchainBotIotsuccessProductSkillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传返回的插件ID
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    public static StatusBlockchainBotIotsuccessProductSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusBlockchainBotIotsuccessProductSkillRequest self = new StatusBlockchainBotIotsuccessProductSkillRequest();
        return TeaModel.build(map, self);
    }

    public StatusBlockchainBotIotsuccessProductSkillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusBlockchainBotIotsuccessProductSkillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusBlockchainBotIotsuccessProductSkillRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
