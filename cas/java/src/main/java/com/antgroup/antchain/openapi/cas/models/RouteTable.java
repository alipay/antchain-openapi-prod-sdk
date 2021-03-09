// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class RouteTable extends TeaModel {
    // 路由表的创建时间。
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String creationTime;

    // 路由表所属的路由器类型，取值：
    // 
    // VRouter：VPC路由器。
    // VBR：边界路由器。
    @NameInMap("router_type")
    public String routerType;

    // 	
    // 路由条目的详细信息。
    @NameInMap("entry_v_os")
    public java.util.List<VRouteEntry> entryVOs;

    // 要查询的路由表的ID。
    @NameInMap("route_table_id")
    public String routeTableId;

    // 要查询的路由表所属的VPC路由器的ID。
    @NameInMap("v_router_id")
    public String vRouterId;

    public static RouteTable build(java.util.Map<String, ?> map) throws Exception {
        RouteTable self = new RouteTable();
        return TeaModel.build(map, self);
    }

    public RouteTable setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public RouteTable setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public RouteTable setEntryVOs(java.util.List<VRouteEntry> entryVOs) {
        this.entryVOs = entryVOs;
        return this;
    }
    public java.util.List<VRouteEntry> getEntryVOs() {
        return this.entryVOs;
    }

    public RouteTable setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public RouteTable setVRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.vRouterId;
    }

}
