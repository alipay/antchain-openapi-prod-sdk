// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class LdcInfoVO extends TeaModel {
    // 是否开启
    @NameInMap("enable")
    public Boolean enable;

    // 参数位置
    @NameInMap("param_location")
    public String paramLocation;

    // 参数名
    @NameInMap("param_key")
    public String paramKey;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static LdcInfoVO build(java.util.Map<String, ?> map) throws Exception {
        LdcInfoVO self = new LdcInfoVO();
        return TeaModel.build(map, self);
    }

    public LdcInfoVO setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public LdcInfoVO setParamLocation(String paramLocation) {
        this.paramLocation = paramLocation;
        return this;
    }
    public String getParamLocation() {
        return this.paramLocation;
    }

    public LdcInfoVO setParamKey(String paramKey) {
        this.paramKey = paramKey;
        return this;
    }
    public String getParamKey() {
        return this.paramKey;
    }

    public LdcInfoVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public LdcInfoVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
