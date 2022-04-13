// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeSelectorTerm extends TeaModel {
    // A list of node selector requirements by node labels.
    // 
    @NameInMap("match_expressions")
    public java.util.List<NodeSelectorRequirement> matchExpressions;

    // A list of node selector requirements by node fields.
    // 
    @NameInMap("match_fields")
    @Validation(required = true)
    public java.util.List<NodeSelectorRequirement> matchFields;

    public static NodeSelectorTerm build(java.util.Map<String, ?> map) throws Exception {
        NodeSelectorTerm self = new NodeSelectorTerm();
        return TeaModel.build(map, self);
    }

    public NodeSelectorTerm setMatchExpressions(java.util.List<NodeSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public java.util.List<NodeSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions;
    }

    public NodeSelectorTerm setMatchFields(java.util.List<NodeSelectorRequirement> matchFields) {
        this.matchFields = matchFields;
        return this;
    }
    public java.util.List<NodeSelectorRequirement> getMatchFields() {
        return this.matchFields;
    }

}
