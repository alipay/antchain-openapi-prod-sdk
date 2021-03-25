// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class DiscreteValue extends TeaModel {
    // 序号
    @NameInMap("sort_id")
    @Validation(required = true)
    public Long sortId;

    // 文本信息
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 文本值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static DiscreteValue build(java.util.Map<String, ?> map) throws Exception {
        DiscreteValue self = new DiscreteValue();
        return TeaModel.build(map, self);
    }

    public DiscreteValue setSortId(Long sortId) {
        this.sortId = sortId;
        return this;
    }
    public Long getSortId() {
        return this.sortId;
    }

    public DiscreteValue setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public DiscreteValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
