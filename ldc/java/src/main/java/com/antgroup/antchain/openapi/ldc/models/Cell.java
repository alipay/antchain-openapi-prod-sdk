// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Cell extends TeaModel {
    // 所属逻辑单元名称[单元化模式特有]。
    @NameInMap("cell_group")
    public String cellGroup;

    // 蓝绿着色信息[单元化模式特有]。
    @NameInMap("color")
    public String color;

    // 创建时间。
    @NameInMap("created_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 部署单元标识，创建之后不允许修改。
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // 是否灰度[单元化模式特有]。
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称，主要用作页面展示。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 压测权重
    @NameInMap("press_weight")
    public Long pressWeight;

    // 部署单元类型[单元化模式特有]。
    @NameInMap("type")
    public String type;

    // 默认权重[单元化模式特有]。
    @NameInMap("weight")
    public Long weight;

    // 所属工作空间名称。
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // 所属机房信息。
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // cell名称，与name一样，为了兼容已有代码
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 所属cluster
    @NameInMap("cluster")
    public String cluster;

    public static Cell build(java.util.Map<String, ?> map) throws Exception {
        Cell self = new Cell();
        return TeaModel.build(map, self);
    }

    public Cell setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public Cell setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public Cell setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Cell setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public Cell setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public Cell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cell setPressWeight(Long pressWeight) {
        this.pressWeight = pressWeight;
        return this;
    }
    public Long getPressWeight() {
        return this.pressWeight;
    }

    public Cell setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Cell setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public Cell setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public Cell setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public Cell setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Cell setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

}
