// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class NetworkInfo extends TeaModel {
    // networt description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static NetworkInfo build(java.util.Map<String, ?> map) throws Exception {
        NetworkInfo self = new NetworkInfo();
        return TeaModel.build(map, self);
    }

    public NetworkInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
