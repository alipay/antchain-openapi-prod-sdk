// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ContainerServiceOperationList extends TeaModel {
    // ContainerServiceOperationList
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<ContainerServiceOperation> list;

    public static ContainerServiceOperationList build(java.util.Map<String, ?> map) throws Exception {
        ContainerServiceOperationList self = new ContainerServiceOperationList();
        return TeaModel.build(map, self);
    }

    public ContainerServiceOperationList setList(java.util.List<ContainerServiceOperation> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ContainerServiceOperation> getList() {
        return this.list;
    }

}
