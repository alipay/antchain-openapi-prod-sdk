// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargowaybillBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 货主账单总额（两位小数）
    @NameInMap("bill_amount")
    @Validation(required = true)
    public String billAmount;

    // 账单code（唯一标识）
    @NameInMap("bill_code")
    @Validation(required = true)
    public String billCode;

    // 账单生成时间(毫秒)
    @NameInMap("bill_create_time")
    @Validation(required = true)
    public Long billCreateTime;

    // 账单期限
    @NameInMap("bill_deadline")
    @Validation(required = true)
    public String billDeadline;

    // 付款方did
    @NameInMap("bill_payer_did")
    @Validation(required = true)
    public String billPayerDid;

    // 货源单号-货主运费列表
    @NameInMap("cargo_amounts")
    @Validation(required = true)
    public java.util.List<CargoAmount> cargoAmounts;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 货主支付方式-支付金额列表
    @NameInMap("pay_amounts")
    @Validation(required = true)
    public java.util.List<PayAmount> payAmounts;

    // 平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 预计货主付款日期
    @NameInMap("pre_consignor_pay_date")
    @Validation(required = true)
    public Long preConsignorPayDate;

    // 运单号-司机运费列表
    @NameInMap("waybill_amounts")
    @Validation(required = true)
    public java.util.List<WaybillAmount> waybillAmounts;

    // 账单到期日期
    @NameInMap("deadline")
    @Validation(required = true)
    public Long deadline;

    // 运单上传状态，可填写：已完成、未完成
    @NameInMap("waybill_upload_status")
    @Validation(required = true)
    public String waybillUploadStatus;

    public static CreateCargowaybillBillRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCargowaybillBillRequest self = new CreateCargowaybillBillRequest();
        return TeaModel.build(map, self);
    }

    public CreateCargowaybillBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCargowaybillBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCargowaybillBillRequest setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public CreateCargowaybillBillRequest setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }
    public String getBillCode() {
        return this.billCode;
    }

    public CreateCargowaybillBillRequest setBillCreateTime(Long billCreateTime) {
        this.billCreateTime = billCreateTime;
        return this;
    }
    public Long getBillCreateTime() {
        return this.billCreateTime;
    }

    public CreateCargowaybillBillRequest setBillDeadline(String billDeadline) {
        this.billDeadline = billDeadline;
        return this;
    }
    public String getBillDeadline() {
        return this.billDeadline;
    }

    public CreateCargowaybillBillRequest setBillPayerDid(String billPayerDid) {
        this.billPayerDid = billPayerDid;
        return this;
    }
    public String getBillPayerDid() {
        return this.billPayerDid;
    }

    public CreateCargowaybillBillRequest setCargoAmounts(java.util.List<CargoAmount> cargoAmounts) {
        this.cargoAmounts = cargoAmounts;
        return this;
    }
    public java.util.List<CargoAmount> getCargoAmounts() {
        return this.cargoAmounts;
    }

    public CreateCargowaybillBillRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CreateCargowaybillBillRequest setPayAmounts(java.util.List<PayAmount> payAmounts) {
        this.payAmounts = payAmounts;
        return this;
    }
    public java.util.List<PayAmount> getPayAmounts() {
        return this.payAmounts;
    }

    public CreateCargowaybillBillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateCargowaybillBillRequest setPreConsignorPayDate(Long preConsignorPayDate) {
        this.preConsignorPayDate = preConsignorPayDate;
        return this;
    }
    public Long getPreConsignorPayDate() {
        return this.preConsignorPayDate;
    }

    public CreateCargowaybillBillRequest setWaybillAmounts(java.util.List<WaybillAmount> waybillAmounts) {
        this.waybillAmounts = waybillAmounts;
        return this;
    }
    public java.util.List<WaybillAmount> getWaybillAmounts() {
        return this.waybillAmounts;
    }

    public CreateCargowaybillBillRequest setDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }
    public Long getDeadline() {
        return this.deadline;
    }

    public CreateCargowaybillBillRequest setWaybillUploadStatus(String waybillUploadStatus) {
        this.waybillUploadStatus = waybillUploadStatus;
        return this;
    }
    public String getWaybillUploadStatus() {
        return this.waybillUploadStatus;
    }

}
