// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateCargowaybillBillRequest extends TeaModel {
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

    // 账单到期日期
    @NameInMap("deadline")
    @Validation(required = true)
    public Long deadline;

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
    public java.util.List<WaybillAmount> waybillAmounts;

    // 运单上传状态，可填写：已完成、未完成
    @NameInMap("waybill_upload_status")
    @Validation(required = true)
    public String waybillUploadStatus;

    public static UpdateCargowaybillBillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCargowaybillBillRequest self = new UpdateCargowaybillBillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCargowaybillBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCargowaybillBillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateCargowaybillBillRequest setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public UpdateCargowaybillBillRequest setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }
    public String getBillCode() {
        return this.billCode;
    }

    public UpdateCargowaybillBillRequest setBillCreateTime(Long billCreateTime) {
        this.billCreateTime = billCreateTime;
        return this;
    }
    public Long getBillCreateTime() {
        return this.billCreateTime;
    }

    public UpdateCargowaybillBillRequest setBillDeadline(String billDeadline) {
        this.billDeadline = billDeadline;
        return this;
    }
    public String getBillDeadline() {
        return this.billDeadline;
    }

    public UpdateCargowaybillBillRequest setBillPayerDid(String billPayerDid) {
        this.billPayerDid = billPayerDid;
        return this;
    }
    public String getBillPayerDid() {
        return this.billPayerDid;
    }

    public UpdateCargowaybillBillRequest setCargoAmounts(java.util.List<CargoAmount> cargoAmounts) {
        this.cargoAmounts = cargoAmounts;
        return this;
    }
    public java.util.List<CargoAmount> getCargoAmounts() {
        return this.cargoAmounts;
    }

    public UpdateCargowaybillBillRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UpdateCargowaybillBillRequest setDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }
    public Long getDeadline() {
        return this.deadline;
    }

    public UpdateCargowaybillBillRequest setPayAmounts(java.util.List<PayAmount> payAmounts) {
        this.payAmounts = payAmounts;
        return this;
    }
    public java.util.List<PayAmount> getPayAmounts() {
        return this.payAmounts;
    }

    public UpdateCargowaybillBillRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public UpdateCargowaybillBillRequest setPreConsignorPayDate(Long preConsignorPayDate) {
        this.preConsignorPayDate = preConsignorPayDate;
        return this;
    }
    public Long getPreConsignorPayDate() {
        return this.preConsignorPayDate;
    }

    public UpdateCargowaybillBillRequest setWaybillAmounts(java.util.List<WaybillAmount> waybillAmounts) {
        this.waybillAmounts = waybillAmounts;
        return this;
    }
    public java.util.List<WaybillAmount> getWaybillAmounts() {
        return this.waybillAmounts;
    }

    public UpdateCargowaybillBillRequest setWaybillUploadStatus(String waybillUploadStatus) {
        this.waybillUploadStatus = waybillUploadStatus;
        return this;
    }
    public String getWaybillUploadStatus() {
        return this.waybillUploadStatus;
    }

}
