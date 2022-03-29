// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Tenant extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 租户名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 展示名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // outsideTenantId
    @NameInMap("outside_tenant_id")
    @Validation(required = true)
    public String outsideTenantId;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // config
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // stack_view
    @NameInMap("stack_view")
    @Validation(required = true)
    public Boolean stackView;

    public static Tenant build(java.util.Map<String, ?> map) throws Exception {
        Tenant self = new Tenant();
        return TeaModel.build(map, self);
    }

    public Tenant setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Tenant setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Tenant setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Tenant setOutsideTenantId(String outsideTenantId) {
        this.outsideTenantId = outsideTenantId;
        return this;
    }
    public String getOutsideTenantId() {
        return this.outsideTenantId;
    }

    public Tenant setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Tenant setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public Tenant setStackView(Boolean stackView) {
        this.stackView = stackView;
        return this;
    }
    public Boolean getStackView() {
        return this.stackView;
    }

}
