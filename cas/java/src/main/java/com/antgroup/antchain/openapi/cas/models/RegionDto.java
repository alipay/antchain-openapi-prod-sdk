// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RegionDto extends TeaModel {
    // availableNetworkTypes
    @NameInMap("available_network_types")
    @Validation(required = true)
    public java.util.List<String> availableNetworkTypes;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // displayName
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // iaasProviderId
    @NameInMap("iaas_provider_id")
    @Validation(required = true)
    public String iaasProviderId;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // networkType
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String utcModified;

    // zoneDtos
    @NameInMap("zone_dtos")
    @Validation(required = true)
    public java.util.List<ZoneDto> zoneDtos;

    public static RegionDto build(java.util.Map<String, ?> map) throws Exception {
        RegionDto self = new RegionDto();
        return TeaModel.build(map, self);
    }

    public RegionDto setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
        this.availableNetworkTypes = availableNetworkTypes;
        return this;
    }
    public java.util.List<String> getAvailableNetworkTypes() {
        return this.availableNetworkTypes;
    }

    public RegionDto setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RegionDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RegionDto setIaasProviderId(String iaasProviderId) {
        this.iaasProviderId = iaasProviderId;
        return this;
    }
    public String getIaasProviderId() {
        return this.iaasProviderId;
    }

    public RegionDto setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionDto setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public RegionDto setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public RegionDto setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public RegionDto setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public RegionDto setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public RegionDto setZoneDtos(java.util.List<ZoneDto> zoneDtos) {
        this.zoneDtos = zoneDtos;
        return this;
    }
    public java.util.List<ZoneDto> getZoneDtos() {
        return this.zoneDtos;
    }

}
