// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class SubLabelModel extends TeaModel {
    // 二级标签
    /**
     * <strong>example:</strong>
     * <p>正常</p>
     */
    @NameInMap("sub_label")
    @Validation(required = true)
    public String subLabel;

    // 风险关键词列表
    @NameInMap("risk_words")
    public java.util.List<String> riskWords;

    // 风险关键词索引列表
    @NameInMap("risk_words_index")
    public java.util.List<String> riskWordsIndex;

    // 三级标签列表
    @NameInMap("third_labels")
    public java.util.List<String> thirdLabels;

    public static SubLabelModel build(java.util.Map<String, ?> map) throws Exception {
        SubLabelModel self = new SubLabelModel();
        return TeaModel.build(map, self);
    }

    public SubLabelModel setSubLabel(String subLabel) {
        this.subLabel = subLabel;
        return this;
    }
    public String getSubLabel() {
        return this.subLabel;
    }

    public SubLabelModel setRiskWords(java.util.List<String> riskWords) {
        this.riskWords = riskWords;
        return this;
    }
    public java.util.List<String> getRiskWords() {
        return this.riskWords;
    }

    public SubLabelModel setRiskWordsIndex(java.util.List<String> riskWordsIndex) {
        this.riskWordsIndex = riskWordsIndex;
        return this;
    }
    public java.util.List<String> getRiskWordsIndex() {
        return this.riskWordsIndex;
    }

    public SubLabelModel setThirdLabels(java.util.List<String> thirdLabels) {
        this.thirdLabels = thirdLabels;
        return this;
    }
    public java.util.List<String> getThirdLabels() {
        return this.thirdLabels;
    }

}
