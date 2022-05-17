// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitAppNodeEcsList extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // zone_id
    @NameInMap("zone_id")
    public String zoneId;

    // ip
    @NameInMap("ip")
    public String ip;

    // load_balancer_spec
    @NameInMap("load_balancer_spec")
    public String loadBalancerSpec;

    // cpu
    @NameInMap("cpu")
    public String cpu;

    // memory
    @NameInMap("memory")
    public String memory;

    // version
    @NameInMap("version")
    public String version;

    // name
    @NameInMap("name")
    public String name;

    // status
    @NameInMap("status")
    public String status;

    public static AppPortraitAppNodeEcsList build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitAppNodeEcsList self = new AppPortraitAppNodeEcsList();
        return TeaModel.build(map, self);
    }

    public AppPortraitAppNodeEcsList setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppPortraitAppNodeEcsList setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public AppPortraitAppNodeEcsList setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public AppPortraitAppNodeEcsList setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public AppPortraitAppNodeEcsList setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public AppPortraitAppNodeEcsList setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public AppPortraitAppNodeEcsList setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public AppPortraitAppNodeEcsList setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppPortraitAppNodeEcsList setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
