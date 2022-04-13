// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedSecretOverrideList extends TeaModel {
    // fed configmap override list
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<FedSecretOverride> list;

    public static FedSecretOverrideList build(java.util.Map<String, ?> map) throws Exception {
        FedSecretOverrideList self = new FedSecretOverrideList();
        return TeaModel.build(map, self);
    }

    public FedSecretOverrideList setList(java.util.List<FedSecretOverride> list) {
        this.list = list;
        return this;
    }
    public java.util.List<FedSecretOverride> getList() {
        return this.list;
    }

}
