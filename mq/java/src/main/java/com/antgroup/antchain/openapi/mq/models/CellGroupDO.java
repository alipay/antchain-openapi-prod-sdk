// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CellGroupDO extends TeaModel {
    // cell_type
    @NameInMap("cell_type")
    @Validation(required = true)
    public String cellType;

    // cells
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<String> data;

    public static CellGroupDO build(java.util.Map<String, ?> map) throws Exception {
        CellGroupDO self = new CellGroupDO();
        return TeaModel.build(map, self);
    }

    public CellGroupDO setCellType(String cellType) {
        this.cellType = cellType;
        return this;
    }
    public String getCellType() {
        return this.cellType;
    }

    public CellGroupDO setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
