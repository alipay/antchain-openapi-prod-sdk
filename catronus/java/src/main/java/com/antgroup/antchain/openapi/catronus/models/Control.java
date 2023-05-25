// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Control extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // rule
    @NameInMap("rules")
    public java.util.List<Rule> rules;

    // 名称
    @NameInMap("name")
    public String name;

    public static Control build(java.util.Map<String, ?> map) throws Exception {
        Control self = new Control();
        return TeaModel.build(map, self);
    }

    public Control setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Control setRules(java.util.List<Rule> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.List<Rule> getRules() {
        return this.rules;
    }

    public Control setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
