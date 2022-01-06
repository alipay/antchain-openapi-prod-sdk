// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Attribute extends TeaModel {
    // 属性名
    @NameInMap("attribute_name")
    public String attributeName;

    // 属性描述
    @NameInMap("name")
    public String name;

    public static Attribute build(java.util.Map<String, ?> map) throws Exception {
        Attribute self = new Attribute();
        return TeaModel.build(map, self);
    }

    public Attribute setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public Attribute setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
