// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class FeeConfEntityVO extends TeaModel {
    // 计量域配置信息
    @NameInMap("domain_config_param")
    public DomainConfigVO domainConfigParam;

    // 计费计划配置
    @NameInMap("billing_rule_meta")
    public BillingPlanVO billingRuleMeta;

    // 资源包配置
    @NameInMap("res_package_template_meta")
    public java.util.List<RespackageConfVO> resPackageTemplateMeta;

    // 新资源包模板
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("res_package_template_new_meta")
    public java.util.List<ResPackageTemplateNewMeta> resPackageTemplateNewMeta;

    public static FeeConfEntityVO build(java.util.Map<String, ?> map) throws Exception {
        FeeConfEntityVO self = new FeeConfEntityVO();
        return TeaModel.build(map, self);
    }

    public FeeConfEntityVO setDomainConfigParam(DomainConfigVO domainConfigParam) {
        this.domainConfigParam = domainConfigParam;
        return this;
    }
    public DomainConfigVO getDomainConfigParam() {
        return this.domainConfigParam;
    }

    public FeeConfEntityVO setBillingRuleMeta(BillingPlanVO billingRuleMeta) {
        this.billingRuleMeta = billingRuleMeta;
        return this;
    }
    public BillingPlanVO getBillingRuleMeta() {
        return this.billingRuleMeta;
    }

    public FeeConfEntityVO setResPackageTemplateMeta(java.util.List<RespackageConfVO> resPackageTemplateMeta) {
        this.resPackageTemplateMeta = resPackageTemplateMeta;
        return this;
    }
    public java.util.List<RespackageConfVO> getResPackageTemplateMeta() {
        return this.resPackageTemplateMeta;
    }

    public FeeConfEntityVO setResPackageTemplateNewMeta(java.util.List<ResPackageTemplateNewMeta> resPackageTemplateNewMeta) {
        this.resPackageTemplateNewMeta = resPackageTemplateNewMeta;
        return this;
    }
    public java.util.List<ResPackageTemplateNewMeta> getResPackageTemplateNewMeta() {
        return this.resPackageTemplateNewMeta;
    }

}
