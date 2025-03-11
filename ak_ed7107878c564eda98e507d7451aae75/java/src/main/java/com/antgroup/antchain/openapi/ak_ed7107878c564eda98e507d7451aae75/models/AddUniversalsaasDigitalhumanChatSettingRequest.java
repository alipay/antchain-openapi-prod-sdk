// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class AddUniversalsaasDigitalhumanChatSettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 交互配置名称
    @NameInMap("config_name")
    @Validation(required = true)
    public String configName;

    // 角色id
    @NameInMap("human_id")
    @Validation(required = true)
    public Long humanId;

    public static AddUniversalsaasDigitalhumanChatSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUniversalsaasDigitalhumanChatSettingRequest self = new AddUniversalsaasDigitalhumanChatSettingRequest();
        return TeaModel.build(map, self);
    }

    public AddUniversalsaasDigitalhumanChatSettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddUniversalsaasDigitalhumanChatSettingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddUniversalsaasDigitalhumanChatSettingRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public AddUniversalsaasDigitalhumanChatSettingRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public AddUniversalsaasDigitalhumanChatSettingRequest setHumanId(Long humanId) {
        this.humanId = humanId;
        return this;
    }
    public Long getHumanId() {
        return this.humanId;
    }

}
