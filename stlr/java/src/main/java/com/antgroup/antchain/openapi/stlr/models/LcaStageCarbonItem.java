// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class LcaStageCarbonItem extends TeaModel {
    // 生命周期阶段：
    // [MaterialPurchase]-原材料，[ProductManufacture]-生产制造，[ProductSale]-分销，[ProductUsage]-产品使用，[ProductWithdraw]-处置/再生利用
    /**
     * <strong>example:</strong>
     * <p>MaterialPurchase</p>
     */
    @NameInMap("lca_stage_code")
    @Validation(required = true)
    public String lcaStageCode;

    // 阶段碳排放量
    /**
     * <strong>example:</strong>
     * <p>223.23</p>
     */
    @NameInMap("lca_stage_carbon_amount")
    @Validation(required = true)
    public String lcaStageCarbonAmount;

    public static LcaStageCarbonItem build(java.util.Map<String, ?> map) throws Exception {
        LcaStageCarbonItem self = new LcaStageCarbonItem();
        return TeaModel.build(map, self);
    }

    public LcaStageCarbonItem setLcaStageCode(String lcaStageCode) {
        this.lcaStageCode = lcaStageCode;
        return this;
    }
    public String getLcaStageCode() {
        return this.lcaStageCode;
    }

    public LcaStageCarbonItem setLcaStageCarbonAmount(String lcaStageCarbonAmount) {
        this.lcaStageCarbonAmount = lcaStageCarbonAmount;
        return this;
    }
    public String getLcaStageCarbonAmount() {
        return this.lcaStageCarbonAmount;
    }

}
