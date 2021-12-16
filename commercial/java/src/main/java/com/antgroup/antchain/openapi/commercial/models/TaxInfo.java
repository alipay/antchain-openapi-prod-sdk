// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class TaxInfo extends TeaModel {
    // 纳税人名称
    @NameInMap("taxpayer_name")
    @Validation(required = true)
    public String taxpayerName;

    // 纳税人识别号
    @NameInMap("taxpayer_no")
    @Validation(required = true)
    public String taxpayerNo;

    // 开户行名称
    @NameInMap("bank_name")
    public String bankName;

    // 开户行账号
    @NameInMap("bank_account")
    public String bankAccount;

    // 开户行地址
    @NameInMap("address")
    public String address;

    // 开户行电话
    @NameInMap("telephone")
    public String telephone;

    public static TaxInfo build(java.util.Map<String, ?> map) throws Exception {
        TaxInfo self = new TaxInfo();
        return TeaModel.build(map, self);
    }

    public TaxInfo setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
        return this;
    }
    public String getTaxpayerName() {
        return this.taxpayerName;
    }

    public TaxInfo setTaxpayerNo(String taxpayerNo) {
        this.taxpayerNo = taxpayerNo;
        return this;
    }
    public String getTaxpayerNo() {
        return this.taxpayerNo;
    }

    public TaxInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public TaxInfo setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public TaxInfo setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public TaxInfo setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

}
