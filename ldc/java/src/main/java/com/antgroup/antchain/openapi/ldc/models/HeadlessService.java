// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HeadlessService extends TeaModel {
    // headless service 的名称，不能以-0~-9结尾
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static HeadlessService build(java.util.Map<String, ?> map) throws Exception {
        HeadlessService self = new HeadlessService();
        return TeaModel.build(map, self);
    }

    public HeadlessService setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
