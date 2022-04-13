// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeAffinity extends TeaModel {
    // The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions
    @NameInMap("preferred_during_scheduling_ignored_during_execution")
    public java.util.List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution;

    // If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node
    @NameInMap("required_during_dcheduling_ignored_during_execution")
    @Validation(required = true)
    public NodeSelector requiredDuringDchedulingIgnoredDuringExecution;

    public static NodeAffinity build(java.util.Map<String, ?> map) throws Exception {
        NodeAffinity self = new NodeAffinity();
        return TeaModel.build(map, self);
    }

    public NodeAffinity setPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
        return this;
    }
    public java.util.List<PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return this.preferredDuringSchedulingIgnoredDuringExecution;
    }

    public NodeAffinity setRequiredDuringDchedulingIgnoredDuringExecution(NodeSelector requiredDuringDchedulingIgnoredDuringExecution) {
        this.requiredDuringDchedulingIgnoredDuringExecution = requiredDuringDchedulingIgnoredDuringExecution;
        return this;
    }
    public NodeSelector getRequiredDuringDchedulingIgnoredDuringExecution() {
        return this.requiredDuringDchedulingIgnoredDuringExecution;
    }

}
