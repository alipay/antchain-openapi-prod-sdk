// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedConfigmapOverride extends TeaModel {
    // 要覆盖的配置项数据
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<ConfigMapData> data;

    // 部署单元名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 覆盖的名称，必须为：配置项名称-cell-部署单元名称
    @NameInMap("name_override")
    @Validation(required = true)
    public String nameOverride;

    public static FedConfigmapOverride build(java.util.Map<String, ?> map) throws Exception {
        FedConfigmapOverride self = new FedConfigmapOverride();
        return TeaModel.build(map, self);
    }

    public FedConfigmapOverride setData(java.util.List<ConfigMapData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ConfigMapData> getData() {
        return this.data;
    }

    public FedConfigmapOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedConfigmapOverride setNameOverride(String nameOverride) {
        this.nameOverride = nameOverride;
        return this;
    }
    public String getNameOverride() {
        return this.nameOverride;
    }

}
