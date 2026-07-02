// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GoodsDigitalFingerprintPointIdentificationResult extends TeaModel {
    // 子鉴定项
    /**
     * <strong>example:</strong>
     * <p>子鉴定项</p>
     */
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 商品数字指纹鉴定子项鉴定结果
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 鉴定子项鉴定得分
    /**
     * <strong>example:</strong>
     * <p>0.92</p>
     */
    @NameInMap("grade")
    @Validation(required = true)
    public String grade;

    public static GoodsDigitalFingerprintPointIdentificationResult build(java.util.Map<String, ?> map) throws Exception {
        GoodsDigitalFingerprintPointIdentificationResult self = new GoodsDigitalFingerprintPointIdentificationResult();
        return TeaModel.build(map, self);
    }

    public GoodsDigitalFingerprintPointIdentificationResult setSubPointName(String subPointName) {
        this.subPointName = subPointName;
        return this;
    }
    public String getSubPointName() {
        return this.subPointName;
    }

    public GoodsDigitalFingerprintPointIdentificationResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GoodsDigitalFingerprintPointIdentificationResult setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

}
