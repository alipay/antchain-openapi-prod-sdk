// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class BindDnsProviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 部分环境绑定到机房机房
    @NameInMap("zone_id")
    public String zoneId;

    // dns_provider_id
    @NameInMap("dns_provider_id")
    @Validation(required = true)
    public String dnsProviderId;

    // default_sub_domain_name
    @NameInMap("default_sub_domain_name")
    public String defaultSubDomainName;

    public static BindDnsProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDnsProviderRequest self = new BindDnsProviderRequest();
        return TeaModel.build(map, self);
    }

    public BindDnsProviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDnsProviderRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public BindDnsProviderRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public BindDnsProviderRequest setDnsProviderId(String dnsProviderId) {
        this.dnsProviderId = dnsProviderId;
        return this;
    }
    public String getDnsProviderId() {
        return this.dnsProviderId;
    }

    public BindDnsProviderRequest setDefaultSubDomainName(String defaultSubDomainName) {
        this.defaultSubDomainName = defaultSubDomainName;
        return this;
    }
    public String getDefaultSubDomainName() {
        return this.defaultSubDomainName;
    }

}
