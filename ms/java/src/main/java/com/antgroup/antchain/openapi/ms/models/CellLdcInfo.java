// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class CellLdcInfo extends TeaModel {
    // 单元名称
    @NameInMap("name")
    public String name;

    // 单元类型
    @NameInMap("type")
    public String type;

    public static CellLdcInfo build(java.util.Map<String, ?> map) throws Exception {
        CellLdcInfo self = new CellLdcInfo();
        return TeaModel.build(map, self);
    }

    public CellLdcInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellLdcInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
