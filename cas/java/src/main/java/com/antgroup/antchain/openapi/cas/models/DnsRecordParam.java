// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DnsRecordParam extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // ttl
    @NameInMap("ttl")
    @Validation(required = true)
    public Long ttl;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    // description
    @NameInMap("description")
    public String description;

    // resource_type
    @NameInMap("resource_type")
    @Validation(required = true)
    public String resourceType;

    public static DnsRecordParam build(java.util.Map<String, ?> map) throws Exception {
        DnsRecordParam self = new DnsRecordParam();
        return TeaModel.build(map, self);
    }

    public DnsRecordParam setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DnsRecordParam setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DnsRecordParam setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public DnsRecordParam setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DnsRecordParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public DnsRecordParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DnsRecordParam setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
