// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class FixPath extends TeaModel {
    // 路径
    @NameInMap("path")
    public String path;

    // 值
    @NameInMap("value")
    public String value;

    public static FixPath build(java.util.Map<String, ?> map) throws Exception {
        FixPath self = new FixPath();
        return TeaModel.build(map, self);
    }

    public FixPath setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public FixPath setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
