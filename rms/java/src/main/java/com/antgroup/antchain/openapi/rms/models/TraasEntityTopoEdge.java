// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasEntityTopoEdge extends TeaModel {
    // source_node
    @NameInMap("source_node")
    @Validation(required = true)
    public TraasEntityTopoNode sourceNode;

    // target_node
    @NameInMap("target_node")
    @Validation(required = true)
    public TraasEntityTopoNode targetNode;

    // relation
    @NameInMap("relation")
    @Validation(required = true)
    public String relation;

    public static TraasEntityTopoEdge build(java.util.Map<String, ?> map) throws Exception {
        TraasEntityTopoEdge self = new TraasEntityTopoEdge();
        return TeaModel.build(map, self);
    }

    public TraasEntityTopoEdge setSourceNode(TraasEntityTopoNode sourceNode) {
        this.sourceNode = sourceNode;
        return this;
    }
    public TraasEntityTopoNode getSourceNode() {
        return this.sourceNode;
    }

    public TraasEntityTopoEdge setTargetNode(TraasEntityTopoNode targetNode) {
        this.targetNode = targetNode;
        return this;
    }
    public TraasEntityTopoNode getTargetNode() {
        return this.targetNode;
    }

    public TraasEntityTopoEdge setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

}
