// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApplyPfWaybillfinancingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 承运商did
    @NameInMap("carrier_did")
    @Validation(required = true, maxLength = 80)
    public String carrierDid;

    // 融资支用金额；总长度最长15位，保留2位小数，四舍五入
    @NameInMap("financing_amount")
    @Validation(required = true)
    public String financingAmount;

    // 支用币种，支持 CNY,USD
    @NameInMap("financing_currency")
    @Validation(required = true)
    public String financingCurrency;

    // 融资授信主体公司分布式数字身份
    @NameInMap("financing_subject_did")
    @Validation(required = true, maxLength = 80)
    public String financingSubjectDid;

    // 贷款期限，值为2~6，单位为月
    @NameInMap("loan_term")
    @Validation(required = true, maxLength = 6, minLength = 2)
    public String loanTerm;

    // 收款方开户行总行联行号
    @NameInMap("payee_bank_number")
    @Validation(required = true, maxLength = 32)
    public String payeeBankNumber;

    // 收款方开户行名称
    @NameInMap("payee_bcb")
    @Validation(required = true, maxLength = 200)
    public String payeeBcb;

    // 收款方开户行银行卡号
    @NameInMap("payee_bcb_card_no")
    @Validation(required = true)
    public String payeeBcbCardNo;

    // 收款方证件号
    // 
    // 
    @NameInMap("payee_id_number")
    @Validation(required = true, maxLength = 40)
    public String payeeIdNumber;

    // 收款方证件类型
    @NameInMap("payee_id_type")
    @Validation(required = true, maxLength = 5)
    public String payeeIdType;

    // 收款方名称
    @NameInMap("payee_name")
    @Validation(required = true, maxLength = 200)
    public String payeeName;

    // 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2 
    @NameInMap("purpose")
    @Validation(required = true)
    public String purpose;

    // 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
    @NameInMap("request_no")
    @Validation(required = true, maxLength = 23)
    public String requestNo;

    // 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
    @NameInMap("signature")
    @Validation(maxLength = 800)
    public String signature;

    // 转账附言
    // 1: 工资、奖金收入
    // 2：稿费、演出费等劳务收入
    // 3：债券、期货、信托等投资的本金和收益
    // 4：个人债券或产权转让收益
    // 该字段建议填写 2
    @NameInMap("transfer_postscript")
    @Validation(required = true, maxLength = 3)
    public String transferPostscript;

    // 凭证类型，支持 WAYBILL,PAYABLE
    @NameInMap("voucher_category")
    @Validation(required = true)
    public String voucherCategory;

    // 支用凭证ids，支持多个，逗号隔开；
    @NameInMap("voucher_ids")
    @Validation(required = true, maxLength = 2000)
    public String voucherIds;

    // 8位发票号，支持多个，逗号分隔
    @NameInMap("voucher_invoice_codes")
    @Validation(maxLength = 800)
    public String voucherInvoiceCodes;

    // 提款确认书hash
    @NameInMap("confirmation_hash")
    public String confirmationHash;

    // 提款确认书 osskey
    @NameInMap("confirmation_oss_key")
    public String confirmationOssKey;

    // 签名公钥
    @NameInMap("signature_pub_key")
    public String signaturePubKey;

    // 网银操作员账号
    // 
    // 
    @NameInMap("online_bank_operator_account")
    public String onlineBankOperatorAccount;

    public static ApplyPfWaybillfinancingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPfWaybillfinancingRequest self = new ApplyPfWaybillfinancingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPfWaybillfinancingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPfWaybillfinancingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyPfWaybillfinancingRequest setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public ApplyPfWaybillfinancingRequest setFinancingAmount(String financingAmount) {
        this.financingAmount = financingAmount;
        return this;
    }
    public String getFinancingAmount() {
        return this.financingAmount;
    }

    public ApplyPfWaybillfinancingRequest setFinancingCurrency(String financingCurrency) {
        this.financingCurrency = financingCurrency;
        return this;
    }
    public String getFinancingCurrency() {
        return this.financingCurrency;
    }

    public ApplyPfWaybillfinancingRequest setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

    public ApplyPfWaybillfinancingRequest setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
        return this;
    }
    public String getLoanTerm() {
        return this.loanTerm;
    }

    public ApplyPfWaybillfinancingRequest setPayeeBankNumber(String payeeBankNumber) {
        this.payeeBankNumber = payeeBankNumber;
        return this;
    }
    public String getPayeeBankNumber() {
        return this.payeeBankNumber;
    }

    public ApplyPfWaybillfinancingRequest setPayeeBcb(String payeeBcb) {
        this.payeeBcb = payeeBcb;
        return this;
    }
    public String getPayeeBcb() {
        return this.payeeBcb;
    }

    public ApplyPfWaybillfinancingRequest setPayeeBcbCardNo(String payeeBcbCardNo) {
        this.payeeBcbCardNo = payeeBcbCardNo;
        return this;
    }
    public String getPayeeBcbCardNo() {
        return this.payeeBcbCardNo;
    }

    public ApplyPfWaybillfinancingRequest setPayeeIdNumber(String payeeIdNumber) {
        this.payeeIdNumber = payeeIdNumber;
        return this;
    }
    public String getPayeeIdNumber() {
        return this.payeeIdNumber;
    }

    public ApplyPfWaybillfinancingRequest setPayeeIdType(String payeeIdType) {
        this.payeeIdType = payeeIdType;
        return this;
    }
    public String getPayeeIdType() {
        return this.payeeIdType;
    }

    public ApplyPfWaybillfinancingRequest setPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }
    public String getPayeeName() {
        return this.payeeName;
    }

    public ApplyPfWaybillfinancingRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public ApplyPfWaybillfinancingRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public ApplyPfWaybillfinancingRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ApplyPfWaybillfinancingRequest setTransferPostscript(String transferPostscript) {
        this.transferPostscript = transferPostscript;
        return this;
    }
    public String getTransferPostscript() {
        return this.transferPostscript;
    }

    public ApplyPfWaybillfinancingRequest setVoucherCategory(String voucherCategory) {
        this.voucherCategory = voucherCategory;
        return this;
    }
    public String getVoucherCategory() {
        return this.voucherCategory;
    }

    public ApplyPfWaybillfinancingRequest setVoucherIds(String voucherIds) {
        this.voucherIds = voucherIds;
        return this;
    }
    public String getVoucherIds() {
        return this.voucherIds;
    }

    public ApplyPfWaybillfinancingRequest setVoucherInvoiceCodes(String voucherInvoiceCodes) {
        this.voucherInvoiceCodes = voucherInvoiceCodes;
        return this;
    }
    public String getVoucherInvoiceCodes() {
        return this.voucherInvoiceCodes;
    }

    public ApplyPfWaybillfinancingRequest setConfirmationHash(String confirmationHash) {
        this.confirmationHash = confirmationHash;
        return this;
    }
    public String getConfirmationHash() {
        return this.confirmationHash;
    }

    public ApplyPfWaybillfinancingRequest setConfirmationOssKey(String confirmationOssKey) {
        this.confirmationOssKey = confirmationOssKey;
        return this;
    }
    public String getConfirmationOssKey() {
        return this.confirmationOssKey;
    }

    public ApplyPfWaybillfinancingRequest setSignaturePubKey(String signaturePubKey) {
        this.signaturePubKey = signaturePubKey;
        return this;
    }
    public String getSignaturePubKey() {
        return this.signaturePubKey;
    }

    public ApplyPfWaybillfinancingRequest setOnlineBankOperatorAccount(String onlineBankOperatorAccount) {
        this.onlineBankOperatorAccount = onlineBankOperatorAccount;
        return this;
    }
    public String getOnlineBankOperatorAccount() {
        return this.onlineBankOperatorAccount;
    }

}
