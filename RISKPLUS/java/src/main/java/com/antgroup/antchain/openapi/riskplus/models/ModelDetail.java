// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ModelDetail extends TeaModel {
    // 产品码
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 评分
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("score")
    @Validation(required = true)
    public Long score;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("desc")
    public String desc;

    public static ModelDetail build(java.util.Map<String, ?> map) throws Exception {
        ModelDetail self = new ModelDetail();
        return TeaModel.build(map, self);
    }

    public ModelDetail setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ModelDetail setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

    public ModelDetail setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
