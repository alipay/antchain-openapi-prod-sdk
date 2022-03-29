// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class WorkspaceDTO extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // outside_ws_id
    @NameInMap("outside_ws_id")
    @Validation(required = true)
    public String outsideWsId;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // outside_tenant_id
    @NameInMap("outside_tenant_id")
    @Validation(required = true)
    public String outsideTenantId;

    // stack_view
    @NameInMap("stack_view")
    @Validation(required = true)
    public Boolean stackView;

    public static WorkspaceDTO build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceDTO self = new WorkspaceDTO();
        return TeaModel.build(map, self);
    }

    public WorkspaceDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public WorkspaceDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceDTO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceDTO setOutsideWsId(String outsideWsId) {
        this.outsideWsId = outsideWsId;
        return this;
    }
    public String getOutsideWsId() {
        return this.outsideWsId;
    }

    public WorkspaceDTO setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public WorkspaceDTO setOutsideTenantId(String outsideTenantId) {
        this.outsideTenantId = outsideTenantId;
        return this;
    }
    public String getOutsideTenantId() {
        return this.outsideTenantId;
    }

    public WorkspaceDTO setStackView(Boolean stackView) {
        this.stackView = stackView;
        return this;
    }
    public Boolean getStackView() {
        return this.stackView;
    }

}
