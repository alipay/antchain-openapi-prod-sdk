// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class MerchantSettleInfo extends TeaModel {
    // 结算银行卡账号
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("bank_num")
    @Validation(required = true)
    public String bankNum;

    // 联行号 
    /**
     * <strong>example:</strong>
     * <p>123123122134</p>
     */
    @NameInMap("bank_cnap")
    @Validation(required = true)
    public String bankCnap;

    // 结算账户类型 
    // merchant_type=01企业时：ENTERPRISE
    // 03:民办非企业：ENTERPRISE
    // 07个体工商户时：PERSON或 ENTERPRISE
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("bank_account_type")
    @Validation(required = true)
    public String bankAccountType;

    // 支行名称
    /**
     * <strong>example:</strong>
     * <p>招商银行上海支行</p>
     */
    @NameInMap("bank_branch_name")
    public String bankBranchName;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>招商银行</p>
     */
    @NameInMap("bank_name")
    public String bankName;

    public static MerchantSettleInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantSettleInfo self = new MerchantSettleInfo();
        return TeaModel.build(map, self);
    }

    public MerchantSettleInfo setBankNum(String bankNum) {
        this.bankNum = bankNum;
        return this;
    }
    public String getBankNum() {
        return this.bankNum;
    }

    public MerchantSettleInfo setBankCnap(String bankCnap) {
        this.bankCnap = bankCnap;
        return this;
    }
    public String getBankCnap() {
        return this.bankCnap;
    }

    public MerchantSettleInfo setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
        return this;
    }
    public String getBankAccountType() {
        return this.bankAccountType;
    }

    public MerchantSettleInfo setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }
    public String getBankBranchName() {
        return this.bankBranchName;
    }

    public MerchantSettleInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

}
