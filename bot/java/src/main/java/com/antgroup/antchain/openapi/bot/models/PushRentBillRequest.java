// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class PushRentBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业主房屋账单ID(
    @NameInMap("lease_bill_id")
    @Validation(required = true)
    public String leaseBillId;

    // 房源ID
    @NameInMap("house_id")
    @Validation(required = true)
    public String houseId;

    // 总账单开始日期
    @NameInMap("bill_begin_date")
    @Validation(required = true)
    public String billBeginDate;

    // 总账单结束日期
    @NameInMap("bill_end_date")
    @Validation(required = true)
    public String billEndDate;

    // 总账单金额
    @NameInMap("bill_money")
    @Validation(required = true)
    public String billMoney;

    // 提醒缴租日期范围(天数)
    @NameInMap("remind_range")
    @Validation(required = true)
    public String remindRange;

    // 逾期未缴租警告日期范围(天数)
    @NameInMap("warn_range")
    @Validation(required = true)
    public String warnRange;

    // 风险干预日期天数
    @NameInMap("risk_range")
    @Validation(required = true)
    public String riskRange;

    // 账单租期集合
    @NameInMap("bill_item_list")
    @Validation(required = true)
    public java.util.List<RentBillItem> billItemList;

    public static PushRentBillRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRentBillRequest self = new PushRentBillRequest();
        return TeaModel.build(map, self);
    }

    public PushRentBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRentBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRentBillRequest setLeaseBillId(String leaseBillId) {
        this.leaseBillId = leaseBillId;
        return this;
    }
    public String getLeaseBillId() {
        return this.leaseBillId;
    }

    public PushRentBillRequest setHouseId(String houseId) {
        this.houseId = houseId;
        return this;
    }
    public String getHouseId() {
        return this.houseId;
    }

    public PushRentBillRequest setBillBeginDate(String billBeginDate) {
        this.billBeginDate = billBeginDate;
        return this;
    }
    public String getBillBeginDate() {
        return this.billBeginDate;
    }

    public PushRentBillRequest setBillEndDate(String billEndDate) {
        this.billEndDate = billEndDate;
        return this;
    }
    public String getBillEndDate() {
        return this.billEndDate;
    }

    public PushRentBillRequest setBillMoney(String billMoney) {
        this.billMoney = billMoney;
        return this;
    }
    public String getBillMoney() {
        return this.billMoney;
    }

    public PushRentBillRequest setRemindRange(String remindRange) {
        this.remindRange = remindRange;
        return this;
    }
    public String getRemindRange() {
        return this.remindRange;
    }

    public PushRentBillRequest setWarnRange(String warnRange) {
        this.warnRange = warnRange;
        return this;
    }
    public String getWarnRange() {
        return this.warnRange;
    }

    public PushRentBillRequest setRiskRange(String riskRange) {
        this.riskRange = riskRange;
        return this;
    }
    public String getRiskRange() {
        return this.riskRange;
    }

    public PushRentBillRequest setBillItemList(java.util.List<RentBillItem> billItemList) {
        this.billItemList = billItemList;
        return this;
    }
    public java.util.List<RentBillItem> getBillItemList() {
        return this.billItemList;
    }

}
