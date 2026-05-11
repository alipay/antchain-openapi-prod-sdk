// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yfptspu.models;

import com.aliyun.tea.*;

public class DemoTestHf extends TeaModel {
    // test
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("info")
    @Validation(required = true)
    public ResultTest info;

    public static DemoTestHf build(java.util.Map<String, ?> map) throws Exception {
        DemoTestHf self = new DemoTestHf();
        return TeaModel.build(map, self);
    }

    public DemoTestHf setInfo(ResultTest info) {
        this.info = info;
        return this;
    }
    public ResultTest getInfo() {
        return this.info;
    }

}
