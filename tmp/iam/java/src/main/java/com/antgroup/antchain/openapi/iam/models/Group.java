// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    // 成员组ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 成员组名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 成员组描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    public static Group build(java.util.Map<String, ?> map) throws Exception {
        Group self = new Group();
        return TeaModel.build(map, self);
    }

    public Group setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Group setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
