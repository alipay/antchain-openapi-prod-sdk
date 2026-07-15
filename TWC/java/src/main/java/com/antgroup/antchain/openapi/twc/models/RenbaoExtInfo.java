// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class RenbaoExtInfo extends TeaModel {
    // 银行区域代码，可网上查询各银行最新对应的区域代码，比如杭州的区域代码为：3301
    /**
     * <strong>example:</strong>
     * <p>3301</p>
     */
    @NameInMap("rec_bank_area_code")
    @Validation(required = true, maxLength = 8)
    public String recBankAreaCode;

    // 投保人收款账号
    /**
     * <strong>example:</strong>
     * <p>8765123556748921</p>
     */
    @NameInMap("account_no")
    @Validation(required = true, maxLength = 32)
    public String accountNo;

    // 完整银行名称，不需要具体到分行
    /**
     * <strong>example:</strong>
     * <p>工商银行</p>
     */
    @NameInMap("bank_name")
    @Validation(required = true, maxLength = 32)
    public String bankName;

    // 投保人户名
    /**
     * <strong>example:</strong>
     * <p>XXXXX有限公司</p>
     */
    @NameInMap("account_name")
    @Validation(required = true, maxLength = 64)
    public String accountName;

    // 联行号
    /**
     * <strong>example:</strong>
     * <p>827330119378</p>
     */
    @NameInMap("cnaps")
    @Validation(required = true, maxLength = 16)
    public String cnaps;

    // 统一社会信用代码
    /**
     * <strong>example:</strong>
     * <p>173829930011029381</p>
     */
    @NameInMap("identify_no")
    @Validation(required = true, maxLength = 32)
    public String identifyNo;

    // 银行代码
    /**
     * <strong>example:</strong>
     * <p>BOC</p>
     */
    @NameInMap("bank_code")
    @Validation(required = true, maxLength = 16)
    public String bankCode;

    public static RenbaoExtInfo build(java.util.Map<String, ?> map) throws Exception {
        RenbaoExtInfo self = new RenbaoExtInfo();
        return TeaModel.build(map, self);
    }

    public RenbaoExtInfo setRecBankAreaCode(String recBankAreaCode) {
        this.recBankAreaCode = recBankAreaCode;
        return this;
    }
    public String getRecBankAreaCode() {
        return this.recBankAreaCode;
    }

    public RenbaoExtInfo setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public RenbaoExtInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public RenbaoExtInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RenbaoExtInfo setCnaps(String cnaps) {
        this.cnaps = cnaps;
        return this;
    }
    public String getCnaps() {
        return this.cnaps;
    }

    public RenbaoExtInfo setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
        return this;
    }
    public String getIdentifyNo() {
        return this.identifyNo;
    }

    public RenbaoExtInfo setBankCode(String bankCode) {
        this.bankCode = bankCode;
        return this;
    }
    public String getBankCode() {
        return this.bankCode;
    }

}
