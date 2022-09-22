// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class FedSecretOverride extends TeaModel {
    // 要覆盖的保密字典数据
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<SecretData> data;

    // 部署单元的名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 覆盖的名称，必须为：保密字典名称-cell-部署单元名称
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
