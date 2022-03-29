// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class NavWorkspace extends TeaModel {
    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public WorkspaceDTO workspace;

    public static NavWorkspace build(java.util.Map<String, ?> map) throws Exception {
        NavWorkspace self = new NavWorkspace();
        return TeaModel.build(map, self);
    }

    public NavWorkspace setWorkspace(WorkspaceDTO workspace) {
        this.workspace = workspace;
        return this;
    }
    public WorkspaceDTO getWorkspace() {
        return this.workspace;
    }

}
