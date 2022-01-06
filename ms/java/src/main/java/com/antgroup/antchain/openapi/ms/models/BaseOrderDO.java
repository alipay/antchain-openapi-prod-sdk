// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class BaseOrderDO extends TeaModel {
    // 排序的字段名称
    @NameInMap("key")
    public String key;

    // 排序的关键字
    @NameInMap("dir")
    public String dir;

    public static BaseOrderDO build(java.util.Map<String, ?> map) throws Exception {
        BaseOrderDO self = new BaseOrderDO();
        return TeaModel.build(map, self);
    }

    public BaseOrderDO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public BaseOrderDO setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

}
