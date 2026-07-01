// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.txmzspu.models;

import com.aliyun.tea.*;

public class DictionaryInfoBO extends TeaModel {
    // 字典key
    /**
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("label")
    @Validation(required = true)
    public String label;

    // 字典value
    /**
     * <strong>example:</strong>
     * <p>a</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static DictionaryInfoBO build(java.util.Map<String, ?> map) throws Exception {
        DictionaryInfoBO self = new DictionaryInfoBO();
        return TeaModel.build(map, self);
    }

    public DictionaryInfoBO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public DictionaryInfoBO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
