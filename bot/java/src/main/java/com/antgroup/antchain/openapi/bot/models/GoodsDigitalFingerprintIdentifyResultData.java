// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintIdentifyResultData extends TeaModel {
    // 鉴定结果
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 鉴定结果描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 商品数字指纹鉴定点鉴定结果列表
    /**
     * <strong>example:</strong>
     * <p>{&quot;sub_point_name&quot;:&quot;正面&quot;,&quot;result&quot;:&quot;REAL&quot;,&quot;grade&quot;:&quot;0.92&quot;}</p>
     */
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
