// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CellGroup extends TeaModel {
    // 包含部署单元列表
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<DeployCell> cells;

    // 机房名称
    @NameInMap("datacenter")
    public String datacenter;

    // 默认全局域
    @NameInMap("default_gzone")
    public String defaultGzone;

    // 逻辑单元灾备信息
    @NameInMap("disaster_info")
    @Validation(required = true)
    public java.util.List<DisasterInfo> disasterInfo;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String modifiedTime;

    // 逻辑单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 所属地域：CZone Group 必填
    @NameInMap("region")
    public String region;

    // 逻辑单元类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CellGroup build(java.util.Map<String, ?> map) throws Exception {
        CellGroup self = new CellGroup();
        return TeaModel.build(map, self);
    }

    public CellGroup setCells(java.util.List<DeployCell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<DeployCell> getCells() {
        return this.cells;
    }

    public CellGroup setDatacenter(String datacenter) {
        this.datacenter = datacenter;
        return this;
    }
    public String getDatacenter() {
        return this.datacenter;
    }

    public CellGroup setDefaultGzone(String defaultGzone) {
        this.defaultGzone = defaultGzone;
        return this;
    }
    public String getDefaultGzone() {
        return this.defaultGzone;
    }

    public CellGroup setDisasterInfo(java.util.List<DisasterInfo> disasterInfo) {
        this.disasterInfo = disasterInfo;
        return this;
    }
    public java.util.List<DisasterInfo> getDisasterInfo() {
        return this.disasterInfo;
    }

    public CellGroup setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public CellGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellGroup setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CellGroup setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CellGroup setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
