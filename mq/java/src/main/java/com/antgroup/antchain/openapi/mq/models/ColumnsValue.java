// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ColumnsValue extends TeaModel {
    // 一行的值
    @NameInMap("value")
    @Validation(required = true)
    public java.util.List<ColumnValue> value;

    public static ColumnsValue build(java.util.Map<String, ?> map) throws Exception {
        ColumnsValue self = new ColumnsValue();
        return TeaModel.build(map, self);
    }

    public ColumnsValue setValue(java.util.List<ColumnValue> value) {
        this.value = value;
        return this;
    }
    public java.util.List<ColumnValue> getValue() {
        return this.value;
    }

}
