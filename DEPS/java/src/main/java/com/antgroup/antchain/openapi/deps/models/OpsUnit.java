// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsUnit extends TeaModel {
    // 单元所属部署区
    @NameInMap("cell")
    public String cell;

    // 包含在此单元中进行运维操作的计算容器列表
    @NameInMap("computers")
    public java.util.List<OpsComputer> computers;

    // 单元所属地域
    @NameInMap("region")
    public String region;

    // 单元所属可用区
    @NameInMap("zone")
    public String zone;

    public static OpsUnit build(java.util.Map<String, ?> map) throws Exception {
        OpsUnit self = new OpsUnit();
        return TeaModel.build(map, self);
    }

    public OpsUnit setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public OpsUnit setComputers(java.util.List<OpsComputer> computers) {
        this.computers = computers;
        return this;
    }
    public java.util.List<OpsComputer> getComputers() {
        return this.computers;
    }

    public OpsUnit setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public OpsUnit setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
