// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class AdditionDetail extends TeaModel {
    // 友商名称
    @NameInMap("name")
    public String name;

    // 友商价格
    @NameInMap("profit")
    public String profit;

    // 技术分调整
    @NameInMap("technical_score")
    public String technicalScore;

    // 品牌分调整
    @NameInMap("brand_score")
    public String brandScore;

    // BD权限价预估
    @NameInMap("bd_price_predict")
    public String bdPricePredict;

    public static AdditionDetail build(java.util.Map<String, ?> map) throws Exception {
        AdditionDetail self = new AdditionDetail();
        return TeaModel.build(map, self);
    }

    public AdditionDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AdditionDetail setProfit(String profit) {
        this.profit = profit;
        return this;
    }
    public String getProfit() {
        return this.profit;
    }

    public AdditionDetail setTechnicalScore(String technicalScore) {
        this.technicalScore = technicalScore;
        return this;
    }
    public String getTechnicalScore() {
        return this.technicalScore;
    }

    public AdditionDetail setBrandScore(String brandScore) {
        this.brandScore = brandScore;
        return this;
    }
    public String getBrandScore() {
        return this.brandScore;
    }

    public AdditionDetail setBdPricePredict(String bdPricePredict) {
        this.bdPricePredict = bdPricePredict;
        return this;
    }
    public String getBdPricePredict() {
        return this.bdPricePredict;
    }

}
