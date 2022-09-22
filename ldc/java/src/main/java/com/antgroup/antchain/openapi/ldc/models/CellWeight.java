// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellWeight extends TeaModel {
    // 统一接入或负载均衡名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 部署单元权重详情
    @NameInMap("cell_weight_infos")
    @Validation(required = true)
    public java.util.List<CellWeightInfo> cellWeightInfos;

    public static CellWeight build(java.util.Map<String, ?> map) throws Exception {
        CellWeight self = new CellWeight();
        return TeaModel.build(map, self);
    }

    public CellWeight setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellWeight setCellWeightInfos(java.util.List<CellWeightInfo> cellWeightInfos) {
        this.cellWeightInfos = cellWeightInfos;
        return this;
    }
    public java.util.List<CellWeightInfo> getCellWeightInfos() {
        return this.cellWeightInfos;
    }

}
