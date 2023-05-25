// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class RepoProject extends TeaModel {
    // project id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static RepoProject build(java.util.Map<String, ?> map) throws Exception {
        RepoProject self = new RepoProject();
        return TeaModel.build(map, self);
    }

    public RepoProject setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RepoProject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
