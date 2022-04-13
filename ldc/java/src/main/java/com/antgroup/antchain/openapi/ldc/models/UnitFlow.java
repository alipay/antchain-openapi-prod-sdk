// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UnitFlow extends TeaModel {
    // 部署单元组的名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元组的类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 该部署单元组下的部署单元流量规则
    @NameInMap("cell_flows")
    @Validation(required = true)
    public java.util.List<CellFlow> cellFlows;

    // 该部署单元组下的部署单元 uid 分配
    @NameInMap("uid_ranges")
    @Validation(required = true)
    public java.util.List<UidRange> uidRanges;

    // 是否弹性部署单元组
    @NameInMap("elastic")
    @Validation(required = true)
    public Boolean elastic;

    public static UnitFlow build(java.util.Map<String, ?> map) throws Exception {
        UnitFlow self = new UnitFlow();
        return TeaModel.build(map, self);
    }

    public UnitFlow setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UnitFlow setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UnitFlow setCellFlows(java.util.List<CellFlow> cellFlows) {
        this.cellFlows = cellFlows;
        return this;
    }
    public java.util.List<CellFlow> getCellFlows() {
        return this.cellFlows;
    }

    public UnitFlow setUidRanges(java.util.List<UidRange> uidRanges) {
        this.uidRanges = uidRanges;
        return this;
    }
    public java.util.List<UidRange> getUidRanges() {
        return this.uidRanges;
    }

    public UnitFlow setElastic(Boolean elastic) {
        this.elastic = elastic;
        return this;
    }
    public Boolean getElastic() {
        return this.elastic;
    }

}
