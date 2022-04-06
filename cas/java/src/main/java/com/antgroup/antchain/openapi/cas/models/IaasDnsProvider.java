// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class IaasDnsProvider extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // service_config_id
    @NameInMap("service_config_id")
    @Validation(required = true)
    public String serviceConfigId;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    // utc_create
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // dns_zones
    @NameInMap("dns_zones")
    @Validation(required = true)
    public java.util.List<DnsZones> dnsZones;

    public static IaasDnsProvider build(java.util.Map<String, ?> map) throws Exception {
        IaasDnsProvider self = new IaasDnsProvider();
        return TeaModel.build(map, self);
    }

    public IaasDnsProvider setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public IaasDnsProvider setServiceConfigId(String serviceConfigId) {
        this.serviceConfigId = serviceConfigId;
        return this;
    }
    public String getServiceConfigId() {
        return this.serviceConfigId;
    }

    public IaasDnsProvider setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IaasDnsProvider setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IaasDnsProvider setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IaasDnsProvider setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public IaasDnsProvider setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public IaasDnsProvider setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public IaasDnsProvider setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public IaasDnsProvider setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public IaasDnsProvider setDnsZones(java.util.List<DnsZones> dnsZones) {
        this.dnsZones = dnsZones;
        return this;
    }
    public java.util.List<DnsZones> getDnsZones() {
        return this.dnsZones;
    }

}
