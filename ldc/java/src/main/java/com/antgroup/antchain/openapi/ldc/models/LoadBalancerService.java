// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadBalancerService extends TeaModel {
    // 域名。
    @NameInMap("domain")
    public String domain;

    // 负载均衡实例监听列表。
    @NameInMap("listeners")
    @Validation(required = true)
    public java.util.List<LoadBalancerListener> listeners;

    // 关联的负载均衡实例的ID。
    @NameInMap("load_balancer_iaas_id")
    public String loadBalancerIaasId;

    // LoadBalancer类型service关联负载均衡实例名称。
    @NameInMap("load_balancer_name")
    public String loadBalancerName;

    // LoadBalancer类型service名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Spanner集群名称。
    @NameInMap("spanner_cluster_id")
    public String spannerClusterId;

    // 负载均衡实例的网络类型（internet | intranet | office | multidomain）
    @NameInMap("address_type")
    public String addressType;

    // 该服务在每个 cell 下要复用的负载均衡实例 ID
    @NameInMap("cell_slb_iaas_id_map")
    public java.util.List<MapStringToString> cellSlbIaasIdMap;

    // custom address type模式下，指定各cell负载均衡vip
    @NameInMap("cell_lb_vip_map")
    public java.util.List<MapStringToString> cellLbVipMap;

    // 是否使用联邦负载均衡实例
    @NameInMap("use_fed_loadbalancer")
    public Boolean useFedLoadbalancer;

    // 联邦负载均衡实例名称
    @NameInMap("fed_loadbalancer_name")
    public String fedLoadbalancerName;

    public static LoadBalancerService build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerService self = new LoadBalancerService();
        return TeaModel.build(map, self);
    }

    public LoadBalancerService setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public LoadBalancerService setListeners(java.util.List<LoadBalancerListener> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<LoadBalancerListener> getListeners() {
        return this.listeners;
    }

    public LoadBalancerService setLoadBalancerIaasId(String loadBalancerIaasId) {
        this.loadBalancerIaasId = loadBalancerIaasId;
        return this;
    }
    public String getLoadBalancerIaasId() {
        return this.loadBalancerIaasId;
    }

    public LoadBalancerService setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public LoadBalancerService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancerService setSpannerClusterId(String spannerClusterId) {
        this.spannerClusterId = spannerClusterId;
        return this;
    }
    public String getSpannerClusterId() {
        return this.spannerClusterId;
    }

    public LoadBalancerService setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public LoadBalancerService setCellSlbIaasIdMap(java.util.List<MapStringToString> cellSlbIaasIdMap) {
        this.cellSlbIaasIdMap = cellSlbIaasIdMap;
        return this;
    }
    public java.util.List<MapStringToString> getCellSlbIaasIdMap() {
        return this.cellSlbIaasIdMap;
    }

    public LoadBalancerService setCellLbVipMap(java.util.List<MapStringToString> cellLbVipMap) {
        this.cellLbVipMap = cellLbVipMap;
        return this;
    }
    public java.util.List<MapStringToString> getCellLbVipMap() {
        return this.cellLbVipMap;
    }

    public LoadBalancerService setUseFedLoadbalancer(Boolean useFedLoadbalancer) {
        this.useFedLoadbalancer = useFedLoadbalancer;
        return this;
    }
    public Boolean getUseFedLoadbalancer() {
        return this.useFedLoadbalancer;
    }

    public LoadBalancerService setFedLoadbalancerName(String fedLoadbalancerName) {
        this.fedLoadbalancerName = fedLoadbalancerName;
        return this;
    }
    public String getFedLoadbalancerName() {
        return this.fedLoadbalancerName;
    }

}
