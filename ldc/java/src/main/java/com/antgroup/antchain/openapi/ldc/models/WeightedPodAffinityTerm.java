// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class WeightedPodAffinityTerm extends TeaModel {
    // Pod Affinity Term
    @NameInMap("pod_affinity_term")
    @Validation(required = true)
    public PodAffinityTerm podAffinityTerm;

    // weight
    @NameInMap("weight")
    @Validation(required = true)
    public Long weight;

    public static WeightedPodAffinityTerm build(java.util.Map<String, ?> map) throws Exception {
        WeightedPodAffinityTerm self = new WeightedPodAffinityTerm();
        return TeaModel.build(map, self);
    }

    public WeightedPodAffinityTerm setPodAffinityTerm(PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }
    public PodAffinityTerm getPodAffinityTerm() {
        return this.podAffinityTerm;
    }

    public WeightedPodAffinityTerm setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
