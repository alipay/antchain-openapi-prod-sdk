// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class RespackageConfVO extends TeaModel {
    // 模板code
    /**
     * <strong>example:</strong>
     * <p>test_deadline</p>
     */
    @NameInMap("template_code")
    public String templateCode;

    // 模板展示名称
    /**
     * <strong>example:</strong>
     * <p>资源包模板</p>
     */
    @NameInMap("template_name")
    public String templateName;

    // 资源包模板维度
    /**
     * <strong>example:</strong>
     * <p>Single</p>
     */
    @NameInMap("template_dimension")
    public String templateDimension;

    // 产品名称 -> 商品模型2.0中的渠道产品Code
    /**
     * <strong>example:</strong>
     * <p>testcode</p>
     */
    @NameInMap("product_code")
    public String productCode;

    // 商品名称 -> 商品模型2.0中的offerInnerCode
    /**
     * <strong>example:</strong>
     * <p>testcode</p>
     */
    @NameInMap("offer_code")
    public String offerCode;

    // 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
    @NameInMap("deduct_product_code")
    public java.util.List<String> deductProductCode;

    // 抵扣的量价商品与计量项的关系
    @NameInMap("deduct_oms_field")
    public java.util.List<DeductOmsField> deductOmsField;

    // 资源包抵扣类型
    /**
     * <strong>example:</strong>
     * <p>PeriodMonthly</p>
     */
    @NameInMap("deduct_type")
    public String deductType;

    // 产时的规格约束
    @NameInMap("specification")
    public java.util.List<StringMap> specification;

    // 是否计算金额
    @NameInMap("calc_amount")
    public Boolean calcAmount;

    // 是否使用子包
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("sub_pack")
    public Boolean subPack;

    // 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("sub_pack_split_type")
    public String subPackSplitType;

    // 关联子包模版
    /**
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("rel_template")
    public String relTemplate;

    public static RespackageConfVO build(java.util.Map<String, ?> map) throws Exception {
        RespackageConfVO self = new RespackageConfVO();
        return TeaModel.build(map, self);
    }

    public RespackageConfVO setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public RespackageConfVO setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public RespackageConfVO setTemplateDimension(String templateDimension) {
        this.templateDimension = templateDimension;
        return this;
    }
    public String getTemplateDimension() {
        return this.templateDimension;
    }

    public RespackageConfVO setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RespackageConfVO setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public RespackageConfVO setDeductProductCode(java.util.List<String> deductProductCode) {
        this.deductProductCode = deductProductCode;
        return this;
    }
    public java.util.List<String> getDeductProductCode() {
        return this.deductProductCode;
    }

    public RespackageConfVO setDeductOmsField(java.util.List<DeductOmsField> deductOmsField) {
        this.deductOmsField = deductOmsField;
        return this;
    }
    public java.util.List<DeductOmsField> getDeductOmsField() {
        return this.deductOmsField;
    }

    public RespackageConfVO setDeductType(String deductType) {
        this.deductType = deductType;
        return this;
    }
    public String getDeductType() {
        return this.deductType;
    }

    public RespackageConfVO setSpecification(java.util.List<StringMap> specification) {
        this.specification = specification;
        return this;
    }
    public java.util.List<StringMap> getSpecification() {
        return this.specification;
    }

    public RespackageConfVO setCalcAmount(Boolean calcAmount) {
        this.calcAmount = calcAmount;
        return this;
    }
    public Boolean getCalcAmount() {
        return this.calcAmount;
    }

    public RespackageConfVO setSubPack(Boolean subPack) {
        this.subPack = subPack;
        return this;
    }
    public Boolean getSubPack() {
        return this.subPack;
    }

    public RespackageConfVO setSubPackSplitType(String subPackSplitType) {
        this.subPackSplitType = subPackSplitType;
        return this;
    }
    public String getSubPackSplitType() {
        return this.subPackSplitType;
    }

    public RespackageConfVO setRelTemplate(String relTemplate) {
        this.relTemplate = relTemplate;
        return this;
    }
    public String getRelTemplate() {
        return this.relTemplate;
    }

}
