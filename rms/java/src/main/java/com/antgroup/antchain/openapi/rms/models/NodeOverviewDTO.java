// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NodeOverviewDTO extends TeaModel {
    // 磁盘 top排序应用
    @NameInMap("disk_top_nodes")
    @Validation(required = true)
    public java.util.List<NodeTopItem> diskTopNodes;

    // 	
    // cpu top排序应用
    @NameInMap("cpu_top_nodes")
    @Validation(required = true)
    public java.util.List<NodeTopItem> cpuTopNodes;

    // mem top排序应用
    @NameInMap("mem_top_nodes")
    @Validation(required = true)
    public java.util.List<NodeTopItem> memTopNodes;

    public static NodeOverviewDTO build(java.util.Map<String, ?> map) throws Exception {
        NodeOverviewDTO self = new NodeOverviewDTO();
        return TeaModel.build(map, self);
    }

    public NodeOverviewDTO setDiskTopNodes(java.util.List<NodeTopItem> diskTopNodes) {
        this.diskTopNodes = diskTopNodes;
        return this;
    }
    public java.util.List<NodeTopItem> getDiskTopNodes() {
        return this.diskTopNodes;
    }

    public NodeOverviewDTO setCpuTopNodes(java.util.List<NodeTopItem> cpuTopNodes) {
        this.cpuTopNodes = cpuTopNodes;
        return this;
    }
    public java.util.List<NodeTopItem> getCpuTopNodes() {
        return this.cpuTopNodes;
    }

    public NodeOverviewDTO setMemTopNodes(java.util.List<NodeTopItem> memTopNodes) {
        this.memTopNodes = memTopNodes;
        return this;
    }
    public java.util.List<NodeTopItem> getMemTopNodes() {
        return this.memTopNodes;
    }

}
