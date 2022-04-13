// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellPods extends TeaModel {
    // 部署单元名称
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // pod标识列表
    @NameInMap("pod_names")
    @Validation(required = true)
    public java.util.List<String> podNames;

    public static CellPods build(java.util.Map<String, ?> map) throws Exception {
        CellPods self = new CellPods();
        return TeaModel.build(map, self);
    }

    public CellPods setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CellPods setPodNames(java.util.List<String> podNames) {
        this.podNames = podNames;
        return this;
    }
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

}
