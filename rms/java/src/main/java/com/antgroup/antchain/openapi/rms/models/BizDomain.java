// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BizDomain extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // tenant_id
    // 
    @NameInMap("tenant_id")
    @Validation(required = true)
    public Long tenantId;

    // config
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // outside_domain_id
    @NameInMap("outside_domain_id")
    @Validation(required = true)
    public String outsideDomainId;

    // entity_list
    @NameInMap("entity_list")
    @Validation(required = true)
    public String entityList;

    public static BizDomain build(java.util.Map<String, ?> map) throws Exception {
        BizDomain self = new BizDomain();
        return TeaModel.build(map, self);
    }

    public BizDomain setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BizDomain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BizDomain setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public BizDomain setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public BizDomain setOutsideDomainId(String outsideDomainId) {
        this.outsideDomainId = outsideDomainId;
        return this;
    }
    public String getOutsideDomainId() {
        return this.outsideDomainId;
    }

    public BizDomain setEntityList(String entityList) {
        this.entityList = entityList;
        return this;
    }
    public String getEntityList() {
        return this.entityList;
    }

}
