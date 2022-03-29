// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class StringDataDo extends TeaModel {
    // data
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static StringDataDo build(java.util.Map<String, ?> map) throws Exception {
        StringDataDo self = new StringDataDo();
        return TeaModel.build(map, self);
    }

    public StringDataDo setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
