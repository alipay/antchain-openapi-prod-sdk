// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class CustomerValueDetail extends TeaModel {
    // 名称
    @NameInMap("name")
    public String name;

    // 友商价格
    @NameInMap("profit")
    public String profit;

    // 蚂蚁收益
    @NameInMap("ant_divide")
    public String antDivide;

    // BD权限价预估
    @NameInMap("bd_price_predict")
    public String bdPricePredict;

    public static CustomerValueDetail build(java.util.Map<String, ?> map) throws Exception {
        CustomerValueDetail self = new CustomerValueDetail();
        return TeaModel.build(map, self);
    }

    public CustomerValueDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CustomerValueDetail setProfit(String profit) {
        this.profit = profit;
        return this;
    }
    public String getProfit() {
        return this.profit;
    }

    public CustomerValueDetail setAntDivide(String antDivide) {
        this.antDivide = antDivide;
        return this;
    }
    public String getAntDivide() {
        return this.antDivide;
    }

    public CustomerValueDetail setBdPricePredict(String bdPricePredict) {
        this.bdPricePredict = bdPricePredict;
        return this;
    }
    public String getBdPricePredict() {
        return this.bdPricePredict;
    }

}
