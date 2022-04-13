// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Region extends TeaModel {
    // region id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // region name
    @NameInMap("name")
    public String name;

    // workspace list
    @NameInMap("workspaces")
    public java.util.List<Workspace> workspaces;

    public static Region build(java.util.Map<String, ?> map) throws Exception {
        Region self = new Region();
        return TeaModel.build(map, self);
    }

    public Region setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Region setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Region setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

}
