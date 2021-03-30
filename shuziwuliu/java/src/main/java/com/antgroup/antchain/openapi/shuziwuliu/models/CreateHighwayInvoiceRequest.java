// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateHighwayInvoiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发票号码，8位发票号码
    @NameInMap("invoice_no")
    @Validation(required = true)
    public String invoiceNo;

    // 发票代码，10位或者12位发票代码
    @NameInMap("invoice_code")
    @Validation(required = true)
    public String invoiceCode;

    // 发票校验码后6位
    @NameInMap("verify_code")
    public String verifyCode;

    // 收款方did，出票方，需要出票收钱的
    @NameInMap("payee_did")
    @Validation(required = true)
    public String payeeDid;

    // 付款方did，收票方，需要收票付钱的
    @NameInMap("payer_did")
    @Validation(required = true)
    public String payerDid;

    // 发票含税金额， 不超过2位小数的数字
    @NameInMap("invoice_contains_tax")
    @Validation(required = true)
    public String invoiceContainsTax;

    // 发票不含税金额，不超过2位小数的数字
    @NameInMap("invoice_without_tax")
    @Validation(required = true)
    public String invoiceWithoutTax;

    // 开票日期，格式为yyyy-mm-dd
    @NameInMap("invoice_date")
    @Validation(required = true)
    public String invoiceDate;

    // 发票类型，以下二选一填写：应收发票、应付发票
    @NameInMap("invoice_type")
    @Validation(required = true)
    public String invoiceType;

    // 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
    @NameInMap("file_id")
    public String fileId;

    // 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
    @NameInMap("file_hash")
    public String fileHash;

    // 发票归属平台did，用以区分是哪家平台/企业的发票
    @NameInMap("platform_did")
    @Validation(required = true)
    public String platformDid;

    // 发票种类，以下四选一填写（可填VAT_SPECIAL_INVOICE、VAT_NORMAL_INVOICE、VAT_ROLL_INVOICE、ELECTRONIC_INVOICE）。注：以上分别表示增值税专票、增值税普票、增值税卷票、电子发票
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static CreateHighwayInvoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHighwayInvoiceRequest self = new CreateHighwayInvoiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateHighwayInvoiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateHighwayInvoiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateHighwayInvoiceRequest setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public CreateHighwayInvoiceRequest setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public CreateHighwayInvoiceRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public CreateHighwayInvoiceRequest setPayeeDid(String payeeDid) {
        this.payeeDid = payeeDid;
        return this;
    }
    public String getPayeeDid() {
        return this.payeeDid;
    }

    public CreateHighwayInvoiceRequest setPayerDid(String payerDid) {
        this.payerDid = payerDid;
        return this;
    }
    public String getPayerDid() {
        return this.payerDid;
    }

    public CreateHighwayInvoiceRequest setInvoiceContainsTax(String invoiceContainsTax) {
        this.invoiceContainsTax = invoiceContainsTax;
        return this;
    }
    public String getInvoiceContainsTax() {
        return this.invoiceContainsTax;
    }

    public CreateHighwayInvoiceRequest setInvoiceWithoutTax(String invoiceWithoutTax) {
        this.invoiceWithoutTax = invoiceWithoutTax;
        return this;
    }
    public String getInvoiceWithoutTax() {
        return this.invoiceWithoutTax;
    }

    public CreateHighwayInvoiceRequest setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public CreateHighwayInvoiceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public CreateHighwayInvoiceRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateHighwayInvoiceRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public CreateHighwayInvoiceRequest setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public CreateHighwayInvoiceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
