// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class FieldModel extends TeaModel {
    // 领域一级标签
    /**
     * <strong>example:</strong>
     * <p>金融</p>
     */
    @NameInMap("field_category")
    public String fieldCategory;

    // 领域二级标签
    /**
     * <strong>example:</strong>
     * <p>金融</p>
     */
    @NameInMap("field_label")
    public String fieldLabel;

    // 领域一级标签的等级分数
    @NameInMap("field_score")
    public Long fieldScore;

    public static FieldModel build(java.util.Map<String, ?> map) throws Exception {
        FieldModel self = new FieldModel();
        return TeaModel.build(map, self);
    }

    public FieldModel setFieldCategory(String fieldCategory) {
        this.fieldCategory = fieldCategory;
        return this;
    }
    public String getFieldCategory() {
        return this.fieldCategory;
    }

    public FieldModel setFieldLabel(String fieldLabel) {
        this.fieldLabel = fieldLabel;
        return this;
    }
    public String getFieldLabel() {
        return this.fieldLabel;
    }

    public FieldModel setFieldScore(Long fieldScore) {
        this.fieldScore = fieldScore;
        return this;
    }
    public Long getFieldScore() {
        return this.fieldScore;
    }

}
