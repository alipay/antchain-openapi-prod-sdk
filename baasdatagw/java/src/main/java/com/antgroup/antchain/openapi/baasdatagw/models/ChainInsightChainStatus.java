// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightChainStatus extends TeaModel {
    // 节点信息
    @NameInMap("node_infos")
    public java.util.List<ChainInsightNodeInfo> nodeInfos;

    // 链状态
    @NameInMap("chain_statuses")
    public java.util.List<ChainStatus> chainStatuses;

    public static ChainInsightChainStatus build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightChainStatus self = new ChainInsightChainStatus();
        return TeaModel.build(map, self);
    }

    public ChainInsightChainStatus setNodeInfos(java.util.List<ChainInsightNodeInfo> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }
    public java.util.List<ChainInsightNodeInfo> getNodeInfos() {
        return this.nodeInfos;
    }

    public ChainInsightChainStatus setChainStatuses(java.util.List<ChainStatus> chainStatuses) {
        this.chainStatuses = chainStatuses;
        return this;
    }
    public java.util.List<ChainStatus> getChainStatuses() {
        return this.chainStatuses;
    }

}
