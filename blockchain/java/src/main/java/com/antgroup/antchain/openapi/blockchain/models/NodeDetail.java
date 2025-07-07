// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class NodeDetail extends TeaModel {
    // 节点审批意见
    /**
     * <strong>example:</strong>
     * <p>agree comment</p>
     */
    @NameInMap("comment")
    @Validation(required = true)
    public String comment;

    // 节点ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 节点名称
    /**
     * <strong>example:</strong>
     * <p>Bob</p>
     */
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    // 节点状态
    /**
     * <strong>example:</strong>
     * <p>Agree</p>
     */
    @NameInMap("node_status")
    @Validation(required = true)
    public String nodeStatus;

    // 节点审批时间
    /**
     * <strong>example:</strong>
     * <p>1592883002497</p>
     */
    @NameInMap("operate_time")
    @Validation(required = true)
    public Long operateTime;

    // 扩展参数
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("extension_info")
    public String extensionInfo;

    public static NodeDetail build(java.util.Map<String, ?> map) throws Exception {
        NodeDetail self = new NodeDetail();
        return TeaModel.build(map, self);
    }

    public NodeDetail setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public NodeDetail setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public NodeDetail setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public NodeDetail setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public NodeDetail setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public NodeDetail setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

}
