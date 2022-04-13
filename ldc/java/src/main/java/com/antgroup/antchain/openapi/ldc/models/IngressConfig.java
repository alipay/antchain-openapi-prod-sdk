// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class IngressConfig extends TeaModel {
    // 统一接入域名。
    @NameInMap("domain")
    public String domain;

    // 监听及转发规则配置。
    @NameInMap("listeners")
    public java.util.List<LoadBalancerListenerWithRule> listeners;

    // 关联的负载均衡实例的ID。
    @NameInMap("load_balancer_iaas_id")
    public String loadBalancerIaasId;

    // 关联负载均衡实例名称。
    @NameInMap("load_balancer_name")
    public String loadBalancerName;

    // 负载均衡网络类型。
    @NameInMap("load_balancer_type")
    public String loadBalancerType;

    // ingress名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // Spanner集群名称。
    @NameInMap("spanner_cluster_id")
    public String spannerClusterId;

    // 统一接入协议（http|https）
    @NameInMap("unified_access_entries")
    public java.util.List<String> unifiedAccessEntries;

    // 与统一接入协议相对应的统一接入实例入端口列表
    @NameInMap("unified_access_entry_ports")
    public java.util.List<Long> unifiedAccessEntryPorts;

    // 所属统一接入实例
    @NameInMap("unified_access_instance_name")
    public String unifiedAccessInstanceName;

    // 统一接入实例联邦负载均衡id
    @NameInMap("unified_access_instance_federated_id")
    public String unifiedAccessInstanceFederatedId;

    // 监听及转发规则配置 V2
    @NameInMap("listeners_v2")
    public java.util.List<LoadBalancerListener> listenersV2;

    // 统一接入路由模式（LDC|NONLDC）
    @NameInMap("unified_access_route_rule")
    public String unifiedAccessRouteRule;

    public static IngressConfig build(java.util.Map<String, ?> map) throws Exception {
        IngressConfig self = new IngressConfig();
        return TeaModel.build(map, self);
    }

    public IngressConfig setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public IngressConfig setListeners(java.util.List<LoadBalancerListenerWithRule> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<LoadBalancerListenerWithRule> getListeners() {
        return this.listeners;
    }

    public IngressConfig setLoadBalancerIaasId(String loadBalancerIaasId) {
        this.loadBalancerIaasId = loadBalancerIaasId;
        return this;
    }
    public String getLoadBalancerIaasId() {
        return this.loadBalancerIaasId;
    }

    public IngressConfig setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public IngressConfig setLoadBalancerType(String loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }

    public IngressConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IngressConfig setSpannerClusterId(String spannerClusterId) {
        this.spannerClusterId = spannerClusterId;
        return this;
    }
    public String getSpannerClusterId() {
        return this.spannerClusterId;
    }

    public IngressConfig setUnifiedAccessEntries(java.util.List<String> unifiedAccessEntries) {
        this.unifiedAccessEntries = unifiedAccessEntries;
        return this;
    }
    public java.util.List<String> getUnifiedAccessEntries() {
        return this.unifiedAccessEntries;
    }

    public IngressConfig setUnifiedAccessEntryPorts(java.util.List<Long> unifiedAccessEntryPorts) {
        this.unifiedAccessEntryPorts = unifiedAccessEntryPorts;
        return this;
    }
    public java.util.List<Long> getUnifiedAccessEntryPorts() {
        return this.unifiedAccessEntryPorts;
    }

    public IngressConfig setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
        this.unifiedAccessInstanceName = unifiedAccessInstanceName;
        return this;
    }
    public String getUnifiedAccessInstanceName() {
        return this.unifiedAccessInstanceName;
    }

    public IngressConfig setUnifiedAccessInstanceFederatedId(String unifiedAccessInstanceFederatedId) {
        this.unifiedAccessInstanceFederatedId = unifiedAccessInstanceFederatedId;
        return this;
    }
    public String getUnifiedAccessInstanceFederatedId() {
        return this.unifiedAccessInstanceFederatedId;
    }

    public IngressConfig setListenersV2(java.util.List<LoadBalancerListener> listenersV2) {
        this.listenersV2 = listenersV2;
        return this;
    }
    public java.util.List<LoadBalancerListener> getListenersV2() {
        return this.listenersV2;
    }

    public IngressConfig setUnifiedAccessRouteRule(String unifiedAccessRouteRule) {
        this.unifiedAccessRouteRule = unifiedAccessRouteRule;
        return this;
    }
    public String getUnifiedAccessRouteRule() {
        return this.unifiedAccessRouteRule;
    }

}
