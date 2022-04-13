// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodAffinityConfig extends TeaModel {
    // anti_affinity
    @NameInMap("anti_affinity")
    public Boolean antiAffinity;

    // pod_affinity_term
    @NameInMap("pod_affinity_term")
    public PodAffinityTermEntity podAffinityTerm;

    // requested
    @NameInMap("requested")
    public Boolean requested;

    // weight
    @NameInMap("weight")
    public Long weight;

    public static PodAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        PodAffinityConfig self = new PodAffinityConfig();
        return TeaModel.build(map, self);
    }

    public PodAffinityConfig setAntiAffinity(Boolean antiAffinity) {
        this.antiAffinity = antiAffinity;
        return this;
    }
    public Boolean getAntiAffinity() {
        return this.antiAffinity;
    }

    public PodAffinityConfig setPodAffinityTerm(PodAffinityTermEntity podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }
    public PodAffinityTermEntity getPodAffinityTerm() {
        return this.podAffinityTerm;
    }

    public PodAffinityConfig setRequested(Boolean requested) {
        this.requested = requested;
        return this;
    }
    public Boolean getRequested() {
        return this.requested;
    }

    public PodAffinityConfig setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
