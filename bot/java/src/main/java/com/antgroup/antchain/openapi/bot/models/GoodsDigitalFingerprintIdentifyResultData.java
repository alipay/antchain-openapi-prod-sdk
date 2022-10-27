// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintIdentifyResultData extends TeaModel {
    // 鉴定结果
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 鉴定结果描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 商品数字指纹鉴定点鉴定结果列表
    @NameInMap("point_identification_results")
    @Validation(required = true)
    public java.util.List<GoodsDigitalFingerprintPointIdentificationResult> pointIdentificationResults;

    public static GoodsDigitalFingerprintIdentifyResultData build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintIdentifyResultData self = new GoodsDigitalFingerprintIdentifyResultData();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintIdentifyResultData setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

    public GoodsDigitalFingerprintIdentifyResultData setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GoodsDigitalFingerprintIdentifyResultData setPointIdentificationResults(java.util.List<GoodsDigitalFingerprintPointIdentificationResult> pointIdentificationResults) {
        this.pointIdentificationResults = pointIdentificationResults;
        return this;
    }
    public java.util.List<GoodsDigitalFingerprintPointIdentificationResult> getPointIdentificationResults() {
        return this.pointIdentificationResults;
    }

}
