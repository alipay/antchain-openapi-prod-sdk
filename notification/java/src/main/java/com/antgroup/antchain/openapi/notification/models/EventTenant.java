// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class EventTenant extends TeaModel {
    // 智科租户2088 ID，tenant_id/tenant_name二选一
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户8位字母，tenant_id/tenant_name二选一
    @NameInMap("tenant_name")
    public String tenantName;

    public static EventTenant build(java.util.Map<String, ?> map) throws Exception {
        EventTenant self = new EventTenant();
        return TeaModel.build(map, self);
    }

    public EventTenant setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EventTenant setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
