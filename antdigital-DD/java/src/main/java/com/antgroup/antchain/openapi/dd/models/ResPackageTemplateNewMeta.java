// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ResPackageTemplateNewMeta extends TeaModel {
    // 资源包code
    /**
     * <strong>example:</strong>
     * <p>test_deadline</p>
     */
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 资源包模板类型
    /**
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    // 抵扣类型
    /**
     * <strong>example:</strong>
     * <p>deadline</p>
     */
    @NameInMap("deduct_type")
    @Validation(required = true)
    public String deductType;

    // 资源包l5code
    /**
     * <strong>example:</strong>
     * <p>testcode</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 资源包serviceCode
    /**
     * <strong>example:</strong>
     * <p>serviceCode</p>
     */
    @NameInMap("product_name")
    @Validation(required = true)
    public String productName;

    // 资源包模板名称
    /**
     * <strong>example:</strong>
     * <p>测试资源包模板</p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 可抵扣的l5code
    /**
     * <strong>example:</strong>
     * <p>testcode</p>
     */
    @NameInMap("applicable_product_name")
    @Validation(required = true)
    public String applicableProductName;

    // 收费事件码
    /**
     * <strong>example:</strong>
     * <p>eventcode</p>
     */
    @NameInMap("prod_event_code")
    public String prodEventCode;

    // 抵扣优先级
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("priority")
    public String priority;

    // 是否可续费
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("renewable")
    public Boolean renewable;

    // 是否可升级
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("upgradable")
    public Boolean upgradable;

    // 单位转换关系
    /**
     * <strong>example:</strong>
     * <p>[{&quot;ratio&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;次&quot;,&quot;roundMode&quot;:7,&quot;scale&quot;:0},{&quot;ratio&quot;:&quot;10000&quot;,&quot;unit&quot;:&quot;万次&quot;,&quot;roundMode&quot;:4,&quot;scale&quot;:4}]</p>
     */
    @NameInMap("unit_key")
    @Validation(required = true)
    public String unitKey;

    // 是否计算金额
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("calc_amount")
    @Validation(required = true)
    public Boolean calcAmount;

    // 是否使用子包
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sub_pack")
    @Validation(required = true)
    public Boolean subPack;

    // 子包切分规则
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("sub_pack_split_type")
    public String subPackSplitType;

    // 关联子包模版
    /**
     * <strong>example:</strong>
     * <p>test_deadline</p>
     */
    @NameInMap("rel_template")
    public String relTemplate;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>effect</p>
     */
    @NameInMap("status")
    public String status;

    // 资源包约束元数据列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("resource_package_constraint_metas")
    public java.util.List<ResourcePackageConstraintMeta> resourcePackageConstraintMetas;

    public static ResPackageTemplateNewMeta build(java.util.Map<String, ?> map) throws Exception {
        ResPackageTemplateNewMeta self = new ResPackageTemplateNewMeta();
        return TeaModel.build(map, self);
    }

    public ResPackageTemplateNewMeta setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ResPackageTemplateNewMeta setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ResPackageTemplateNewMeta setDeductType(String deductType) {
        this.deductType = deductType;
        return this;
    }
    public String getDeductType() {
        return this.deductType;
    }

    public ResPackageTemplateNewMeta setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ResPackageTemplateNewMeta setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public ResPackageTemplateNewMeta setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ResPackageTemplateNewMeta setApplicableProductName(String applicableProductName) {
        this.applicableProductName = applicableProductName;
        return this;
    }
    public String getApplicableProductName() {
        return this.applicableProductName;
    }

    public ResPackageTemplateNewMeta setProdEventCode(String prodEventCode) {
        this.prodEventCode = prodEventCode;
        return this;
    }
    public String getProdEventCode() {
        return this.prodEventCode;
    }

    public ResPackageTemplateNewMeta setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public ResPackageTemplateNewMeta setRenewable(Boolean renewable) {
        this.renewable = renewable;
        return this;
    }
    public Boolean getRenewable() {
        return this.renewable;
    }

    public ResPackageTemplateNewMeta setUpgradable(Boolean upgradable) {
        this.upgradable = upgradable;
        return this;
    }
    public Boolean getUpgradable() {
        return this.upgradable;
    }

    public ResPackageTemplateNewMeta setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }
    public String getUnitKey() {
        return this.unitKey;
    }

    public ResPackageTemplateNewMeta setCalcAmount(Boolean calcAmount) {
        this.calcAmount = calcAmount;
        return this;
    }
    public Boolean getCalcAmount() {
        return this.calcAmount;
    }

    public ResPackageTemplateNewMeta setSubPack(Boolean subPack) {
        this.subPack = subPack;
        return this;
    }
    public Boolean getSubPack() {
        return this.subPack;
    }

    public ResPackageTemplateNewMeta setSubPackSplitType(String subPackSplitType) {
        this.subPackSplitType = subPackSplitType;
        return this;
    }
    public String getSubPackSplitType() {
        return this.subPackSplitType;
    }

    public ResPackageTemplateNewMeta setRelTemplate(String relTemplate) {
        this.relTemplate = relTemplate;
        return this;
    }
    public String getRelTemplate() {
        return this.relTemplate;
    }

    public ResPackageTemplateNewMeta setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ResPackageTemplateNewMeta setResourcePackageConstraintMetas(java.util.List<ResourcePackageConstraintMeta> resourcePackageConstraintMetas) {
        this.resourcePackageConstraintMetas = resourcePackageConstraintMetas;
        return this;
    }
    public java.util.List<ResourcePackageConstraintMeta> getResourcePackageConstraintMetas() {
        return this.resourcePackageConstraintMetas;
    }

}
