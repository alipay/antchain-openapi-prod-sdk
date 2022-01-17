// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.apigateway.models;

import com.aliyun.tea.*;

public class ApiCrossZoneVO extends TeaModel {
    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // api_id
    @NameInMap("api_id")
    public String apiId;

    // gw_id
    @NameInMap("gw_id")
    public String gwId;

    // 注册中心类型
    @NameInMap("sys_type")
    public String sysType;

    // 网关类型
    @NameInMap("type")
    public String type;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // registry_id
    @NameInMap("registry_id")
    public String registryId;

    public static ApiCrossZoneVO build(java.util.Map<String, ?> map) throws Exception {
        ApiCrossZoneVO self = new ApiCrossZoneVO();
        return TeaModel.build(map, self);
    }

    public ApiCrossZoneVO setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ApiCrossZoneVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApiCrossZoneVO setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public ApiCrossZoneVO setGwId(String gwId) {
        this.gwId = gwId;
        return this;
    }
    public String getGwId() {
        return this.gwId;
    }

    public ApiCrossZoneVO setSysType(String sysType) {
        this.sysType = sysType;
        return this;
    }
    public String getSysType() {
        return this.sysType;
    }

    public ApiCrossZoneVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApiCrossZoneVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ApiCrossZoneVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ApiCrossZoneVO setRegistryId(String registryId) {
        this.registryId = registryId;
        return this;
    }
    public String getRegistryId() {
        return this.registryId;
    }

}
