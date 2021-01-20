// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ComputerCell extends TeaModel {
    // 部署单元唯一标识
    @NameInMap("cell_id")
    public String cellId;

    // 计算资源唯一标识
    @NameInMap("computer_id")
    public String computerId;

    public static ComputerCell build(java.util.Map<String, ?> map) throws Exception {
        ComputerCell self = new ComputerCell();
        return TeaModel.build(map, self);
    }

    public ComputerCell setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public ComputerCell setComputerId(String computerId) {
        this.computerId = computerId;
        return this;
    }
    public String getComputerId() {
        return this.computerId;
    }

}
