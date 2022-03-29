// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasEntityTopoNode extends TeaModel {
    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // field
    @NameInMap("field")
    @Validation(required = true)
    public String field;

    public static TraasEntityTopoNode build(java.util.Map<String, ?> map) throws Exception {
        TraasEntityTopoNode self = new TraasEntityTopoNode();
        return TeaModel.build(map, self);
    }

    public TraasEntityTopoNode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasEntityTopoNode setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

}
