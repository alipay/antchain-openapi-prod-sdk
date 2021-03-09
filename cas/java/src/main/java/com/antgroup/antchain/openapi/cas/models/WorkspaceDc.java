// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceDc extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // datacenterId
    @NameInMap("datacenter_id")
    @Validation(required = true)
    public String datacenterId;

    // workspaceId
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // datacenterType
    @NameInMap("datacenter_type")
    @Validation(required = true)
    public String datacenterType;

    // gmtCreate
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreate;

    // gmtModified
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    public static WorkspaceDc build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDc self = new WorkspaceDc();
        return TeaModel.build(map, self);
    }

    public WorkspaceDc setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceDc setDatacenterId(String datacenterId) {
        this.datacenterId = datacenterId;
        return this;
    }
    public String getDatacenterId() {
        return this.datacenterId;
    }

    public WorkspaceDc setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceDc setDatacenterType(String datacenterType) {
        this.datacenterType = datacenterType;
        return this;
    }
    public String getDatacenterType() {
        return this.datacenterType;
    }

    public WorkspaceDc setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public WorkspaceDc setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
