// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class DiscreteValue extends TeaModel {
    // 组件展示的内容
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 组件的具体值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 组件值的单位
    @NameInMap("unit")
    public String unit;

    // 组件选中值的说明/提示
    @NameInMap("tips")
    public String tips;

    // 多个组件展示的顺序
    @NameInMap("sort_id")
    @Validation(required = true)
    public Long sortId;

    public static DiscreteValue build(java.util.Map<String, ?> map) throws Exception {
        DiscreteValue self = new DiscreteValue();
        return TeaModel.build(map, self);
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

    public DiscreteValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DiscreteValue setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

    public DiscreteValue setSortId(Long sortId) {
        this.sortId = sortId;
        return this;
    }
    public Long getSortId() {
        return this.sortId;
    }

}
