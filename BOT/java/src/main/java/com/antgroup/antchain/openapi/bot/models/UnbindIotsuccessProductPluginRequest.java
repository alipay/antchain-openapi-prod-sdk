// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UnbindIotsuccessProductPluginRequest extends TeaModel {
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

    public static UnbindIotsuccessProductPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindIotsuccessProductPluginRequest self = new UnbindIotsuccessProductPluginRequest();
        return TeaModel.build(map, self);
    }

    public UnbindIotsuccessProductPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindIotsuccessProductPluginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindIotsuccessProductPluginRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UnbindIotsuccessProductPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public UnbindIotsuccessProductPluginRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

}
