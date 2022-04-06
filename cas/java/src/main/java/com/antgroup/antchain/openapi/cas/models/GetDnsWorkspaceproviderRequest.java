// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetDnsWorkspaceproviderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    // dns_network_type
    @NameInMap("dns_network_type")
    @Validation(required = true)
    public String dnsNetworkType;

    public static GetDnsWorkspaceproviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDnsWorkspaceproviderRequest self = new GetDnsWorkspaceproviderRequest();
        return TeaModel.build(map, self);
    }

    public GetDnsWorkspaceproviderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDnsWorkspaceproviderRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public GetDnsWorkspaceproviderRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public GetDnsWorkspaceproviderRequest setDnsNetworkType(String dnsNetworkType) {
        this.dnsNetworkType = dnsNetworkType;
        return this;
    }
    public String getDnsNetworkType() {
        return this.dnsNetworkType;
    }

}
