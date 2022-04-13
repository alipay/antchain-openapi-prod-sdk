// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ReleaseBatchObj extends TeaModel {
    // 第一个批次
    @NameInMap("batch_num")
    @Validation(required = true)
    public Long batchNum;

    // 单元内服务数组
    @NameInMap("cell_servers")
    @Validation(required = true)
    public java.util.List<CellServer> cellServers;

    public static ReleaseBatchObj build(java.util.Map<String, ?> map) throws Exception {
        ReleaseBatchObj self = new ReleaseBatchObj();
        return TeaModel.build(map, self);
    }

    public ReleaseBatchObj setBatchNum(Long batchNum) {
        this.batchNum = batchNum;
        return this;
    }
    public Long getBatchNum() {
        return this.batchNum;
    }

    public ReleaseBatchObj setCellServers(java.util.List<CellServer> cellServers) {
        this.cellServers = cellServers;
        return this;
    }
    public java.util.List<CellServer> getCellServers() {
        return this.cellServers;
    }

}
