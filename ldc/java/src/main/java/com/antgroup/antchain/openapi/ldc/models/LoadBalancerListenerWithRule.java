// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class LoadBalancerListenerWithRule extends TeaModel {
    // 统一接入域名。
    @NameInMap("domain")
    @Validation(required = true)
    public String domain;

    // 负载均衡监听。
    @NameInMap("listener")
    @Validation(required = true)
    public LoadBalancerListener listener;

    // 转发路径。
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 权重。
    @NameInMap("weight")
    public Long weight;

    public static LoadBalancerListenerWithRule build(java.util.Map<String, ?> map) throws Exception {
        LoadBalancerListenerWithRule self = new LoadBalancerListenerWithRule();
        return TeaModel.build(map, self);
    }

    public LoadBalancerListenerWithRule setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public LoadBalancerListenerWithRule setListener(LoadBalancerListener listener) {
        this.listener = listener;
        return this;
    }
    public LoadBalancerListener getListener() {
        return this.listener;
    }

    public LoadBalancerListenerWithRule setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public LoadBalancerListenerWithRule setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
