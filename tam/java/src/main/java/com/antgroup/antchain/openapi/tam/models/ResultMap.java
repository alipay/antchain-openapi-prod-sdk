// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tam.models;

import com.aliyun.tea.*;

public class ResultMap extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static ResultMap build(java.util.Map<String, ?> map) throws Exception {
        ResultMap self = new ResultMap();
        return TeaModel.build(map, self);
    }

    public ResultMap setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ResultMap setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
