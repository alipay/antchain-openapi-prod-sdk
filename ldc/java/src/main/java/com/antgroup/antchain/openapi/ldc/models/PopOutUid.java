// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PopOutUid extends TeaModel {
    // 弹出的 UID 值
    @NameInMap("value")
    @Validation(required = true)
    public Long value;

    // 弹出的目标部署单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    public static PopOutUid build(java.util.Map<String, ?> map) throws Exception {
        PopOutUid self = new PopOutUid();
        return TeaModel.build(map, self);
    }

    public PopOutUid setValue(Long value) {
        this.value = value;
        return this;
    }
    public Long getValue() {
        return this.value;
    }

    public PopOutUid setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

}
