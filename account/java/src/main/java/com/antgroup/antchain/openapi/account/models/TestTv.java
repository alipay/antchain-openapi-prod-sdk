// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class TestTv extends TeaModel {
    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static TestTv build(java.util.Map<String, ?> map) throws Exception {
        TestTv self = new TestTv();
        return TeaModel.build(map, self);
    }

    public TestTv setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
