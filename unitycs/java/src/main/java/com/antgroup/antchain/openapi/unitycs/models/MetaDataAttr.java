// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unitycs.models;

import com.aliyun.tea.*;

public class MetaDataAttr extends TeaModel {
    // 元数据属性编码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 元数据属性值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static MetaDataAttr build(java.util.Map<String, ?> map) throws Exception {
        MetaDataAttr self = new MetaDataAttr();
        return TeaModel.build(map, self);
    }

    public MetaDataAttr setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MetaDataAttr setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
