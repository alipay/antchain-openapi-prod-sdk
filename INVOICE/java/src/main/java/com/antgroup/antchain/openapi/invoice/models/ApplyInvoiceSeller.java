// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class ApplyInvoiceSeller extends TeaModel {
    // 地址
    /**
     * <strong>example:</strong>
     * <p>上海市黄浦区</p>
     */
    @NameInMap("seller_address")
    public String sellerAddress;

    // 银行账号
    /**
     * <strong>example:</strong>
     * <p>323422244555</p>
     */
    @NameInMap("seller_bank_account")
    @Validation(required = true)
    public String sellerBankAccount;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>招商很行</p>
     */
    @NameInMap("seller_bank_name")
    @Validation(required = true)
    public String sellerBankName;

    // 公司名称
    /**
     * <strong>example:</strong>
     * <p>蚂蚁区块链</p>
     */
    @NameInMap("seller_company_name")
    @Validation(required = true)
    public String sellerCompanyName;

    // 税号
    /**
     * <strong>example:</strong>
     * <p>33453344556</p>
     */
    @NameInMap("seller_tax_no")
    @Validation(required = true)
    public String sellerTaxNo;

    // 电话
    /**
     * <strong>example:</strong>
     * <p>0571-978655</p>
     */
    @NameInMap("seller_telephone")
    @Validation(required = true)
    public String sellerTelephone;

    // 销方机构id
    /**
     * <strong>example:</strong>
     * <p>ZL6</p>
     */
    @NameInMap("seller_inst_id")
    @Validation(required = true)
    public String sellerInstId;

    public static ApplyInvoiceSeller build(java.util.Map<String, ?> map) throws Exception {
        ApplyInvoiceSeller self = new ApplyInvoiceSeller();
        return TeaModel.build(map, self);
    }

    public ApplyInvoiceSeller setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
        return this;
    }
    public String getSellerAddress() {
        return this.sellerAddress;
    }

    public ApplyInvoiceSeller setSellerBankAccount(String sellerBankAccount) {
        this.sellerBankAccount = sellerBankAccount;
        return this;
    }
    public String getSellerBankAccount() {
        return this.sellerBankAccount;
    }

    public ApplyInvoiceSeller setSellerBankName(String sellerBankName) {
        this.sellerBankName = sellerBankName;
        return this;
    }
    public String getSellerBankName() {
        return this.sellerBankName;
    }

    public ApplyInvoiceSeller setSellerCompanyName(String sellerCompanyName) {
        this.sellerCompanyName = sellerCompanyName;
        return this;
    }
    public String getSellerCompanyName() {
        return this.sellerCompanyName;
    }

    public ApplyInvoiceSeller setSellerTaxNo(String sellerTaxNo) {
        this.sellerTaxNo = sellerTaxNo;
        return this;
    }
    public String getSellerTaxNo() {
        return this.sellerTaxNo;
    }

    public ApplyInvoiceSeller setSellerTelephone(String sellerTelephone) {
        this.sellerTelephone = sellerTelephone;
        return this;
    }
    public String getSellerTelephone() {
        return this.sellerTelephone;
    }

    public ApplyInvoiceSeller setSellerInstId(String sellerInstId) {
        this.sellerInstId = sellerInstId;
        return this;
    }
    public String getSellerInstId() {
        return this.sellerInstId;
    }

}
