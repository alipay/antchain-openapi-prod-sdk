// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadBalancerInstance extends TeaModel {
    // 负责均衡iaas id。
    @NameInMap("iaas_id")
    @Validation(required = true)
    public String iaasId;

    // 监听器。
    @NameInMap("listeners")
    @Validation(required = true)
    public java.util.List<LoadBalancerListener> listeners;

    // 负载均衡名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 负责均衡PAAS id。
    @NameInMap("paas_id")
    public String paasId;

    // 负责均衡类型。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 负载均衡vip地址。
    @NameInMap("vip_addresses")
    public java.util.List<String> vipAddresses;

    // 统一接入域名。
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    public static LoadBalancerInstance build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerInstance self = new LoadBalancerInstance();
        return TeaModel.build(map, self);
    }

    public LoadBalancerInstance setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public LoadBalancerInstance setListeners(java.util.List<LoadBalancerListener> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<LoadBalancerListener> getListeners() {
        return this.listeners;
    }

    public LoadBalancerInstance setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LoadBalancerInstance setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public LoadBalancerInstance setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LoadBalancerInstance setVipAddresses(java.util.List<String> vipAddresses) {
        this.vipAddresses = vipAddresses;
        return this;
    }
    public java.util.List<String> getVipAddresses() {
        return this.vipAddresses;
    }

    public LoadBalancerInstance setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
