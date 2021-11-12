// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class LoadBalancer extends TeaModel {
    // 地址类型。INTRANET/INTERNET/OFFICE
    @NameInMap("address_type")
    public String addressType;

    // 后端服务器列表。
    @NameInMap("backend_servers")
    public java.util.List<BackendServer> backendServers;

    // 实例域名。
    @NameInMap("domain")
    public String domain;

    // 监听器列表。
    @NameInMap("listeners")
    public java.util.List<Listener> listeners;

    // 实例名称。
    @NameInMap("name")
    public String name;

    // 类型。SLB/ALB。
    @NameInMap("provider")
    public String provider;

    // 实例id。
    @NameInMap("resource_id")
    public String resourceId;

    // 资源池id。
    @NameInMap("resource_pool_id")
    public String resourcePoolId;

    // vip地址。
    @NameInMap("vip")
    public String vip;

    public static LoadBalancer build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancer self = new LoadBalancer();
        return TeaModel.build(map, self);
    }

    public LoadBalancer setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public LoadBalancer setBackendServers(java.util.List<BackendServer> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<BackendServer> getBackendServers() {
        return this.backendServers;
    }

    public LoadBalancer setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public LoadBalancer setListeners(java.util.List<Listener> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<Listener> getListeners() {
        return this.listeners;
    }

    public LoadBalancer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancer setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public LoadBalancer setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public LoadBalancer setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public String getResourcePoolId() {
        return this.resourcePoolId;
    }

    public LoadBalancer setVip(String vip) {
        this.vip = vip;
        return this;
    }
    public String getVip() {
        return this.vip;
    }

}
