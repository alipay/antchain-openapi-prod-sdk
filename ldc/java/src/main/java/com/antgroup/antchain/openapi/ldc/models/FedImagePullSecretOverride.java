// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedImagePullSecretOverride extends TeaModel {
    // override data
    @NameInMap("data")
    @Validation(required = true)
    public RegistryAccout data;

    // cell name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // cell name override
    @NameInMap("name_override")
    @Validation(required = true)
    public String nameOverride;

    public static FedImagePullSecretOverride build(java.util.Map<String, ?> map) throws Exception {
        FedImagePullSecretOverride self = new FedImagePullSecretOverride();
        return TeaModel.build(map, self);
    }

    public FedImagePullSecretOverride setData(RegistryAccout data) {
        this.data = data;
        return this;
    }
    public RegistryAccout getData() {
        return this.data;
    }

    public FedImagePullSecretOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedImagePullSecretOverride setNameOverride(String nameOverride) {
        this.nameOverride = nameOverride;
        return this;
    }
    public String getNameOverride() {
        return this.nameOverride;
    }

}
