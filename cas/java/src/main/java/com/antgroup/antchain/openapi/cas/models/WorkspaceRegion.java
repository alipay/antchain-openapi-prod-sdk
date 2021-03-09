// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceRegion extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspaceId
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // regionId
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // type
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // securedIsolationIdentity
    @NameInMap("secured_isolation_identity")
    @Validation(required = true)
    public String securedIsolationIdentity;

    // securedIsolationName
    @NameInMap("secured_isolation_name")
    @Validation(required = true)
    public String securedIsolationName;

    // securedZoneId
    @NameInMap("secured_zone_id")
    @Validation(required = true)
    public String securedZoneId;

    public static WorkspaceRegion build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceRegion self = new WorkspaceRegion();
        return TeaModel.build(map, self);
    }

    public WorkspaceRegion setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceRegion setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceRegion setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WorkspaceRegion setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public WorkspaceRegion setSecuredIsolationIdentity(String securedIsolationIdentity) {
        this.securedIsolationIdentity = securedIsolationIdentity;
        return this;
    }
    public String getSecuredIsolationIdentity() {
        return this.securedIsolationIdentity;
    }

    public WorkspaceRegion setSecuredIsolationName(String securedIsolationName) {
        this.securedIsolationName = securedIsolationName;
        return this;
    }
    public String getSecuredIsolationName() {
        return this.securedIsolationName;
    }

    public WorkspaceRegion setSecuredZoneId(String securedZoneId) {
        this.securedZoneId = securedZoneId;
        return this;
    }
    public String getSecuredZoneId() {
        return this.securedZoneId;
    }

}
