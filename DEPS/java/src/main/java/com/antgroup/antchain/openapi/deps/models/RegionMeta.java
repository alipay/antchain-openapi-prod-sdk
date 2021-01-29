// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RegionMeta extends TeaModel {
    // region支持的网络类型
    @NameInMap("available_network_types")
    public java.util.List<String> availableNetworkTypes;

    // region display name
    @NameInMap("display_name")
    public String displayName;

    // region identity
    @NameInMap("id")
    public String id;

    // region paas id
    @NameInMap("paas_id")
    public String paasId;

    // region iaas id
    @NameInMap("region_iaas_id")
    public String regionIaasId;

    // region包含的所有zone id列表
    @NameInMap("zone_ids")
    public java.util.List<String> zoneIds;

    // region state.
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    public static RegionMeta build(java.util.Map<String, ?> map) throws Exception {
        RegionMeta self = new RegionMeta();
        return TeaModel.build(map, self);
    }

    public RegionMeta setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
        this.availableNetworkTypes = availableNetworkTypes;
        return this;
    }
    public java.util.List<String> getAvailableNetworkTypes() {
        return this.availableNetworkTypes;
    }

    public RegionMeta setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RegionMeta setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionMeta setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public RegionMeta setRegionIaasId(String regionIaasId) {
        this.regionIaasId = regionIaasId;
        return this;
    }
    public String getRegionIaasId() {
        return this.regionIaasId;
    }

    public RegionMeta setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public RegionMeta setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
