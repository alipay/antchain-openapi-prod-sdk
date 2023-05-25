// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Rule extends TeaModel {
    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 状态
    @NameInMap("status")
    public String status;

    // path
    @NameInMap("paths")
    public java.util.List<Path> paths;

    public static Rule build(java.util.Map<String, ?> map) throws Exception {
        Rule self = new Rule();
        return TeaModel.build(map, self);
    }

    public Rule setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Rule setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Rule setPaths(java.util.List<Path> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<Path> getPaths() {
        return this.paths;
    }

}
