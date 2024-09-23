// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PriceDetail extends TeaModel {
    // 商品租赁期数
    @NameInMap("period_num")
    @Validation(required = true, maximum = 1000)
    public Long periodNum;

    // 押金，单位：分。
    @NameInMap("deposit_price")
    @Validation(required = true, maximum = 10000000)
    public Long depositPrice;

    // 买断价格，单位：分
    @NameInMap("buyout_price")
    @Validation(required = true, maximum = 10000000)
    public Long buyoutPrice;

    // 首期租金，单位：分
    @NameInMap("initial_rent_price")
    @Validation(required = true, maximum = 10000000)
    public Long initialRentPrice;

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

    public PriceDetail setDepositPrice(Long depositPrice) {
        this.depositPrice = depositPrice;
        return this;
    }
    public Long getDepositPrice() {
        return this.depositPrice;
    }

    public PriceDetail setBuyoutPrice(Long buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
        return this;
    }
    public Long getBuyoutPrice() {
        return this.buyoutPrice;
    }

    public PriceDetail setInitialRentPrice(Long initialRentPrice) {
        this.initialRentPrice = initialRentPrice;
        return this;
    }
    public Long getInitialRentPrice() {
        return this.initialRentPrice;
    }

}
