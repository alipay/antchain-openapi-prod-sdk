// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PreferredSchedulingTerm extends TeaModel {
    // A null or empty node selector term matches no objects
    @NameInMap("preference")
    public NodeSelectorTerm preference;

    // Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
    // 
    @NameInMap("weight")
    @Validation(required = true)
    public Long weight;

    public static PreferredSchedulingTerm build(java.util.Map<String, ?> map) throws Exception {
        PreferredSchedulingTerm self = new PreferredSchedulingTerm();
        return TeaModel.build(map, self);
    }

    public PreferredSchedulingTerm setPreference(NodeSelectorTerm preference) {
        this.preference = preference;
        return this;
    }
    public NodeSelectorTerm getPreference() {
        return this.preference;
    }

    public PreferredSchedulingTerm setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
