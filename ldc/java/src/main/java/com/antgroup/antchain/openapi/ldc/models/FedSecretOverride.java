// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedSecretOverride extends TeaModel {
    // fed secret data override
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<SecretData> data;

    // cluster name
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // name cell override
    @NameInMap("name_override")
    @Validation(required = true)
    public String nameOverride;

    public static FedSecretOverride build(java.util.Map<String, ?> map) throws Exception {
        FedSecretOverride self = new FedSecretOverride();
        return TeaModel.build(map, self);
    }

    public FedSecretOverride setData(java.util.List<SecretData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SecretData> getData() {
        return this.data;
    }

    public FedSecretOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FedSecretOverride setNameOverride(String nameOverride) {
        this.nameOverride = nameOverride;
        return this;
    }
    public String getNameOverride() {
        return this.nameOverride;
    }

}
