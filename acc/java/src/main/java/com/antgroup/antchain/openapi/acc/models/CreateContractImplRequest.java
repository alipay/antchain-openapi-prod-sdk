// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateContractImplRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 合同编号,(确定是哪个合同的收付款，需要唯一标识id)
    @NameInMap("contract_info_code")
    @Validation(required = true)
    public String contractInfoCode;

    // 收付款id
    @NameInMap("contract_impl_id")
    @Validation(required = true)
    public Long contractImplId;

    // 付款方统一社会信用代码
    @NameInMap("party_a_bidder_code")
    @Validation(required = true)
    public String partyABidderCode;

    // 付款方审核人Did
    @NameInMap("party_a_audit_did")
    @Validation(required = true)
    public String partyAAuditDid;

    // 付款方名称	
    @NameInMap("party_a_name")
    @Validation(required = true)
    public String partyAName;

    // 收款方统一社会信用代码
    @NameInMap("party_b_bidder_code")
    @Validation(required = true)
    public String partyBBidderCode;

    // 收款方审核人Did
    @NameInMap("party_b_audit_did")
    public String partyBAuditDid;

    // 收款方名称
    @NameInMap("party_b_name")
    @Validation(required = true)
    public String partyBName;

    // 拨付金额
    @NameInMap("pay_money")
    @Validation(required = true)
    public String payMoney;

    // 金额币种代码
    @NameInMap("price_currency")
    @Validation(required = true)
    public String priceCurrency;

    // 金额单位
    @NameInMap("price_unit")
    @Validation(required = true)
    public String priceUnit;

    // 支付说明
    @NameInMap("remarks")
    @Validation(required = true)
    public String remarks;

    // 款项类型
    @NameInMap("payment_type")
    @Validation(required = true)
    public String paymentType;

    // 拨付时间
    @NameInMap("pay_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String payTime;

    // 创建人Did
    @NameInMap("created_did")
    @Validation(required = true)
    public String createdDid;

    // 付款凭证文件(文件Id)
    @NameInMap("file")
    @Validation(required = true)
    public String file;

    // 数据时间戳
    @NameInMap("data_timestamp")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dataTimestamp;

    public static CreateContractImplRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractImplRequest self = new CreateContractImplRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractImplRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractImplRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractImplRequest setContractInfoCode(String contractInfoCode) {
        this.contractInfoCode = contractInfoCode;
        return this;
    }
    public String getContractInfoCode() {
        return this.contractInfoCode;
    }

    public CreateContractImplRequest setContractImplId(Long contractImplId) {
        this.contractImplId = contractImplId;
        return this;
    }
    public Long getContractImplId() {
        return this.contractImplId;
    }

    public CreateContractImplRequest setPartyABidderCode(String partyABidderCode) {
        this.partyABidderCode = partyABidderCode;
        return this;
    }
    public String getPartyABidderCode() {
        return this.partyABidderCode;
    }

    public CreateContractImplRequest setPartyAAuditDid(String partyAAuditDid) {
        this.partyAAuditDid = partyAAuditDid;
        return this;
    }
    public String getPartyAAuditDid() {
        return this.partyAAuditDid;
    }

    public CreateContractImplRequest setPartyAName(String partyAName) {
        this.partyAName = partyAName;
        return this;
    }
    public String getPartyAName() {
        return this.partyAName;
    }

    public CreateContractImplRequest setPartyBBidderCode(String partyBBidderCode) {
        this.partyBBidderCode = partyBBidderCode;
        return this;
    }
    public String getPartyBBidderCode() {
        return this.partyBBidderCode;
    }

    public CreateContractImplRequest setPartyBAuditDid(String partyBAuditDid) {
        this.partyBAuditDid = partyBAuditDid;
        return this;
    }
    public String getPartyBAuditDid() {
        return this.partyBAuditDid;
    }

    public CreateContractImplRequest setPartyBName(String partyBName) {
        this.partyBName = partyBName;
        return this;
    }
    public String getPartyBName() {
        return this.partyBName;
    }

    public CreateContractImplRequest setPayMoney(String payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public String getPayMoney() {
        return this.payMoney;
    }

    public CreateContractImplRequest setPriceCurrency(String priceCurrency) {
        this.priceCurrency = priceCurrency;
        return this;
    }
    public String getPriceCurrency() {
        return this.priceCurrency;
    }

    public CreateContractImplRequest setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit;
        return this;
    }
    public String getPriceUnit() {
        return this.priceUnit;
    }

    public CreateContractImplRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateContractImplRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateContractImplRequest setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public CreateContractImplRequest setCreatedDid(String createdDid) {
        this.createdDid = createdDid;
        return this;
    }
    public String getCreatedDid() {
        return this.createdDid;
    }

    public CreateContractImplRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public CreateContractImplRequest setDataTimestamp(String dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
        return this;
    }
    public String getDataTimestamp() {
        return this.dataTimestamp;
    }

}
