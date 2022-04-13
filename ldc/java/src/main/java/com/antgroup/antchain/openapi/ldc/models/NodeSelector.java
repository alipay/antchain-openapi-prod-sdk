// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeSelector extends TeaModel {
    // node selector terms
    @NameInMap("node_selector_terms")
    @Validation(required = true)
    public java.util.List<NodeSelectorTerm> nodeSelectorTerms;

    public static NodeSelector build(java.util.Map<String, ?> map) throws Exception {
        NodeSelector self = new NodeSelector();
        return TeaModel.build(map, self);
    }

    public NodeSelector setNodeSelectorTerms(java.util.List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
        return this;
    }
    public java.util.List<NodeSelectorTerm> getNodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

}
