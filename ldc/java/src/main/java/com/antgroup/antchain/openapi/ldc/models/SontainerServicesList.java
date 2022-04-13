// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SontainerServicesList extends TeaModel {
    // ContainerServiceDeployment
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ContainerServiceDeployment> list;

    public static SontainerServicesList build(java.util.Map<String, ?> map) throws Exception {
        SontainerServicesList self = new SontainerServicesList();
        return TeaModel.build(map, self);
    }

    public SontainerServicesList setList(java.util.List<ContainerServiceDeployment> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContainerServiceDeployment> getList() {
        return this.list;
    }

}
