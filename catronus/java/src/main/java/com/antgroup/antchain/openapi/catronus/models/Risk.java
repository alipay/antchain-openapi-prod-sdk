// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class Risk extends TeaModel {
    // 风险ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 风险名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 类型
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 等级
    @NameInMap("priority")
    @Validation(required = true)
    public String priority;

    // 风险唯一标识
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    public static Risk build(java.util.Map<String, ?> map) throws Exception {
        Risk self = new Risk();
        return TeaModel.build(map, self);
    }

    public Risk setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Risk setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Risk setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Risk setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public Risk setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

}
