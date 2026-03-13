// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SettleCardInfo extends TeaModel {
    // 开户支行名
    /**
     * <strong>example:</strong>
     * <p>招商银行杭州高新支行</p>
     */
    @NameInMap("account_branch_name")
    @Validation(required = true)
    public String accountBranchName;

    // 卡户名
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("account_holder_name")
    @Validation(required = true)
    public String accountHolderName;

    // 开户行所在地-市
    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("account_inst_city")
    @Validation(required = true)
    public String accountInstCity;

    // 开户行简称缩写
    /**
     * <strong>example:</strong>
     * <p>CMB</p>
     */
    @NameInMap("account_inst_id")
    @Validation(required = true)
    public String accountInstId;

    // 银行名称
    /**
     * <strong>example:</strong>
     * <p>招商银行</p>
     */
    @NameInMap("account_inst_name")
    @Validation(required = true)
    public String accountInstName;

    // 开户行所在地-省
    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("account_inst_province")
    @Validation(required = true)
    public String accountInstProvince;

    // 银行卡号
    /**
     * <strong>example:</strong>
     * <p>6214855710610408</p>
     */
    @NameInMap("account_no")
    @Validation(required = true)
    public String accountNo;

    // 卡类型
    /**
     * <strong>example:</strong>
     * <p>DC</p>
     */
    @NameInMap("account_type")
    @Validation(required = true)
    public String accountType;

    // 账号使用类型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("usage_type")
    @Validation(required = true)
    public String usageType;

    public static SettleCardInfo build(java.util.Map<String, ?> map) throws Exception {
        SettleCardInfo self = new SettleCardInfo();
        return TeaModel.build(map, self);
    }

    public SettleCardInfo setAccountBranchName(String accountBranchName) {
        this.accountBranchName = accountBranchName;
        return this;
    }
    public String getAccountBranchName() {
        return this.accountBranchName;
    }

    public SettleCardInfo setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        return this;
    }
    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public SettleCardInfo setAccountInstCity(String accountInstCity) {
        this.accountInstCity = accountInstCity;
        return this;
    }
    public String getAccountInstCity() {
        return this.accountInstCity;
    }

    public SettleCardInfo setAccountInstId(String accountInstId) {
        this.accountInstId = accountInstId;
        return this;
    }
    public String getAccountInstId() {
        return this.accountInstId;
    }

    public SettleCardInfo setAccountInstName(String accountInstName) {
        this.accountInstName = accountInstName;
        return this;
    }
    public String getAccountInstName() {
        return this.accountInstName;
    }

    public SettleCardInfo setAccountInstProvince(String accountInstProvince) {
        this.accountInstProvince = accountInstProvince;
        return this;
    }
    public String getAccountInstProvince() {
        return this.accountInstProvince;
    }

    public SettleCardInfo setAccountNo(String accountNo) {
        this.accountNo = accountNo;
        return this;
    }
    public String getAccountNo() {
        return this.accountNo;
    }

    public SettleCardInfo setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public SettleCardInfo setUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    public String getUsageType() {
        return this.usageType;
    }

}
