// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class WorkspaceView extends TeaModel {
    // 部署单元列表
    @NameInMap("cells")
    public java.util.List<CellView> cells;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // table id
    @NameInMap("id")
    public String id;

    // 标识
    @NameInMap("identity")
    public String identity;

    // 网络类型
    @NameInMap("network_type")
    public String networkType;

    // workspace所在region名称
    @NameInMap("region")
    public String region;

    public static WorkspaceView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceView self = new WorkspaceView();
        return TeaModel.build(map, self);
    }

    public WorkspaceView setCells(java.util.List<CellView> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<CellView> getCells() {
        return this.cells;
    }

    public WorkspaceView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public WorkspaceView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public WorkspaceView setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public WorkspaceView setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
