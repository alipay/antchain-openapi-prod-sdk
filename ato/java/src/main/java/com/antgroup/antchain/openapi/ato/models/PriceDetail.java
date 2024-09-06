// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PriceDetail extends TeaModel {
    // 商品租赁期数
    @NameInMap("period_num")
    @Validation(required = true, maximum = 1000)
    public Long periodNum;

    // 押金，单位：元。精度：分。
    @NameInMap("deposit_price")
    @Validation(required = true, maxLength = 10)
    public String depositPrice;

    // 买断价格，单位：元，精度：分
    @NameInMap("buyout_price")
    @Validation(required = true, maxLength = 10)
    public String buyoutPrice;

    // 首期租金，单位：元，精度：分
    @NameInMap("initial_rent_price")
    @Validation(required = true, maxLength = 10)
    public String initialRentPrice;

    public static PriceDetail build(java.util.Map<String, ?> map) throws Exception {
        PriceDetail self = new PriceDetail();
        return TeaModel.build(map, self);
    }

    public PriceDetail setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public PriceDetail setDepositPrice(String depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public String getDepositPrice() {
        return this.depositPrice;
    }

    public PriceDetail setBuyoutPrice(String buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
        return this;
    }
    public String getBuyoutPrice() {
        return this.buyoutPrice;
    }

    public PriceDetail setInitialRentPrice(String initialRentPrice) {
        this.initialRentPrice = initialRentPrice;
        return this;
    }
    public String getInitialRentPrice() {
        return this.initialRentPrice;
    }

}
