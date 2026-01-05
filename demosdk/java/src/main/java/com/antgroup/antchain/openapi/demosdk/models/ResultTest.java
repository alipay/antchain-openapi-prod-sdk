// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ResultTest extends TeaModel {
    // 姓名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    public String name;

    public static ResultTest build(java.util.Map<String, ?> map) throws Exception {
        ResultTest self = new ResultTest();
        return TeaModel.build(map, self);
    }

    public ResultTest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
