// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // outsideWsId
    @NameInMap("outside_ws_id")
    @Validation(required = true)
    public String outsideWsId;

    // outsideTenantId
    @NameInMap("outside_tenant_id")
    @Validation(required = true)
    public String outsideTenantId;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Workspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Workspace setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Workspace setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public Workspace setOutsideWsId(String outsideWsId) {
        this.outsideWsId = outsideWsId;
        return this;
    }
    public String getOutsideWsId() {
        return this.outsideWsId;
    }

    public Workspace setOutsideTenantId(String outsideTenantId) {
        this.outsideTenantId = outsideTenantId;
        return this;
    }
    public String getOutsideTenantId() {
        return this.outsideTenantId;
    }

}
