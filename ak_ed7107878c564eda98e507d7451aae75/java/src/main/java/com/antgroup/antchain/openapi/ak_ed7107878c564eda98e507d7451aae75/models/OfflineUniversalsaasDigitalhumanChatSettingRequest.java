// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class OfflineUniversalsaasDigitalhumanChatSettingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 交互配置id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    public static OfflineUniversalsaasDigitalhumanChatSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineUniversalsaasDigitalhumanChatSettingRequest self = new OfflineUniversalsaasDigitalhumanChatSettingRequest();
        return TeaModel.build(map, self);
    }

    public OfflineUniversalsaasDigitalhumanChatSettingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineUniversalsaasDigitalhumanChatSettingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineUniversalsaasDigitalhumanChatSettingRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public OfflineUniversalsaasDigitalhumanChatSettingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
