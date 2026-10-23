// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class LabelModel extends TeaModel {
    // 一级标签
    /**
     * <strong>example:</strong>
     * <p>正常</p>
     */
    @NameInMap("label")
    public String label;

    // 子标签
    @NameInMap("sub_labels")
    public java.util.List<SubLabelModel> subLabels;

    public static LabelModel build(java.util.Map<String, ?> map) throws Exception {
        LabelModel self = new LabelModel();
        return TeaModel.build(map, self);
    }

    public LabelModel setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public LabelModel setSubLabels(java.util.List<SubLabelModel> subLabels) {
        this.subLabels = subLabels;
        return this;
    }
    public java.util.List<SubLabelModel> getSubLabels() {
        return this.subLabels;
    }

}
