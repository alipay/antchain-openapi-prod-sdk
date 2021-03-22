// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class APIWhiteListInfo extends TeaModel {
    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 权限级别，暂时不用
    @NameInMap("level")
    @Validation(required = true)
    public Long level;

    // 更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    // 扩展字段
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    public static APIWhiteListInfo build(java.util.Map<String, ?> map) throws Exception {
        APIWhiteListInfo self = new APIWhiteListInfo();
        return TeaModel.build(map, self);
    }

    public APIWhiteListInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public APIWhiteListInfo setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public APIWhiteListInfo setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public APIWhiteListInfo setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public APIWhiteListInfo setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
