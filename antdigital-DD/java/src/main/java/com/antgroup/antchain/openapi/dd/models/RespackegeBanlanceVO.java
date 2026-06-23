// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class RespackegeBanlanceVO extends TeaModel {
    // 资源包商品编码
    /**
     * <strong>example:</strong>
     * <p>ZLPTFM01221964</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 资源包模板编码
    /**
     * <strong>example:</strong>
     * <p>ZNHYFM01222350_Deadline</p>
     */
    @NameInMap("tempalte_name")
    @Validation(required = true)
    public String tempalteName;

    // 资源包展示名称
    /**
     * <strong>example:</strong>
     * <p>credits资源包(加油包)</p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 初始容量
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("initial_capacity")
    @Validation(required = true)
    public String initialCapacity;

    // 当前余量
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("current_capacity")
    @Validation(required = true)
    public String currentCapacity;

    // 总金额
    @NameInMap("total_fund")
    @Validation(required = true)
    public MultiCurrencyMoney totalFund;

    // 剩余金额
    // 
    @NameInMap("remain_fund")
    @Validation(required = true)
    public MultiCurrencyMoney remainFund;

    public static RespackegeBanlanceVO build(java.util.Map<String, ?> map) throws Exception {
        RespackegeBanlanceVO self = new RespackegeBanlanceVO();
        return TeaModel.build(map, self);
    }

    public RespackegeBanlanceVO setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RespackegeBanlanceVO setTempalteName(String tempalteName) {
        this.tempalteName = tempalteName;
        return this;
    }
    public String getTempalteName() {
        return this.tempalteName;
    }

    public RespackegeBanlanceVO setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RespackegeBanlanceVO setInitialCapacity(String initialCapacity) {
        this.initialCapacity = initialCapacity;
        return this;
    }
    public String getInitialCapacity() {
        return this.initialCapacity;
    }

    public RespackegeBanlanceVO setCurrentCapacity(String currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }
    public String getCurrentCapacity() {
        return this.currentCapacity;
    }

    public RespackegeBanlanceVO setTotalFund(MultiCurrencyMoney totalFund) {
        this.totalFund = totalFund;
        return this;
    }
    public MultiCurrencyMoney getTotalFund() {
        return this.totalFund;
    }

    public RespackegeBanlanceVO setRemainFund(MultiCurrencyMoney remainFund) {
        this.remainFund = remainFund;
        return this;
    }
    public MultiCurrencyMoney getRemainFund() {
        return this.remainFund;
    }

}
