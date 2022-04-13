// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // workspace id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace name
    @NameInMap("name")
    public String name;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Workspace setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
