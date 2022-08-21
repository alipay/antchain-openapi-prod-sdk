// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ReviewData extends TeaModel {
    // 内容安全识别结果
    @NameInMap("content_risk_data")
    @Validation(required = true)
    public java.util.List<ContentRiskData> contentRiskData;

    // 作品相似识别结果
    @NameInMap("resemble_risk_data")
    @Validation(required = true)
    public java.util.List<ResembleRiskData> resembleRiskData;

    // 作品标签识别结果
    @NameInMap("label_risk_data")
    @Validation(required = true)
    public java.util.List<LabelRiskData> labelRiskData;

    public static ReviewData build(java.util.Map<String, ?> map) throws Exception {
        ReviewData self = new ReviewData();
        return TeaModel.build(map, self);
    }

    public ReviewData setContentRiskData(java.util.List<ContentRiskData> contentRiskData) {
        this.contentRiskData = contentRiskData;
        return this;
    }
    public java.util.List<ContentRiskData> getContentRiskData() {
        return this.contentRiskData;
    }

    public ReviewData setResembleRiskData(java.util.List<ResembleRiskData> resembleRiskData) {
        this.resembleRiskData = resembleRiskData;
        return this;
    }
    public java.util.List<ResembleRiskData> getResembleRiskData() {
        return this.resembleRiskData;
    }

    public ReviewData setLabelRiskData(java.util.List<LabelRiskData> labelRiskData) {
        this.labelRiskData = labelRiskData;
        return this;
    }
    public java.util.List<LabelRiskData> getLabelRiskData() {
        return this.labelRiskData;
    }

}
