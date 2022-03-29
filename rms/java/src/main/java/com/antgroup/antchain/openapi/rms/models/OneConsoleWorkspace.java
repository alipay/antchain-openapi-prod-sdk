// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class OneConsoleWorkspace extends TeaModel {
    // ws id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static OneConsoleWorkspace build(java.util.Map<String, ?> map) throws Exception {
        OneConsoleWorkspace self = new OneConsoleWorkspace();
        return TeaModel.build(map, self);
    }

    public OneConsoleWorkspace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OneConsoleWorkspace setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public OneConsoleWorkspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
