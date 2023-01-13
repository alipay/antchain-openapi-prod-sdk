// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightStatisticCustomTableRow extends TeaModel {
    // 表格的一行
    @NameInMap("row")
    @Validation(required = true)
    public java.util.List<MapEntry> row;

    public static ChainInsightStatisticCustomTableRow build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightStatisticCustomTableRow self = new ChainInsightStatisticCustomTableRow();
        return TeaModel.build(map, self);
    }

    public ChainInsightStatisticCustomTableRow setRow(java.util.List<MapEntry> row) {
        this.row = row;
        return this;
    }
    public java.util.List<MapEntry> getRow() {
        return this.row;
    }

}
