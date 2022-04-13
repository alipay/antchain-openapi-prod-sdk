// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodAffinity extends TeaModel {
    // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions.
    @NameInMap("preferred_during_scheduling_ignored_during_execution")
    public java.util.List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution;

    // f the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node.
    @NameInMap("required_during_dcheduling_ignored_during_execution")
    @Validation(required = true)
    public java.util.List<PodAffinityTerm> requiredDuringDchedulingIgnoredDuringExecution;

    public static PodAffinity build(java.util.Map<String, ?> map) throws Exception {
        PodAffinity self = new PodAffinity();
        return TeaModel.build(map, self);
    }

    public PodAffinity setPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<WeightedPodAffinityTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }
    public java.util.List<WeightedPodAffinityTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    public PodAffinity setRequiredDuringDchedulingIgnoredDuringExecution(java.util.List<PodAffinityTerm> requiredDuringDchedulingIgnoredDuringExecution) {
        this.requiredDuringDchedulingIgnoredDuringExecution = requiredDuringDchedulingIgnoredDuringExecution;
        return this;
    }
    public java.util.List<PodAffinityTerm> getRequiredDuringDchedulingIgnoredDuringExecution() {
        return this.requiredDuringDchedulingIgnoredDuringExecution;
    }

}
