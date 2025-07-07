// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DiscreteValue extends TeaModel {
    // 排序id
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("sort_id")
    public Long sortId;

    // 字段描述
    /**
     * <strong>example:</strong>
     * <p>联盟名称</p>
     */
    @NameInMap("text")
    @Validation(required = true)
    public String text;

    // 提示信息
    /**
     * <strong>example:</strong>
     * <p>提示信息</p>
     */
    @NameInMap("tips")
    public String tips;

    // 单位信息
    /**
     * <strong>example:</strong>
     * <p>单位信息</p>
     */
    @NameInMap("unit")
    public String unit;

    // 值内容
    /**
     * <strong>example:</strong>
     * <p>值内容</p>
     */
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

    public DiscreteValue setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

    public DiscreteValue setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DiscreteValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
