// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CellInfo extends TeaModel {
    // 单元
    @NameInMap("cell")
    public String cell;

    // 是否特别推送
    @NameInMap("special_push")
    public Boolean specialPush;

    // 推送值
    @NameInMap("value")
    public String value;

    public static CellInfo build(java.util.Map<String, ?> map) throws Exception {
        CellInfo self = new CellInfo();
        return TeaModel.build(map, self);
    }

    public CellInfo setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CellInfo setSpecialPush(Boolean specialPush) {
        this.specialPush = specialPush;
        return this;
    }
    public Boolean getSpecialPush() {
        return this.specialPush;
    }

    public CellInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
