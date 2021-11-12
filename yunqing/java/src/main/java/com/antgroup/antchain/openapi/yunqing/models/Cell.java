// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class Cell extends TeaModel {
    // LDC下cellGroup的ID
    @NameInMap("cell_group_id")
    public String cellGroupId;

    // 单元的id
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // LDC的蓝绿着色
    @NameInMap("color")
    public String color;

    // LDC的默认权重
    @NameInMap("default_weight")
    public Long defaultWeight;

    // LDC下是否灰度
    @NameInMap("gray")
    public Boolean gray;

    // 单元的名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所在地域的id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // LDC的GRCZone类型
    @NameInMap("type")
    public String type;

    // 工作空间id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // 所属机房的id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 显示的名字
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    public static Cell build(java.util.Map<String, ?> map) throws Exception {
        Cell self = new Cell();
        return TeaModel.build(map, self);
    }

    public Cell setCellGroupId(String cellGroupId) {
        this.cellGroupId = cellGroupId;
        return this;
    }
    public String getCellGroupId() {
        return this.cellGroupId;
    }

    public Cell setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public Cell setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public Cell setDefaultWeight(Long defaultWeight) {
        this.defaultWeight = defaultWeight;
        return this;
    }
    public Long getDefaultWeight() {
        return this.defaultWeight;
    }

    public Cell setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public Cell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cell setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Cell setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Cell setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Cell setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public Cell setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
