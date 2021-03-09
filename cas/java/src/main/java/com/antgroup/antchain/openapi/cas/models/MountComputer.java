// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class MountComputer extends TeaModel {
    // computer
    @NameInMap("computer")
    public Computer computer;

    // domain
    @NameInMap("domain")
    public String domain;

    // loadbalancer
    @NameInMap("loadbalancer")
    public LoadBalancer loadbalancer;

    // status
    @NameInMap("status")
    public String status;

    // weight
    @NameInMap("weight")
    @Validation(required = true)
    public Long weight;

    public static MountComputer build(java.util.Map<String, ?> map) throws Exception {
        MountComputer self = new MountComputer();
        return TeaModel.build(map, self);
    }

    public MountComputer setComputer(Computer computer) {
        this.computer = computer;
        return this;
    }
    public Computer getComputer() {
        return this.computer;
    }

    public MountComputer setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public MountComputer setLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }
    public LoadBalancer getLoadbalancer() {
        return this.loadbalancer;
    }

    public MountComputer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MountComputer setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
