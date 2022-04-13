// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodAffinityTermEntity extends TeaModel {
    // label_selector
    @NameInMap("label_selector")
    public java.util.List<MapStringToString> labelSelector;

    // namespaces
    @NameInMap("namespaces")
    public java.util.List<String> namespaces;

    // topology_key
    @NameInMap("topology_key")
    public String topologyKey;

    public static PodAffinityTermEntity build(java.util.Map<String, ?> map) throws Exception {
        PodAffinityTermEntity self = new PodAffinityTermEntity();
        return TeaModel.build(map, self);
    }

    public PodAffinityTermEntity setLabelSelector(java.util.List<MapStringToString> labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public java.util.List<MapStringToString> getLabelSelector() {
        return this.labelSelector;
    }

    public PodAffinityTermEntity setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }
    public java.util.List<String> getNamespaces() {
        return this.namespaces;
    }

    public PodAffinityTermEntity setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
        return this;
    }
    public String getTopologyKey() {
        return this.topologyKey;
    }

}
