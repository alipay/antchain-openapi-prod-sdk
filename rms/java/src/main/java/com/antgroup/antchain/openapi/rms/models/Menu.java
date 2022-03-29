// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Menu extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static Menu build(java.util.Map<String, ?> map) throws Exception {
        Menu self = new Menu();
        return TeaModel.build(map, self);
    }

    public Menu setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
