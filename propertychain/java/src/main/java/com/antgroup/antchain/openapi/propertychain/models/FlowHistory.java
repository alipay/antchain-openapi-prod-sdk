// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class FlowHistory extends TeaModel {
    // 操作信息
    @NameInMap("flow_node_list")
    public java.util.List<FlowNode> flowNodeList;

    public static FlowHistory build(java.util.Map<String, ?> map) throws Exception {
        FlowHistory self = new FlowHistory();
        return TeaModel.build(map, self);
    }

    public FlowHistory setFlowNodeList(java.util.List<FlowNode> flowNodeList) {
        this.flowNodeList = flowNodeList;
        return this;
    }
    public java.util.List<FlowNode> getFlowNodeList() {
        return this.flowNodeList;
    }

}
