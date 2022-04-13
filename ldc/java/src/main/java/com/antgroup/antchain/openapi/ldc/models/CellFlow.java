// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CellFlow extends TeaModel {
    // 部署单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 蓝绿着色。
    // BLUE：蓝
    // GREEN：绿
    // 非着色单元为 null
    @NameInMap("color")
    public String color;

    // 部署单元所占单元组的流量比。
    @NameInMap("percent")
    @Validation(required = true, maximum = 100)
    public Long percent;

    public static CellFlow build(java.util.Map<String, ?> map) throws Exception {
        CellFlow self = new CellFlow();
        return TeaModel.build(map, self);
    }

    public CellFlow setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellFlow setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CellFlow setPercent(Long percent) {
        this.percent = percent;
        return this;
    }
    public Long getPercent() {
        return this.percent;
    }

}
