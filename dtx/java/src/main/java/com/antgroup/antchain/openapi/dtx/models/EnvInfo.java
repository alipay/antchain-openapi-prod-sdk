// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class EnvInfo extends TeaModel {
    // 环境
    @NameInMap("env")
    @Validation(required = true)
    public String env;

    // 是否公有云环境
    @NameInMap("is_public_cloud")
    @Validation(required = true)
    public Boolean isPublicCloud;

    // 租户
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // server / client
    @NameInMap("recovery_mode")
    @Validation(required = true)
    public String recoveryMode;

    public static EnvInfo build(java.util.Map<String, ?> map) throws Exception {
        EnvInfo self = new EnvInfo();
        return TeaModel.build(map, self);
    }

    public EnvInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public EnvInfo setIsPublicCloud(Boolean isPublicCloud) {
        this.isPublicCloud = isPublicCloud;
        return this;
    }
    public Boolean getIsPublicCloud() {
        return this.isPublicCloud;
    }

    public EnvInfo setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public EnvInfo setRecoveryMode(String recoveryMode) {
        this.recoveryMode = recoveryMode;
        return this;
    }
    public String getRecoveryMode() {
        return this.recoveryMode;
    }

}
