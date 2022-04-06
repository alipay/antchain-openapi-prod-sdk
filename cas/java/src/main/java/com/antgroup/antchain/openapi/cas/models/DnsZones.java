// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DnsZones extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DnsZones build(java.util.Map<String, ?> map) throws Exception {
        DnsZones self = new DnsZones();
        return TeaModel.build(map, self);
    }

    public DnsZones setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DnsZones setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
