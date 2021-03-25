// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Action extends TeaModel {
    // 操作点描述
    @NameInMap("description")
    public String description;

    // 操作点ID
    @NameInMap("id")
    public String id;

    // 操作点名称
    @NameInMap("name")
    public String name;

    public static Action build(java.util.Map<String, ?> map) throws Exception {
        Action self = new Action();
        return TeaModel.build(map, self);
    }

    public Action setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Action setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Action setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
