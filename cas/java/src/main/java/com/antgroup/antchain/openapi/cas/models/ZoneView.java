// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ZoneView extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // displayName
    @NameInMap("display_name")
    public String displayName;

    public static ZoneView build(java.util.Map<String, ?> map) throws Exception {
        ZoneView self = new ZoneView();
        return TeaModel.build(map, self);
    }

    public ZoneView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ZoneView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ZoneView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
