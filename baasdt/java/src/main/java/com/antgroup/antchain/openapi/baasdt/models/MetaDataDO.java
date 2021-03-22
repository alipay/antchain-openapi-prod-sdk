// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class MetaDataDO extends TeaModel {
    // key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // value
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MetaDataDO build(java.util.Map<String, ?> map) throws Exception {
        MetaDataDO self = new MetaDataDO();
        return TeaModel.build(map, self);
    }

    public MetaDataDO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetaDataDO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
