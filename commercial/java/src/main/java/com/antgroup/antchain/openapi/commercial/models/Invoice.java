// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class Invoice extends TeaModel {
    // 主键id
    @NameInMap("id")
    public Long id;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 纳税人类型
    @NameInMap("taxpayer_type")
    @Validation(required = true)
    public String taxpayerType;

    // 纳税人名称
    @NameInMap("taxpayer_name")
    public String taxpayerName;

    // 纳税人识别号
    @NameInMap("taxpayer_no")
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

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 唯一id
    @NameInMap("unique_id")
    public String uniqueId;

    public static Invoice build(java.util.Map<String, ?> map) throws Exception {
        Invoice self = new Invoice();
        return TeaModel.build(map, self);
    }

    public Invoice setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Invoice setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Invoice setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType;
        return this;
    }
    public String getTaxpayerType() {
        return this.taxpayerType;
    }

    public Invoice setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
        return this;
    }
    public String getTaxpayerName() {
        return this.taxpayerName;
    }

    public Invoice setTaxpayerNo(String taxpayerNo) {
        this.taxpayerNo = taxpayerNo;
        return this;
    }
    public String getTaxpayerNo() {
        return this.taxpayerNo;
    }

    public Invoice setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public Invoice setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }
    public String getBankAccount() {
        return this.bankAccount;
    }

    public Invoice setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public Invoice setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public Invoice setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Invoice setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Invoice setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }
    public String getUniqueId() {
        return this.uniqueId;
    }

}
