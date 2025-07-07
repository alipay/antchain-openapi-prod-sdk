// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ProcessInfo extends TeaModel {
    // 当前处理节点
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current_node")
    @Validation(required = true)
    public Long currentNode;

    // 扩展信息
    /**
     * <strong>example:</strong>
     * <p>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</p>
     */
    @NameInMap("extension_info")
    public String extensionInfo;

    // 节点列表
    @NameInMap("nodes")
    @Validation(required = true)
    public java.util.List<NodeDetail> nodes;

    // 流程ID
    /**
     * <strong>example:</strong>
     * <p>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</p>
     */
    @NameInMap("process_id")
    @Validation(required = true)
    public String processId;

    // 流程状态
    /**
     * <strong>example:</strong>
     * <p>processing</p>
     */
    @NameInMap("process_status")
    @Validation(required = true)
    public String processStatus;

    // 流程节点总数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_count")
    @Validation(required = true)
    public Long totalCount;

    // 数据对象ID
    /**
     * <strong>example:</strong>
     * <p>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</p>
     */
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    public static ProcessInfo build(java.util.Map<String, ?> map) throws Exception {
        ProcessInfo self = new ProcessInfo();
        return TeaModel.build(map, self);
    }

    public ProcessInfo setCurrentNode(Long currentNode) {
        this.currentNode = currentNode;
        return this;
    }
    public Long getCurrentNode() {
        return this.currentNode;
    }

    public ProcessInfo setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public ProcessInfo setNodes(java.util.List<NodeDetail> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<NodeDetail> getNodes() {
        return this.nodes;
    }

    public ProcessInfo setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public ProcessInfo setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public ProcessInfo setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ProcessInfo setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
