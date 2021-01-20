// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TopologyEdge extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // source节点的id
    @NameInMap("source")
    public String source;

    // target节点的id
    @NameInMap("target")
    public String target;

    public static TopologyEdge build(java.util.Map<String, ?> map) throws Exception {
        TopologyEdge self = new TopologyEdge();
        return TeaModel.build(map, self);
    }

    public TopologyEdge setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public TopologyEdge setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public TopologyEdge setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
