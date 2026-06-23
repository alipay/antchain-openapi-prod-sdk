// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class BillingFactorMeta extends TeaModel {
    // 费用code
    /**
     * <strong>example:</strong>
     * <p>费用code</p>
     */
    @NameInMap("fee_code")
    public String feeCode;

    // 因子code
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("factor_code")
    public String factorCode;

    // 因子名称
    /**
     * <strong>example:</strong>
     * <p>因子名称</p>
     */
    @NameInMap("factor_name")
    public String factorName;

    // 因子类型
    /**
     * <strong>example:</strong>
     * <p>计费，规格</p>
     */
    @NameInMap("factor_type")
    public String factorType;

    // 因子单位
    /**
     * <strong>example:</strong>
     * <p>元</p>
     */
    @NameInMap("factor_unit")
    public String factorUnit;

    // 计量项code
    /**
     * <strong>example:</strong>
     * <p>计量项code</p>
     */
    @NameInMap("meter_feild_code")
    public String meterFeildCode;

    // 转换比率，用于展示转换
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("factor_ratio")
    public String factorRatio;

    // 是否抵扣资源包
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("deduct_respackage")
    public Boolean deductRespackage;

    // 是否累计
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_cumulative")
    public Boolean isCumulative;

    // 数据来源，配置，计量数据
    /**
     * <strong>example:</strong>
     * <p>use_data</p>
     */
    @NameInMap("val_original")
    public String valOriginal;

    // 默认值
    /**
     * <strong>example:</strong>
     * <p>默认值</p>
     */
    @NameInMap("default_value")
    public String defaultValue;

    // 拓展信息
    /**
     * <strong>example:</strong>
     * <p>拓展信息</p>
     */
    @NameInMap("extra_info")
    public String extraInfo;

    // 订购模型，价格模型
    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("factor_model_type")
    public String factorModelType;

    public static BillingFactorMeta build(java.util.Map<String, ?> map) throws Exception {
        BillingFactorMeta self = new BillingFactorMeta();
        return TeaModel.build(map, self);
    }

    public BillingFactorMeta setFeeCode(String feeCode) {
        this.feeCode = feeCode;
        return this;
    }
    public String getFeeCode() {
        return this.feeCode;
    }

    public BillingFactorMeta setFactorCode(String factorCode) {
        this.factorCode = factorCode;
        return this;
    }
    public String getFactorCode() {
        return this.factorCode;
    }

    public BillingFactorMeta setFactorName(String factorName) {
        this.factorName = factorName;
        return this;
    }
    public String getFactorName() {
        return this.factorName;
    }

    public BillingFactorMeta setFactorType(String factorType) {
        this.factorType = factorType;
        return this;
    }
    public String getFactorType() {
        return this.factorType;
    }

    public BillingFactorMeta setFactorUnit(String factorUnit) {
        this.factorUnit = factorUnit;
        return this;
    }
    public String getFactorUnit() {
        return this.factorUnit;
    }

    public BillingFactorMeta setMeterFeildCode(String meterFeildCode) {
        this.meterFeildCode = meterFeildCode;
        return this;
    }
    public String getMeterFeildCode() {
        return this.meterFeildCode;
    }

    public BillingFactorMeta setFactorRatio(String factorRatio) {
        this.factorRatio = factorRatio;
        return this;
    }
    public String getFactorRatio() {
        return this.factorRatio;
    }

    public BillingFactorMeta setDeductRespackage(Boolean deductRespackage) {
        this.deductRespackage = deductRespackage;
        return this;
    }
    public Boolean getDeductRespackage() {
        return this.deductRespackage;
    }

    public BillingFactorMeta setIsCumulative(Boolean isCumulative) {
        this.isCumulative = isCumulative;
        return this;
    }
    public Boolean getIsCumulative() {
        return this.isCumulative;
    }

    public BillingFactorMeta setValOriginal(String valOriginal) {
        this.valOriginal = valOriginal;
        return this;
    }
    public String getValOriginal() {
        return this.valOriginal;
    }

    public BillingFactorMeta setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public BillingFactorMeta setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public BillingFactorMeta setFactorModelType(String factorModelType) {
        this.factorModelType = factorModelType;
        return this;
    }
    public String getFactorModelType() {
        return this.factorModelType;
    }

}
