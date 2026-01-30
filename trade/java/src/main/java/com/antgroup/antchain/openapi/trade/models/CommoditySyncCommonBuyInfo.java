// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommoditySyncCommonBuyInfo extends TeaModel {
    // 商品列表配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;cyCode&quot;:&quot;KXSFFM00329522&quot;,&quot;cyCodeType&quot;:&quot;L5&quot;,&quot;description&quot;:&quot;&quot;,&quot;gmtCreate&quot;:1768268723555,&quot;gmtModified&quot;:1768268723555,&quot;h5Mage&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;pcImage&quot;:&quot;&quot;,&quot;relateOu&quot;:&quot;ZL6&quot;,&quot;relateSaleCode&quot;:&quot;KXSFFSZL600314529&quot;,&quot;relateSaleName&quot;:&quot;企业版&quot;}</p>
     */
    @NameInMap("common_buy_sale_group_list_json")
    @Validation(required = true)
    public java.util.List<String> commonBuySaleGroupListJson;

    // 规格配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;attrCode&quot;:&quot;L0735&quot;,&quot;id&quot;:4459268,&quot;offerCode&quot;:&quot;DJKXFM01233589&quot;}</p>
     */
    @NameInMap("offer_attr_list_json")
    @Validation(required = true)
    public java.util.List<String> offerAttrListJson;

    // Region配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;aliyunRegionCode&quot;:&quot;&quot;,&quot;id&quot;:1,&quot;instCode&quot;:&quot;&quot;,&quot;regionCode&quot;:&quot;&quot;,&quot;regionName&quot;:&quot;&quot;,&quot;type&quot;:&quot;&quot;,&quot;zoneRange&quot;:&quot;&quot;}</p>
     */
    @NameInMap("prod_offer_region_list_json")
    @Validation(required = true)
    public java.util.List<String> prodOfferRegionListJson;

    // 费用项配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;attrGroupCode&quot;:&quot;&quot;,&quot;attrGroupName&quot;:&quot;&quot;,&quot;attrGroupType&quot;:&quot;&quot;,&quot;feeExpress&quot;:&quot;&quot;,&quot;feeExpressMap&quot;:{},&quot;feeList&quot;:[{&quot;attrGroupCode&quot;:&quot;&quot;,&quot;attrGroupName&quot;:&quot;&quot;,&quot;fee&quot;:&quot;&quot;,&quot;feeAttr&quot;:&quot;&quot;,&quot;feeId&quot;:0,&quot;id&quot;:0,&quot;remark&quot;:&quot;&quot;}],&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;}</p>
     */
    @NameInMap("offer_attr_group_list_json")
    @Validation(required = true)
    public java.util.List<String> offerAttrGroupListJson;

    // 属性配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;attrCode&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;displayName&quot;:&quot;&quot;,&quot;express&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;offerVersion&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;tip&quot;:&quot;&quot;,&quot;valueRange&quot;:&quot;&quot;}</p>
     */
    @NameInMap("offer_extend_attr_list_json")
    @Validation(required = true)
    public java.util.List<String> offerExtendAttrListJson;

    // 界面归类配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;displayName&quot;:&quot;&quot;,&quot;groupCode&quot;:&quot;&quot;,&quot;id&quot;:1,&quot;memberList&quot;:[{&quot;buyDisplay&quot;:&quot;&quot;,&quot;componentCode&quot;:&quot;&quot;,&quot;displayType&quot;:&quot;&quot;,&quot;groupId&quot;:0,&quot;id&quot;:0,&quot;label&quot;:&quot;&quot;,&quot;labelDisplay&quot;:&quot;&quot;,&quot;required&quot;:&quot;&quot;,&quot;sortId&quot;:0,&quot;upgradeDisplay&quot;:&quot;&quot;}],&quot;offerCode&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;seqOrder&quot;:1}</p>
     */
    @NameInMap("offer_common_buy_group_list_json")
    @Validation(required = true)
    public java.util.List<String> offerCommonBuyGroupListJson;

    // 规格约束配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;cond&quot;:&quot;&quot;,&quot;condType&quot;:&quot;&quot;,&quot;constraintName&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;offerUniqueVid&quot;:&quot;&quot;,&quot;orderType&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;result&quot;:&quot;&quot;}</p>
     */
    @NameInMap("offer_attr_constraints_list_fson")
    @Validation(required = true)
    public java.util.List<String> offerAttrConstraintsListFson;

    // 售卖规则配置 ListJson字符串
    /**
     * <strong>example:</strong>
     * <p>{&quot;actionParam&quot;:&quot;&quot;,&quot;groupIndex&quot;:0,&quot;groupName&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;memberList&quot;:[{&quot;groupId&quot;:0,&quot;id&quot;:0,&quot;isNegative&quot;:false,&quot;onlyLogin&quot;:&quot;&quot;,&quot;paramStr&quot;:&quot;&quot;,&quot;ruleCode&quot;:&quot;&quot;,&quot;ruleIndex&quot;:0,&quot;ruleScript&quot;:&quot;&quot;,&quot;ruleType&quot;:&quot;&quot;}],&quot;remark&quot;:&quot;&quot;,&quot;ruleEventCode&quot;:&quot;&quot;}</p>
     */
    @NameInMap("offer_rule_group_list_json")
    @Validation(required = true)
    public java.util.List<String> offerRuleGroupListJson;

    public static CommoditySyncCommonBuyInfo build(java.util.Map<String, ?> map) throws Exception {
        CommoditySyncCommonBuyInfo self = new CommoditySyncCommonBuyInfo();
        return TeaModel.build(map, self);
    }

    public CommoditySyncCommonBuyInfo setCommonBuySaleGroupListJson(java.util.List<String> commonBuySaleGroupListJson) {
        this.commonBuySaleGroupListJson = commonBuySaleGroupListJson;
        return this;
    }
    public java.util.List<String> getCommonBuySaleGroupListJson() {
        return this.commonBuySaleGroupListJson;
    }

    public CommoditySyncCommonBuyInfo setOfferAttrListJson(java.util.List<String> offerAttrListJson) {
        this.offerAttrListJson = offerAttrListJson;
        return this;
    }
    public java.util.List<String> getOfferAttrListJson() {
        return this.offerAttrListJson;
    }

    public CommoditySyncCommonBuyInfo setProdOfferRegionListJson(java.util.List<String> prodOfferRegionListJson) {
        this.prodOfferRegionListJson = prodOfferRegionListJson;
        return this;
    }
    public java.util.List<String> getProdOfferRegionListJson() {
        return this.prodOfferRegionListJson;
    }

    public CommoditySyncCommonBuyInfo setOfferAttrGroupListJson(java.util.List<String> offerAttrGroupListJson) {
        this.offerAttrGroupListJson = offerAttrGroupListJson;
        return this;
    }
    public java.util.List<String> getOfferAttrGroupListJson() {
        return this.offerAttrGroupListJson;
    }

    public CommoditySyncCommonBuyInfo setOfferExtendAttrListJson(java.util.List<String> offerExtendAttrListJson) {
        this.offerExtendAttrListJson = offerExtendAttrListJson;
        return this;
    }
    public java.util.List<String> getOfferExtendAttrListJson() {
        return this.offerExtendAttrListJson;
    }

    public CommoditySyncCommonBuyInfo setOfferCommonBuyGroupListJson(java.util.List<String> offerCommonBuyGroupListJson) {
        this.offerCommonBuyGroupListJson = offerCommonBuyGroupListJson;
        return this;
    }
    public java.util.List<String> getOfferCommonBuyGroupListJson() {
        return this.offerCommonBuyGroupListJson;
    }

    public CommoditySyncCommonBuyInfo setOfferAttrConstraintsListFson(java.util.List<String> offerAttrConstraintsListFson) {
        this.offerAttrConstraintsListFson = offerAttrConstraintsListFson;
        return this;
    }
    public java.util.List<String> getOfferAttrConstraintsListFson() {
        return this.offerAttrConstraintsListFson;
    }

    public CommoditySyncCommonBuyInfo setOfferRuleGroupListJson(java.util.List<String> offerRuleGroupListJson) {
        this.offerRuleGroupListJson = offerRuleGroupListJson;
        return this;
    }
    public java.util.List<String> getOfferRuleGroupListJson() {
        return this.offerRuleGroupListJson;
    }

}
