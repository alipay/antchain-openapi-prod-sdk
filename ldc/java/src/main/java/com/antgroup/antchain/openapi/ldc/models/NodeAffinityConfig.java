// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NodeAffinityConfig extends TeaModel {
    // match_expressions
    @NameInMap("match_expressions")
    public java.util.List<MatchExpression> matchExpressions;

    // requested
    @NameInMap("requested")
    public Boolean requested;

    // weight
    @NameInMap("weight")
    public Long weight;

    public static NodeAffinityConfig build(java.util.Map<String, ?> map) throws Exception {
        NodeAffinityConfig self = new NodeAffinityConfig();
        return TeaModel.build(map, self);
    }

    public NodeAffinityConfig setMatchExpressions(java.util.List<MatchExpression> matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public java.util.List<MatchExpression> getMatchExpressions() {
        return this.matchExpressions;
    }

    public NodeAffinityConfig setRequested(Boolean requested) {
        this.requested = requested;
        return this;
    }
    public Boolean getRequested() {
        return this.requested;
    }

    public NodeAffinityConfig setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
