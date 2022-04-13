// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedConfigMapOverrideList extends TeaModel {
    // fed configmap override list
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<FedConfigmapOverride> list;

    public static FedConfigMapOverrideList build(java.util.Map<String, ?> map) throws Exception {
        FedConfigMapOverrideList self = new FedConfigMapOverrideList();
        return TeaModel.build(map, self);
    }

    public FedConfigMapOverrideList setList(java.util.List<FedConfigmapOverride> list) {
        this.list = list;
        return this;
    }
    public java.util.List<FedConfigmapOverride> getList() {
        return this.list;
    }

}
