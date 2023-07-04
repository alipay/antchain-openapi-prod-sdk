// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class AppEnv extends TeaModel {
    // 应用部署时用于渲染的值，渲染为value
    @NameInMap("render_value")
    @Validation(required = true)
    public String renderValue;

    // 参数的值，部署的时候会被render_value的渲染结果覆盖
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 参数的key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    public static AppEnv build(java.util.Map<String, ?> map) throws Exception {
        AppEnv self = new AppEnv();
        return TeaModel.build(map, self);
    }

    public AppEnv setRenderValue(String renderValue) {
        this.renderValue = renderValue;
        return this;
    }
    public String getRenderValue() {
        return this.renderValue;
    }

    public AppEnv setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AppEnv setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
