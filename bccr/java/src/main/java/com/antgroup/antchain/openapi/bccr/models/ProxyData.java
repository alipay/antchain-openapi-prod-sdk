// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ProxyData extends TeaModel {
    // 金融云租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 租户名称
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    public static ProxyData build(java.util.Map<String, ?> map) throws Exception {
        ProxyData self = new ProxyData();
        return TeaModel.build(map, self);
    }

    public ProxyData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ProxyData setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
