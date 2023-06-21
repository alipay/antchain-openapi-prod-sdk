// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclPromiseInfo extends TeaModel {
    // 承诺租期 单位
    // 月 MONTH
    @NameInMap("rent_unit")
    @Validation(required = true)
    public String rentUnit;

    // 总期数
    @NameInMap("rent_term")
    @Validation(required = true)
    public Long rentTerm;

    // 总金额 单位分
    @NameInMap("total_rent_money")
    @Validation(required = true)
    public Long totalRentMoney;

    // 承诺履约详情
    @NameInMap("promise_details")
    @Validation(required = true)
    public java.util.List<BclPromiseDetailInfo> promiseDetails;

    public static BclPromiseInfo build(java.util.Map<String, ?> map) throws Exception {
        BclPromiseInfo self = new BclPromiseInfo();
        return TeaModel.build(map, self);
    }

    public BclPromiseInfo setRentUnit(String rentUnit) {
        this.rentUnit = rentUnit;
        return this;
    }
    public String getRentUnit() {
        return this.rentUnit;
    }

    public BclPromiseInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public BclPromiseInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public BclPromiseInfo setPromiseDetails(java.util.List<BclPromiseDetailInfo> promiseDetails) {
        this.promiseDetails = promiseDetails;
        return this;
    }
    public java.util.List<BclPromiseDetailInfo> getPromiseDetails() {
        return this.promiseDetails;
    }

}
