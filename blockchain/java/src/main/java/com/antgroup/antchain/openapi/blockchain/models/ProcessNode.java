// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ProcessNode extends TeaModel {
    // 审批节点ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("node_id")
    @Validation(required = true, maxLength = 100)
    public String nodeId;

    // 节点名称
    /**
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("node_name")
    @Validation(required = true, maxLength = 64)
    public String nodeName;

    // 节点序号，从1开始编号
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("node_num")
    @Validation(required = true, minimum = 1)
    public Long nodeNum;

    public static ProcessNode build(java.util.Map<String, ?> map) throws Exception {
        ProcessNode self = new ProcessNode();
        return TeaModel.build(map, self);
    }

    public ProcessNode setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ProcessNode setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ProcessNode setNodeNum(Long nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }
    public Long getNodeNum() {
        return this.nodeNum;
    }

}
