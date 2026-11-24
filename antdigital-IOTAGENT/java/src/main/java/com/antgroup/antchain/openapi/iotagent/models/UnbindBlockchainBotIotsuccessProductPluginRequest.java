// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UnbindBlockchainBotIotsuccessProductPluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    @NameInMap("plugin_id")
    @Validation(required = true)
    public String pluginId;

    // 类型正确后由业务守卫判断；缺失或false返回CONFIRM_REQUIRED，只有true执行解绑
    @NameInMap("confirm")
    public Boolean confirm;

    public static UnbindBlockchainBotIotsuccessProductPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindBlockchainBotIotsuccessProductPluginRequest self = new UnbindBlockchainBotIotsuccessProductPluginRequest();
        return TeaModel.build(map, self);
    }

    public UnbindBlockchainBotIotsuccessProductPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindBlockchainBotIotsuccessProductPluginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindBlockchainBotIotsuccessProductPluginRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnbindBlockchainBotIotsuccessProductPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UnbindBlockchainBotIotsuccessProductPluginRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

}
