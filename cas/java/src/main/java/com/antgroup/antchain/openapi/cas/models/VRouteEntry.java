// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class VRouteEntry extends TeaModel {
    // 路由条目的目标网段。
    @NameInMap("desination_cidr_block")
    public String desinationCidrBlock;

    // 下一跳的实例ID。
    @NameInMap("instance_id")
    public String instanceId;

    // 下一跳的实例名称。
    @NameInMap("instance_name")
    public String instanceName;

    // 路由条目ID。
    @NameInMap("next_hop_id")
    public String nextHopId;

    // 路由的下一跳列表。
    @NameInMap("next_hop_item_list")
    public java.util.List<NextHopItem> nextHopItemList;

    // 路由类型。
    // 
    // local：交换机路由。
    // service：云服务路由。
    // classicLink：开启ClassicLink功能后系统自动添加的路由。
    @NameInMap("next_hop_type")
    public String nextHopType;

    // 路由条目所属路由表的ID。
    @NameInMap("route_table_id")
    public String routeTableId;

    // 	
    // 路由条目的状态。
    // 
    // Pending：配置中。
    // Available：可用。
    // Modifying：修改中。
    @NameInMap("status")
    public String status;

    // 路由条目的类型。
    // 
    // System：系统路由。
    // Custom：自定义路由。
    // BGP：BGP路由。
    // 
    @NameInMap("type")
    public String type;

    public static VRouteEntry build(java.util.Map<String, ?> map) throws Exception {
        VRouteEntry self = new VRouteEntry();
        return TeaModel.build(map, self);
    }

    public VRouteEntry setDesinationCidrBlock(String desinationCidrBlock) {
        this.desinationCidrBlock = desinationCidrBlock;
        return this;
    }
    public String getDesinationCidrBlock() {
        return this.desinationCidrBlock;
    }

    public VRouteEntry setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public VRouteEntry setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public VRouteEntry setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public VRouteEntry setNextHopItemList(java.util.List<NextHopItem> nextHopItemList) {
        this.nextHopItemList = nextHopItemList;
        return this;
    }
    public java.util.List<NextHopItem> getNextHopItemList() {
        return this.nextHopItemList;
    }

    public VRouteEntry setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public VRouteEntry setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public VRouteEntry setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public VRouteEntry setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
