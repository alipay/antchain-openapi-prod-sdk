// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceDnsProvider extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // provider_id
    @NameInMap("provider_id")
    @Validation(required = true)
    public String providerId;

    // region_id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // zoneId
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // dns_provider_id
    @NameInMap("dns_provider_id")
    @Validation(required = true)
    public String dnsProviderId;

    // dns_network_type
    @NameInMap("dns_network_type")
    @Validation(required = true)
    public String dnsNetworkType;

    // sub_domain_name
    @NameInMap("sub_domain_name")
    @Validation(required = true)
    public String subDomainName;

    // utc_create
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static WorkspaceDnsProvider build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDnsProvider self = new WorkspaceDnsProvider();
        return TeaModel.build(map, self);
    }

    public WorkspaceDnsProvider setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceDnsProvider setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceDnsProvider setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public WorkspaceDnsProvider setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WorkspaceDnsProvider setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public WorkspaceDnsProvider setDnsProviderId(String dnsProviderId) {
        this.dnsProviderId = dnsProviderId;
        return this;
    }
    public String getDnsProviderId() {
        return this.dnsProviderId;
    }

    public WorkspaceDnsProvider setDnsNetworkType(String dnsNetworkType) {
        this.dnsNetworkType = dnsNetworkType;
        return this;
    }
    public String getDnsNetworkType() {
        return this.dnsNetworkType;
    }

    public WorkspaceDnsProvider setSubDomainName(String subDomainName) {
        this.subDomainName = subDomainName;
        return this;
    }
    public String getSubDomainName() {
        return this.subDomainName;
    }

    public WorkspaceDnsProvider setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public WorkspaceDnsProvider setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public WorkspaceDnsProvider setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
