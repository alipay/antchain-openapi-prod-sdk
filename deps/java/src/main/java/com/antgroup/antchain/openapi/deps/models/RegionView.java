// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RegionView extends TeaModel {
    // 支持的网络类型列表
    @NameInMap("available_network_types")
    public java.util.List<String> availableNetworkTypes;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // table id
    @NameInMap("id")
    public String id;

    // 标识
    @NameInMap("identity")
    public String identity;

    // region包含的所有zone 列表
    @NameInMap("zones")
    public java.util.List<ZoneView> zones;

    public static RegionView build(java.util.Map<String, ?> map) throws Exception {
        RegionView self = new RegionView();
        return TeaModel.build(map, self);
    }

    public RegionView setAvailableNetworkTypes(java.util.List<String> availableNetworkTypes) {
        this.availableNetworkTypes = availableNetworkTypes;
        return this;
    }
    public java.util.List<String> getAvailableNetworkTypes() {
        return this.availableNetworkTypes;
    }

    public RegionView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RegionView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RegionView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public RegionView setZones(java.util.List<ZoneView> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ZoneView> getZones() {
        return this.zones;
    }

}
