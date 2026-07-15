// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RentInfo extends TeaModel {
    // 租金
    /**
     * <strong>example:</strong>
     * <p>2933300</p>
     */
    @NameInMap("rent_price")
    @Validation(required = true)
    public Long rentPrice;

    // 租期
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("rent_term")
    @Validation(required = true)
    public Long rentTerm;

    // 手续费
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("commission")
    @Validation(required = true)
    public Long commission;

    // 买断价
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("buyout_price")
    @Validation(required = true)
    public Long buyoutPrice;

    // 留购价
    /**
     * <strong>example:</strong>
     * <p>31903 </p>
     */
    @NameInMap("retained_price")
    @Validation(required = true)
    public Long retainedPrice;

    public static RentInfo build(java.util.Map<String, ?> map) throws Exception {
        RentInfo self = new RentInfo();
        return TeaModel.build(map, self);
    }

    public RentInfo setRentPrice(Long rentPrice) {
        this.rentPrice = rentPrice;
        return this;
    }
    public Long getRentPrice() {
        return this.rentPrice;
    }

    public RentInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public RentInfo setCommission(Long commission) {
        this.commission = commission;
        return this;
    }
    public Long getCommission() {
        return this.commission;
    }

    public RentInfo setBuyoutPrice(Long buyoutPrice) {
        this.buyoutPrice = buyoutPrice;
        return this;
    }
    public Long getBuyoutPrice() {
        return this.buyoutPrice;
    }

    public RentInfo setRetainedPrice(Long retainedPrice) {
        this.retainedPrice = retainedPrice;
        return this;
    }
    public Long getRetainedPrice() {
        return this.retainedPrice;
    }

}
