// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ContinuousOtaConfigResponse extends TeaModel {
    // 当前配置所属租户 ID
    /**
     * <strong>example:</strong>
     * <p>XQBKTRQV</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 租户名称；跨租户管理视图中可能为空
    /**
     * <strong>example:</strong>
     * <p>租户名称</p>
     */
    @NameInMap("tenant_name")
    public String tenantName;

    // 租户级连续推送总开关
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    // 同设备同固件的去重窗口，单位分钟
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dedup_expire_minutes")
    public Long dedupExpireMinutes;

    // 租户级设置锁版本，以字符串返回，更新设置时作为 expectedLockVersion 回传
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lock_version")
    public String lockVersion;

    // 产品策略列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("product_configs")
    public java.util.List<ContinuousOtaOpenApiPolicyResponse> productConfigs;

    public static ContinuousOtaConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuousOtaConfigResponse self = new ContinuousOtaConfigResponse();
        return TeaModel.build(map, self);
    }

    public ContinuousOtaConfigResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ContinuousOtaConfigResponse setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ContinuousOtaConfigResponse setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public ContinuousOtaConfigResponse setDedupExpireMinutes(Long dedupExpireMinutes) {
        this.dedupExpireMinutes = dedupExpireMinutes;
        return this;
    }
    public Long getDedupExpireMinutes() {
        return this.dedupExpireMinutes;
    }

    public ContinuousOtaConfigResponse setLockVersion(String lockVersion) {
        this.lockVersion = lockVersion;
        return this;
    }
    public String getLockVersion() {
        return this.lockVersion;
    }

    public ContinuousOtaConfigResponse setProductConfigs(java.util.List<ContinuousOtaOpenApiPolicyResponse> productConfigs) {
        this.productConfigs = productConfigs;
        return this;
    }
    public java.util.List<ContinuousOtaOpenApiPolicyResponse> getProductConfigs() {
        return this.productConfigs;
    }

}
