// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antdigital_demosdk.models;

import com.aliyun.tea.*;

public class ResultTest extends TeaModel {
    // 姓名
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
