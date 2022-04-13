// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class PodDNSConfigOption extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // value
    @NameInMap("value")
    public String value;

    public static PodDNSConfigOption build(java.util.Map<String, ?> map) throws Exception {
        PodDNSConfigOption self = new PodDNSConfigOption();
        return TeaModel.build(map, self);
    }

    public PodDNSConfigOption setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PodDNSConfigOption setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
