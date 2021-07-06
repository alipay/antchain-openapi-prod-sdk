// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class Institution extends TeaModel {
    // 人行联行号/行政地区编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 银行全称/行政地区名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static Institution build(java.util.Map<String, ?> map) throws Exception {
        Institution self = new Institution();
        return TeaModel.build(map, self);
    }

    public Institution setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Institution setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
