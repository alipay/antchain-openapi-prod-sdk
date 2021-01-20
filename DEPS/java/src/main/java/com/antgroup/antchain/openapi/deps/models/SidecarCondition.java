// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarCondition extends TeaModel {
    // 支持的workspaceGroup
    @NameInMap("workspace_groups")
    public String workspaceGroups;

    // 支持的cell列表
    @NameInMap("cells")
    public String cells;

    public static SidecarCondition build(java.util.Map<String, ?> map) throws Exception {
        SidecarCondition self = new SidecarCondition();
        return TeaModel.build(map, self);
    }

    public SidecarCondition setWorkspaceGroups(String workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public String getWorkspaceGroups() {
        return this.workspaceGroups;
    }

    public SidecarCondition setCells(String cells) {
        this.cells = cells;
        return this;
    }
    public String getCells() {
        return this.cells;
    }

}
