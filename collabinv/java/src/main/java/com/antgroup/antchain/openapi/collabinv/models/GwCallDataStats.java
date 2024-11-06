// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class GwCallDataStats extends TeaModel {
    // 租户
    @NameInMap("invoke_tenant")
    public String invokeTenant;

    // 租户ID
    @NameInMap("invoke_tenant_id")
    public String invokeTenantId;

    // 公key
    @NameInMap("access_key")
    public String accessKey;

    // 调用数量
    @NameInMap("invoke_count")
    public String invokeCount;

    // 调用查得统计
    @NameInMap("success_count")
    public String successCount;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GwCallDataStats build(java.util.Map<String, ?> map) throws Exception {
        GwCallDataStats self = new GwCallDataStats();
        return TeaModel.build(map, self);
    }

    public GwCallDataStats setInvokeTenant(String invokeTenant) {
        this.invokeTenant = invokeTenant;
        return this;
    }
    public String getInvokeTenant() {
        return this.invokeTenant;
    }

    public GwCallDataStats setInvokeTenantId(String invokeTenantId) {
        this.invokeTenantId = invokeTenantId;
        return this;
    }
    public String getInvokeTenantId() {
        return this.invokeTenantId;
    }

    public GwCallDataStats setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GwCallDataStats setInvokeCount(String invokeCount) {
        this.invokeCount = invokeCount;
        return this;
    }
    public String getInvokeCount() {
        return this.invokeCount;
    }

    public GwCallDataStats setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

    public GwCallDataStats setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
