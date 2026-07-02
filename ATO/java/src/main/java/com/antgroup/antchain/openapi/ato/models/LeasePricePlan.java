// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class LeasePricePlan extends TeaModel {
    // 租赁方案
    /**
     * <strong>example:</strong>
     * <p>租赁方案</p>
     */
    @NameInMap("rental_plan")
    public String rentalPlan;

    // 租赁周期
    @NameInMap("rental_period")
    public Long rentalPeriod;

    // 租赁价格属性列表
    @NameInMap("lease_price_prop_list")
    public java.util.List<LeasePriceProp> leasePricePropList;

    public static LeasePricePlan build(java.util.Map<String, ?> map) throws Exception {
        LeasePricePlan self = new LeasePricePlan();
        return TeaModel.build(map, self);
    }

    public LeasePricePlan setRentalPlan(String rentalPlan) {
        this.rentalPlan = rentalPlan;
        return this;
    }
    public String getRentalPlan() {
        return this.rentalPlan;
    }

    public LeasePricePlan setRentalPeriod(Long rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        return this;
    }
    public Long getRentalPeriod() {
        return this.rentalPeriod;
    }

    public LeasePricePlan setLeasePricePropList(java.util.List<LeasePriceProp> leasePricePropList) {
        this.leasePricePropList = leasePricePropList;
        return this;
    }
    public java.util.List<LeasePriceProp> getLeasePricePropList() {
        return this.leasePricePropList;
    }

}
