// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceDnsRecordset extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // iaasId
    @NameInMap("iaas_id")
    @Validation(required = true)
    public String iaasId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // dns_provider_id
    @NameInMap("dns_provider_id")
    @Validation(required = true)
    public String dnsProviderId;

    // dns_network_type
    @NameInMap("dns_network_type")
    public String dnsNetworkType;

    // device_network_address_type
    @NameInMap("device_network_address_type")
    public String deviceNetworkAddressType;

    // 绑定的资源的类型COMPUTER或LOAD_BALANCER
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    // description
    @NameInMap("description")
    public String description;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // ttl
    @NameInMap("ttl")
    @Validation(required = true)
    public Long ttl;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // resource_id
    @NameInMap("resource_id")
    public String resourceId;

    // resource_iaas_id
    @NameInMap("resource_iaas_id")
    public String resourceIaasId;

    // utc_create
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    public static WorkspaceDnsRecordset build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDnsRecordset self = new WorkspaceDnsRecordset();
        return TeaModel.build(map, self);
    }

    public WorkspaceDnsRecordset setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceDnsRecordset setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public WorkspaceDnsRecordset setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceDnsRecordset setDnsProviderId(String dnsProviderId) {
        this.dnsProviderId = dnsProviderId;
        return this;
    }
    public String getDnsProviderId() {
        return this.dnsProviderId;
    }

    public WorkspaceDnsRecordset setDnsNetworkType(String dnsNetworkType) {
        this.dnsNetworkType = dnsNetworkType;
        return this;
    }
    public String getDnsNetworkType() {
        return this.dnsNetworkType;
    }

    public WorkspaceDnsRecordset setDeviceNetworkAddressType(String deviceNetworkAddressType) {
        this.deviceNetworkAddressType = deviceNetworkAddressType;
        return this;
    }
    public String getDeviceNetworkAddressType() {
        return this.deviceNetworkAddressType;
    }

    public WorkspaceDnsRecordset setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public WorkspaceDnsRecordset setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public WorkspaceDnsRecordset setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WorkspaceDnsRecordset setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceDnsRecordset setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public WorkspaceDnsRecordset setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public WorkspaceDnsRecordset setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceDnsRecordset setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public WorkspaceDnsRecordset setResourceIaasId(String resourceIaasId) {
        this.resourceIaasId = resourceIaasId;
        return this;
    }
    public String getResourceIaasId() {
        return this.resourceIaasId;
    }

    public WorkspaceDnsRecordset setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public WorkspaceDnsRecordset setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

}
