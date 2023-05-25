// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class ScanResult extends TeaModel {
    // 安全组件名
    @NameInMap("component")
    @Validation(required = true)
    public String component;

    // 结果
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    public static ScanResult build(java.util.Map<String, ?> map) throws Exception {
        ScanResult self = new ScanResult();
        return TeaModel.build(map, self);
    }

    public ScanResult setComponent(String component) {
        this.component = component;
        return this;
    }
    public String getComponent() {
        return this.component;
    }

    public ScanResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
