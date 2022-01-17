// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateBillReceivablebillnodetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
    @NameInMap("bill_amount")
    @Validation(required = true)
    public String billAmount;

    // 账单生成时间，13位毫秒级时间戳
    @NameInMap("bill_create_time")
    @Validation(required = true)
    public Long billCreateTime;

    // 账单期限，单位（天），合同约定的结算周期
    @NameInMap("bill_deadline")
    @Validation(required = true)
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
    @Validation(required = true)
    public String billPayerDid;

    // 账单起始日期，13位毫秒级时间戳
    @NameInMap("bill_start_time")
    @Validation(required = true)
    public Long billStartTime;

    // 关联合同编号，账单关联的合同编号，如为合同物流请填写
    @NameInMap("contract_code")
    public String contractCode;

    // 账单到期日期，13位毫秒级时间戳
    @NameInMap("deadline")
    @Validation(required = true)
    public Long deadline;

    // 所属平台did
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    public static CreateBillReceivablebillnodetailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBillReceivablebillnodetailRequest self = new CreateBillReceivablebillnodetailRequest();
        return TeaModel.build(map, self);
    }

    public CreateBillReceivablebillnodetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBillReceivablebillnodetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBillReceivablebillnodetailRequest setBillAmount(String billAmount) {
        this.billAmount = billAmount;
        return this;
    }
    public String getBillAmount() {
        return this.billAmount;
    }

    public CreateBillReceivablebillnodetailRequest setBillCreateTime(Long billCreateTime) {
        this.billCreateTime = billCreateTime;
        return this;
    }
    public Long getBillCreateTime() {
        return this.billCreateTime;
    }

    public CreateBillReceivablebillnodetailRequest setBillDeadline(Long billDeadline) {
        this.billDeadline = billDeadline;
        return this;
    }
    public Long getBillDeadline() {
        return this.billDeadline;
    }

    public CreateBillReceivablebillnodetailRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public CreateBillReceivablebillnodetailRequest setBillPayeeDid(String billPayeeDid) {
        this.billPayeeDid = billPayeeDid;
        return this;
    }
    public String getBillPayeeDid() {
        return this.billPayeeDid;
    }

    public CreateBillReceivablebillnodetailRequest setBillPayerDid(String billPayerDid) {
        this.billPayerDid = billPayerDid;
        return this;
    }
    public String getBillPayerDid() {
        return this.billPayerDid;
    }

    public CreateBillReceivablebillnodetailRequest setBillStartTime(Long billStartTime) {
        this.billStartTime = billStartTime;
        return this;
    }
    public Long getBillStartTime() {
        return this.billStartTime;
    }

    public CreateBillReceivablebillnodetailRequest setContractCode(String contractCode) {
        this.contractCode = contractCode;
        return this;
    }
    public String getContractCode() {
        return this.contractCode;
    }

    public CreateBillReceivablebillnodetailRequest setDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }
    public Long getDeadline() {
        return this.deadline;
    }

    public CreateBillReceivablebillnodetailRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

}
