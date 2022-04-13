// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedImagePullSecretOverrideList extends TeaModel {
    // fed image pull secret overrides
    @NameInMap("list")
    @Validation(required = true)
    public java.util.List<FedImagePullSecretOverride> list;

    public static FedImagePullSecretOverrideList build(java.util.Map<String, ?> map) throws Exception {
        FedImagePullSecretOverrideList self = new FedImagePullSecretOverrideList();
        return TeaModel.build(map, self);
    }

    public FedImagePullSecretOverrideList setList(java.util.List<FedImagePullSecretOverride> list) {
        this.list = list;
        return this;
    }
    public java.util.List<FedImagePullSecretOverride> getList() {
        return this.list;
    }

}
