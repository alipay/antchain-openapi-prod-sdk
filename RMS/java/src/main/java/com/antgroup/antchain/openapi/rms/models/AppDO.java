// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class AppDO extends TeaModel {
    // 应用名称
    @NameInMap("name")
    public String name;

    public static AppDO build(java.util.Map<String, ?> map) throws Exception {
        AppDO self = new AppDO();
        return TeaModel.build(map, self);
    }

    public AppDO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
