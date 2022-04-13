// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SidecarTemplate extends TeaModel {
    // sidecar模版id
    @NameInMap("id")
    public String id;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // 	
    // 模板生效范围
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar模版版本
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // sidercar模版
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // 这个字段是lhc专用，表示此模板的来源，META为sidecar元数据来源，XFLUSH为系统模板
    // 本结构体同时还暂时兼容了调用sidecar元数据openapi的使用，后期会只用于LHC用途，届时会去掉sidecar元数据接口的字段。
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // workspace_group_id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static SidecarTemplate build(java.util.Map<String, ?> map) throws Exception {
        SidecarTemplate self = new SidecarTemplate();
        return TeaModel.build(map, self);
    }

    public SidecarTemplate setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SidecarTemplate setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SidecarTemplate setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SidecarTemplate setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SidecarTemplate setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public SidecarTemplate setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public SidecarTemplate setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SidecarTemplate setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public SidecarTemplate setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
