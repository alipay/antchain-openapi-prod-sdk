// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ConfirmCargowaybillBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账单金额（两位小数）
    @NameInMap("bill_amount")
    @Validation(required = true)
    public String billAmount;

    // 账单code（账单唯一标识）
    @NameInMap("bill_code")
    @Validation(required = true)
    public String billCode;

    // 账单确认货主did
    @NameInMap("bill_consignor_did")
    @Validation(required = true)
    public String billConsignorDid;

    // 账单确认日期（毫秒）
    @NameInMap("bill_sure_date")
    public Long billSureDate;

    // 是否结算
    @NameInMap("whether_settle")
    @Validation(required = true)
    public Boolean whetherSettle;

    // 平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static ConfirmCargowaybillBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmCargowaybillBillRequest self = new ConfirmCargowaybillBillRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmCargowaybillBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmCargowaybillBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmCargowaybillBillRequest setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public ConfirmCargowaybillBillRequest setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }
    public String getBillCode() {
        return this.billCode;
    }

    public ConfirmCargowaybillBillRequest setBillConsignorDid(String billConsignorDid) {
        this.billConsignorDid = billConsignorDid;
        return this;
    }
    public String getBillConsignorDid() {
        return this.billConsignorDid;
    }

    public ConfirmCargowaybillBillRequest setBillSureDate(Long billSureDate) {
        this.billSureDate = billSureDate;
        return this;
    }
    public Long getBillSureDate() {
        return this.billSureDate;
    }

    public ConfirmCargowaybillBillRequest setWhetherSettle(Boolean whetherSettle) {
        this.whetherSettle = whetherSettle;
        return this;
    }
    public Boolean getWhetherSettle() {
        return this.whetherSettle;
    }

    public ConfirmCargowaybillBillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
