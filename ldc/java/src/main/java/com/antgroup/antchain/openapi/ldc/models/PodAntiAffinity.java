// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodAntiAffinity extends TeaModel {
    // The scheduler will prefer to schedule pods to nodes that satisfy the anti-affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
    @NameInMap("preferred_during_scheduling_ignored_during_execution")
    public java.util.List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;

    // If the anti-affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
    @NameInMap("required_during_scheduling_ignored_during_execution")
    public java.util.List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution;

    public static PodAntiAffinity build(java.util.Map<String, ?> map) throws Exception {
        PodAntiAffinity self = new PodAntiAffinity();
        return TeaModel.build(map, self);
    }

    public PodAntiAffinity setPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }
    public java.util.List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAntiAffinity setRequiredDuringSchedulingIgnoredDuringExecution(java.util.List<PodAffinityTerm> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
        return this;
    }
    public java.util.List<PodAffinityTerm> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return this.requiredDuringSchedulingIgnoredDuringExecution;
    }

}
