// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class MonitorProviderCapability extends TeaModel {
    // 供应商id
    /**
     * <strong>example:</strong>
     * <p>GOODEYE</p>
     */
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // 供应商名称
    /**
     * <strong>example:</strong>
     * <p>千里眼</p>
     */
    @NameInMap("provider_name")
    @Validation(required = true)
    public String providerName;

    // 供应商描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("provider_description")
    @Validation(required = true)
    public String providerDescription;

    // 是否推荐供应商
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_provided")
    @Validation(required = true)
    public Boolean isProvided;

    public static MonitorProviderCapability build(java.util.Map<String, ?> map) throws Exception {
        MonitorProviderCapability self = new MonitorProviderCapability();
        return TeaModel.build(map, self);
    }

    public MonitorProviderCapability setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public MonitorProviderCapability setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public MonitorProviderCapability setProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
        return this;
    }
    public String getProviderDescription() {
        return this.providerDescription;
    }

    public MonitorProviderCapability setIsProvided(Boolean isProvided) {
        this.isProvided = isProvided;
        return this;
    }
    public Boolean getIsProvided() {
        return this.isProvided;
    }

}
