// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppLevel extends TeaModel {
    // 应用等级ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 应用等级名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用等级负责人登录名
    @NameInMap("owner_login_name")
    public String ownerLoginName;

    public static AppLevel build(java.util.Map<String, ?> map) throws Exception {
        AppLevel self = new AppLevel();
        return TeaModel.build(map, self);
    }

    public AppLevel setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AppLevel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppLevel setOwnerLoginName(String ownerLoginName) {
        this.ownerLoginName = ownerLoginName;
        return this;
    }
    public String getOwnerLoginName() {
        return this.ownerLoginName;
    }

}
