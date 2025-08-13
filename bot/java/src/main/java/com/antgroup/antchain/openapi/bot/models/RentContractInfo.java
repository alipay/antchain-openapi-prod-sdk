// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RentContractInfo extends TeaModel {
    // 租赁合同ID
    /**
     * <strong>example:</strong>
     * <p>2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2</p>
     */
    @NameInMap("contract_id")
    @Validation(required = true)
    public String contractId;

    // 租约时间 
    /**
     * <strong>example:</strong>
     * <p>6个月 或 1年</p>
     */
    @NameInMap("lease_time")
    @Validation(required = true)
    public String leaseTime;

    // 入住时间
    /**
     * <strong>example:</strong>
     * <p>2006-01-02 15:04:05</p>
     */
    @NameInMap("checkin_date")
    @Validation(required = true)
    public String checkinDate;

    // 退租时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("checkout_date")
    @Validation(required = true)
    public String checkoutDate;

    public static RentContractInfo build(java.util.Map<String, ?> map) throws Exception {
        RentContractInfo self = new RentContractInfo();
        return TeaModel.build(map, self);
    }

    public RentContractInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public RentContractInfo setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime;
        return this;
    }
    public String getLeaseTime() {
        return this.leaseTime;
    }

    public RentContractInfo setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
        return this;
    }
    public String getCheckinDate() {
        return this.checkinDate;
    }

    public RentContractInfo setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
        return this;
    }
    public String getCheckoutDate() {
        return this.checkoutDate;
    }

}
