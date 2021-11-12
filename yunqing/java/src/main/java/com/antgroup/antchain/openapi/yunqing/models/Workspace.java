// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // 包含的单元（逻辑机房）
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<Cell> cells;

    // 显示的名字
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // workspace的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属地域
    @NameInMap("region")
    @Validation(required = true)
    public Region region;

    // 工作空间的id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 机房列表
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<Zone> zones;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setCells(java.util.List<Cell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

    public Workspace setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Workspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Workspace setRegion(Region region) {
        this.region = region;
        return this;
    }
    public Region getRegion() {
        return this.region;
    }

    public Workspace setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Workspace setZones(java.util.List<Zone> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<Zone> getZones() {
        return this.zones;
    }

}
