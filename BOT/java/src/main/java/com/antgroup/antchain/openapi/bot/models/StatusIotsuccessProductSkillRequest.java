// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StatusIotsuccessProductSkillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 上传返回的插件ID
    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    public static StatusIotsuccessProductSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        StatusIotsuccessProductSkillRequest self = new StatusIotsuccessProductSkillRequest();
        return TeaModel.build(map, self);
    }

    public StatusIotsuccessProductSkillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StatusIotsuccessProductSkillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StatusIotsuccessProductSkillRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

}
