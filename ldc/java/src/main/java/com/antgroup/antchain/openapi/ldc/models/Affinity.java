// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Affinity extends TeaModel {
    // Describes node affinity scheduling rules for the pod.
    // 
    @NameInMap("node_affinity")
    public NodeAffinity nodeAffinity;

    // Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
    @NameInMap("pod_affinity")
    public PodAffinity podAffinity;

    // Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
    // 
    @NameInMap("pod_anti_affinity")
    public PodAntiAffinity podAntiAffinity;

    public static Affinity build(java.util.Map<String, ?> map) throws Exception {
        Affinity self = new Affinity();
        return TeaModel.build(map, self);
    }

    public Affinity setNodeAffinity(NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }
    public NodeAffinity getNodeAffinity() {
        return this.nodeAffinity;
    }

    public Affinity setPodAffinity(PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
        return this;
    }
    public PodAffinity getPodAffinity() {
        return this.podAffinity;
    }

    public Affinity setPodAntiAffinity(PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
        return this;
    }
    public PodAntiAffinity getPodAntiAffinity() {
        return this.podAntiAffinity;
    }

}
