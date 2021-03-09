// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceZoneView extends TeaModel {
    // id
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

    // state
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static WorkspaceZoneView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceZoneView self = new WorkspaceZoneView();
        return TeaModel.build(map, self);
    }

    public WorkspaceZoneView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceZoneView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public WorkspaceZoneView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceZoneView setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public WorkspaceZoneView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
