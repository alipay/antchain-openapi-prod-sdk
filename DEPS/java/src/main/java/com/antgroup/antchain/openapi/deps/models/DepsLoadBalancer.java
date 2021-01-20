// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DepsLoadBalancer extends TeaModel {
    // 服务实例列表
    @NameInMap("app_services")
    public java.util.List<AppService> appServices;

    // 网络带宽
    @NameInMap("bandwidth")
    public Integer bandwidth;

    // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
    @NameInMap("iaas_id")
    public String iaasId;

    // 资源唯一标识
    @NameInMap("id")
    public String id;

    // 公网计费方式
    @NameInMap("internet_charge_type")
    public String internetChargeType;

    // 资源名称
    @NameInMap("name")
    public String name;

    // VIP类型
    @NameInMap("network_type")
    public String networkType;

    // 资源所属的地域id
    @NameInMap("region")
    public String region;

    // 
    //                     
    //                     资源所处的状态，资源状态，取值 CREATING：正在创建，CREATE_FAILED：创建失败，DELETING：正在删除，DELETED：删除成功，
    //                     DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，RESOURCE_REMOVING：资源删除中，
    //                     RESOURCE_REMOVE_FAILED：资源删除失败，INACTIVE：未激活，STOPPING：正在停止，STARTING：正在启动，ACTIVE：已激活，LOCKED：已锁定，
    //                     RELEASING：正在释放，UPDATING：正在更新，MOUNTING：正在挂载，UMOUNTING：正在卸载  
    //                 
    @NameInMap("status")
    public String status;

    // vip地址
    @NameInMap("vip_address")
    public String vipAddress;

    // address 类型：INTERNET, INTRANET
    @NameInMap("vip_address_type")
    public String vipAddressType;

    // VIP类型
    @NameInMap("vip_type")
    public String vipType;

    // vpc的id
    @NameInMap("vpc_id")
    public String vpcId;

    // 资源所属的可用区id
    @NameInMap("zone")
    public String zone;

    public static DepsLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
        DepsLoadBalancer self = new DepsLoadBalancer();
        return TeaModel.build(map, self);
    }

    public DepsLoadBalancer setAppServices(java.util.List<AppService> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<AppService> getAppServices() {
        return this.appServices;
    }

    public DepsLoadBalancer setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DepsLoadBalancer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DepsLoadBalancer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DepsLoadBalancer setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public DepsLoadBalancer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DepsLoadBalancer setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DepsLoadBalancer setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DepsLoadBalancer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DepsLoadBalancer setVipAddress(String vipAddress) {
        this.vipAddress = vipAddress;
        return this;
    }
    public String getVipAddress() {
        return this.vipAddress;
    }

    public DepsLoadBalancer setVipAddressType(String vipAddressType) {
        this.vipAddressType = vipAddressType;
        return this;
    }
    public String getVipAddressType() {
        return this.vipAddressType;
    }

    public DepsLoadBalancer setVipType(String vipType) {
        this.vipType = vipType;
        return this;
    }
    public String getVipType() {
        return this.vipType;
    }

    public DepsLoadBalancer setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DepsLoadBalancer setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
