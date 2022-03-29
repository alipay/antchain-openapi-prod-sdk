// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StringValue extends TeaModel {
    // value
    @NameInMap("value")
    public String value;

    public static StringValue build(java.util.Map<String, ?> map) throws Exception {
        StringValue self = new StringValue();
        return TeaModel.build(map, self);
    }

    public StringValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
