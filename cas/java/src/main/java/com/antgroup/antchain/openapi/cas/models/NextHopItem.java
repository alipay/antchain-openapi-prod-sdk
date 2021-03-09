// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class NextHopItem extends TeaModel {
    // 	
    // 下一跳的类型。
    // 
    // Instance：ECS实例。
    // HaVip：高可用虚拟IP。
    // VpnGateway：VPN网关。
    // NatGateway：NAT网关。
    // NetworkInterface：辅助弹性网卡。
    // RouterInterface：路由器接口。
    // IPv6Gateway：IPv6网关。
    @NameInMap("next_hop_type")
    public String nextHopType;

    // 下一跳实例的ID。
    @NameInMap("next_hop_id")
    public String nextHopId;

    // 是否启用下一跳。
    // 
    // 0：不启用。
    // 1：启用。
    @NameInMap("enable")
    public Long enable;

    // 下一跳的路由权重。
    @NameInMap("weight")
    public Long weight;

    public static NextHopItem build(java.util.Map<String, ?> map) throws Exception {
        NextHopItem self = new NextHopItem();
        return TeaModel.build(map, self);
    }

    public NextHopItem setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public NextHopItem setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public NextHopItem setEnable(Long enable) {
        this.enable = enable;
        return this;
    }
    public Long getEnable() {
        return this.enable;
    }

    public NextHopItem setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
