// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AffinityEntity extends TeaModel {
    // NodeAffinityConfig list
    @NameInMap("node_affinity")
    public java.util.List<NodeAffinityConfig> nodeAffinity;

    // pod_affinity list
    @NameInMap("pod_affinity")
    public java.util.List<PodAffinityConfig> podAffinity;

    public static AffinityEntity build(java.util.Map<String, ?> map) throws Exception {
        AffinityEntity self = new AffinityEntity();
        return TeaModel.build(map, self);
    }

    public AffinityEntity setNodeAffinity(java.util.List<NodeAffinityConfig> nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }
    public java.util.List<NodeAffinityConfig> getNodeAffinity() {
        return this.nodeAffinity;
    }

    public AffinityEntity setPodAffinity(java.util.List<PodAffinityConfig> podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }
    public java.util.List<PodAffinityConfig> getPodAffinity() {
        return this.podAffinity;
    }

}
