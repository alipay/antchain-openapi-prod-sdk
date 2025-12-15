// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a1f82644937c486c81a62b0e5a6b4fbe.models;

import com.aliyun.tea.*;

public class AbilityInfo extends TeaModel {
    // 能力编号
    /**
     * <strong>example:</strong>
     * <p>ak_3821c8f0145440dab91b9b23edb1dc73</p>
     */
    @NameInMap("ability_id")
    @Validation(required = true)
    public String abilityId;

    // 能力名称
    /**
     * <strong>example:</strong>
     * <p>B2B支付网关</p>
     */
    @NameInMap("ability_name")
    @Validation(required = true)
    public String abilityName;

    // 研发负责人
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("dev_owner")
    @Validation(required = true)
    public String devOwner;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2021-12-30 00:00:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 描述信息
    /**
     * <strong>example:</strong>
     * <p>适用场景：企业资金支付场景   适合行业：存在企业采购/企业充值/企业转账等企业支付场景的行业   归属行业线：B类基础产品   产品描述：将交易场景与企业对公账户支付线上关联，订单交易对应的支付需求自动发送给企业网银做财务支出的确认和复核。</p>
     */
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 研发负责人邮箱前缀
    /**
     * <strong>example:</strong>
     * <p>qiujianglong.qjl</p>
     */
    @NameInMap("dev_owner_prefix_email")
    @Validation(required = true)
    public String devOwnerPrefixEmail;

    // 产品负责人
    /**
     * <strong>example:</strong>
     * <p>江来</p>
     */
    @NameInMap("product_owner")
    @Validation(required = true)
    public String productOwner;

    // 能力对应商业中台L5Code
    /**
     * <strong>example:</strong>
     * <p>DMZNFM00883001</p>
     */
    @NameInMap("business_code")
    public String businessCode;

    // apiInfoModels列表
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("api_info_models")
    @Validation(required = true)
    public java.util.List<ApiInfoModel> apiInfoModels;

    // 能力sla看板url
    /**
     * <strong>example:</strong>
     * <p><a href="https://antslo.alipay.com/maas/slistd/115600116/std/d/147100480_slistd?var-tag1=xxx&var-tag2=All">https://antslo.alipay.com/maas/slistd/115600116/std/d/147100480_slistd?var-tag1=xxx&amp;var-tag2=All</a></p>
     */
    @NameInMap("sla_url")
    public String slaUrl;

    public static AbilityInfo build(java.util.Map<String, ?> map) throws Exception {
        AbilityInfo self = new AbilityInfo();
        return TeaModel.build(map, self);
    }

    public AbilityInfo setAbilityId(String abilityId) {
        this.abilityId = abilityId;
        return this;
    }
    public String getAbilityId() {
        return this.abilityId;
    }

    public AbilityInfo setAbilityName(String abilityName) {
        this.abilityName = abilityName;
        return this;
    }
    public String getAbilityName() {
        return this.abilityName;
    }

    public AbilityInfo setDevOwner(String devOwner) {
        this.devOwner = devOwner;
        return this;
    }
    public String getDevOwner() {
        return this.devOwner;
    }

    public AbilityInfo setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AbilityInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AbilityInfo setDevOwnerPrefixEmail(String devOwnerPrefixEmail) {
        this.devOwnerPrefixEmail = devOwnerPrefixEmail;
        return this;
    }
    public String getDevOwnerPrefixEmail() {
        return this.devOwnerPrefixEmail;
    }

    public AbilityInfo setProductOwner(String productOwner) {
        this.productOwner = productOwner;
        return this;
    }
    public String getProductOwner() {
        return this.productOwner;
    }

    public AbilityInfo setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public AbilityInfo setApiInfoModels(java.util.List<ApiInfoModel> apiInfoModels) {
        this.apiInfoModels = apiInfoModels;
        return this;
    }
    public java.util.List<ApiInfoModel> getApiInfoModels() {
        return this.apiInfoModels;
    }

    public AbilityInfo setSlaUrl(String slaUrl) {
        this.slaUrl = slaUrl;
        return this;
    }
    public String getSlaUrl() {
        return this.slaUrl;
    }

}
