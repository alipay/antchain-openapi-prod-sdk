// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeployCell extends TeaModel {
    // 所属逻辑单元名称[单元化模式特有]
    @NameInMap("cell_group")
    public String cellGroup;

    // 所属集群	
    // 
    @NameInMap("cluster")
    public String cluster;

    // 蓝绿着色信息[单元化模式特有]
    @NameInMap("color")
    public String color;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String createdTime;

    // cell名称，与name一样，为了兼容已有代码
    @NameInMap("display_name")
    public String displayName;

    // 部署单元标识，创建之后不允许修改
    @NameInMap("identity")
    public String identity;

    // 是否灰度[单元化模式特有]
    @NameInMap("is_gray")
    public Boolean isGray;

    // 部署单元名称，主要用作页面展示
    @NameInMap("name")
    public String name;

    // 压测权重
    @NameInMap("press_weight")
    public Long pressWeight;

    // 部署单元类型[单元化模式特有]
    @NameInMap("type")
    public String type;

    // 默认权重[单元化模式特有]
    @NameInMap("weight")
    public Long weight;

    // 所属工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 所属机房名称
    @NameInMap("zone")
    public String zone;

    // cell id
    @NameInMap("id")
    public String id;

    public static DeployCell build(java.util.Map<String, ?> map) throws Exception {
        DeployCell self = new DeployCell();
        return TeaModel.build(map, self);
    }

    public DeployCell setCellGroup(String cellGroup) {
        this.cellGroup = cellGroup;
        return this;
    }
    public String getCellGroup() {
        return this.cellGroup;
    }

    public DeployCell setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public DeployCell setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public DeployCell setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DeployCell setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DeployCell setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public DeployCell setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public DeployCell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeployCell setPressWeight(Long pressWeight) {
        this.pressWeight = pressWeight;
        return this;
    }
    public Long getPressWeight() {
        return this.pressWeight;
    }

    public DeployCell setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeployCell setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public DeployCell setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public DeployCell setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public DeployCell setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
