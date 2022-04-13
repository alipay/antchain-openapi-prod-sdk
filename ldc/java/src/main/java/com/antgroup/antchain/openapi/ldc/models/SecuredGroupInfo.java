// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SecuredGroupInfo extends TeaModel {
    // secured group name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static SecuredGroupInfo build(java.util.Map<String, ?> map) throws Exception {
        SecuredGroupInfo self = new SecuredGroupInfo();
        return TeaModel.build(map, self);
    }

    public SecuredGroupInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
