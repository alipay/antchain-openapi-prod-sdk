// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsPointQueryRespData extends TeaModel {
    // 识别结果
    // true：识别到鉴定点
    // false：未识别到鉴定点
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("detection")
    @Validation(required = true)
    public Boolean detection;

    // 鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    public static BaiGoodsPointQueryRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsPointQueryRespData self = new BaiGoodsPointQueryRespData();
        return TeaModel.build(map, self);
    }

    public BaiGoodsPointQueryRespData setDetection(Boolean detection) {
        this.detection = detection;
        return this;
    }
    public Boolean getDetection() {
        return this.detection;
    }

    public BaiGoodsPointQueryRespData setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

}
