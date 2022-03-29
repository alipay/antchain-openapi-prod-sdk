// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OneConsoleRegion extends TeaModel {
    // region id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspaces
    @NameInMap("workspaces")
    @Validation(required = true)
    public java.util.List<OneConsoleWorkspace> workspaces;

    public static OneConsoleRegion build(java.util.Map<String, ?> map) throws Exception {
        OneConsoleRegion self = new OneConsoleRegion();
        return TeaModel.build(map, self);
    }

    public OneConsoleRegion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OneConsoleRegion setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public OneConsoleRegion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OneConsoleRegion setWorkspaces(java.util.List<OneConsoleWorkspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<OneConsoleWorkspace> getWorkspaces() {
        return this.workspaces;
    }

}
