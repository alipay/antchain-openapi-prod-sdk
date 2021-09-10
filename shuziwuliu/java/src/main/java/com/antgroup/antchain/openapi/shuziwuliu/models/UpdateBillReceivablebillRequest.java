// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UpdateBillReceivablebillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
    @NameInMap("bill_amount")
    public String billAmount;

    // 账单生成时间，13位毫秒级时间戳
    @NameInMap("bill_create_time")
    public Long billCreateTime;

    // 账单期限，单位（天），合同约定的结算周期，需填写1到360的整数
    @NameInMap("bill_deadline")
    public Long billDeadline;

    // 账单id，客户生成的账单唯一编号
    @NameInMap("bill_id")
    @Validation(required = true)
    public String billId;

    // 收款方did，账单的收款方数字身份
    @NameInMap("bill_payee_did")
    @Validation(required = true)
    public String billPayeeDid;

    // 付款方did，账单的付款方数字身份
    @NameInMap("bill_payer_did")
    public String billPayerDid;

    // 账单起始日期，13位毫秒级时间戳
    @NameInMap("bill_start_time")
    public Long billStartTime;

    // 关联合同编号，账单关联的合同编号，如为合同物流请填写
    @NameInMap("contract_code")
    public String contractCode;

    // 账单到期日期，13位毫秒级时间戳
    @NameInMap("deadline")
    public Long deadline;

    // 账单关联运单号数组，元素个数不能超过1000个
    @NameInMap("waybill_ids")
    public java.util.List<String> waybillIds;

    public static UpdateBillReceivablebillRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBillReceivablebillRequest self = new UpdateBillReceivablebillRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBillReceivablebillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBillReceivablebillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBillReceivablebillRequest setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public UpdateBillReceivablebillRequest setBillCreateTime(Long billCreateTime) {
        this.billCreateTime = billCreateTime;
        return this;
    }
    public Long getBillCreateTime() {
        return this.billCreateTime;
    }

    public UpdateBillReceivablebillRequest setBillDeadline(Long billDeadline) {
        this.billDeadline = billDeadline;
        return this;
    }
    public Long getBillDeadline() {
        return this.billDeadline;
    }

    public UpdateBillReceivablebillRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public UpdateBillReceivablebillRequest setBillPayeeDid(String billPayeeDid) {
        this.billPayeeDid = billPayeeDid;
        return this;
    }
    public String getBillPayeeDid() {
        return this.billPayeeDid;
    }

    public UpdateBillReceivablebillRequest setBillPayerDid(String billPayerDid) {
        this.billPayerDid = billPayerDid;
        return this;
    }
    public String getBillPayerDid() {
        return this.billPayerDid;
    }

    public UpdateBillReceivablebillRequest setBillStartTime(Long billStartTime) {
        this.billStartTime = billStartTime;
        return this;
    }
    public Long getBillStartTime() {
        return this.billStartTime;
    }

    public UpdateBillReceivablebillRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public UpdateBillReceivablebillRequest setDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }
    public Long getDeadline() {
        return this.deadline;
    }

    public UpdateBillReceivablebillRequest setWaybillIds(java.util.List<String> waybillIds) {
        this.waybillIds = waybillIds;
        return this;
    }
    public java.util.List<String> getWaybillIds() {
        return this.waybillIds;
    }

}
