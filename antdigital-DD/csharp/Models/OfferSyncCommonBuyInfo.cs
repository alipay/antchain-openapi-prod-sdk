// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品同步common_buy内容
    public class OfferSyncCommonBuyInfo : TeaModel {
        // 商品列表配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;cyCode&quot;:&quot;KXSFFM00329522&quot;,&quot;cyCodeType&quot;:&quot;L5&quot;,&quot;description&quot;:&quot;&quot;,&quot;gmtCreate&quot;:1768268723555,&quot;gmtModified&quot;:1768268723555,&quot;h5Mage&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;pcImage&quot;:&quot;&quot;,&quot;relateOu&quot;:&quot;ZL6&quot;,&quot;relateSaleCode&quot;:&quot;KXSFFSZL600314529&quot;,&quot;relateSaleName&quot;:&quot;企业版&quot;}</para>
        /// </summary>
        [NameInMap("common_buy_sale_group_list_json")]
        [Validation(Required=true)]
        public List<string> CommonBuySaleGroupListJson { get; set; }

        // 规格配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;attrCode&quot;:&quot;L0735&quot;,&quot;id&quot;:4459268,&quot;offerCode&quot;:&quot;DJKXFM01233589&quot;}</para>
        /// </summary>
        [NameInMap("offer_attr_list_json")]
        [Validation(Required=true)]
        public List<string> OfferAttrListJson { get; set; }

        // Region配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;aliyunRegionCode&quot;:&quot;&quot;,&quot;id&quot;:1,&quot;instCode&quot;:&quot;&quot;,&quot;regionCode&quot;:&quot;&quot;,&quot;regionName&quot;:&quot;&quot;,&quot;type&quot;:&quot;&quot;,&quot;zoneRange&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("prod_offer_region_list_json")]
        [Validation(Required=true)]
        public List<string> ProdOfferRegionListJson { get; set; }

        // 费用项配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;attrGroupCode&quot;:&quot;&quot;,&quot;attrGroupName&quot;:&quot;&quot;,&quot;attrGroupType&quot;:&quot;&quot;,&quot;feeExpress&quot;:&quot;&quot;,&quot;feeExpressMap&quot;:{},&quot;feeList&quot;:[{&quot;attrGroupCode&quot;:&quot;&quot;,&quot;attrGroupName&quot;:&quot;&quot;,&quot;fee&quot;:&quot;&quot;,&quot;feeAttr&quot;:&quot;&quot;,&quot;feeId&quot;:0,&quot;id&quot;:0,&quot;remark&quot;:&quot;&quot;}],&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("offer_attr_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferAttrGroupListJson { get; set; }

        // 属性配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;attrCode&quot;:&quot;&quot;,&quot;defaultValue&quot;:&quot;&quot;,&quot;displayName&quot;:&quot;&quot;,&quot;express&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;offerVersion&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;tip&quot;:&quot;&quot;,&quot;valueRange&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("offer_extend_attr_list_json")]
        [Validation(Required=true)]
        public List<string> OfferExtendAttrListJson { get; set; }

        // 界面归类配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;displayName&quot;:&quot;&quot;,&quot;groupCode&quot;:&quot;&quot;,&quot;id&quot;:1,&quot;memberList&quot;:[{&quot;buyDisplay&quot;:&quot;&quot;,&quot;componentCode&quot;:&quot;&quot;,&quot;displayType&quot;:&quot;&quot;,&quot;groupId&quot;:0,&quot;id&quot;:0,&quot;label&quot;:&quot;&quot;,&quot;labelDisplay&quot;:&quot;&quot;,&quot;required&quot;:&quot;&quot;,&quot;sortId&quot;:0,&quot;upgradeDisplay&quot;:&quot;&quot;}],&quot;offerCode&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;seqOrder&quot;:1}</para>
        /// </summary>
        [NameInMap("offer_common_buy_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferCommonBuyGroupListJson { get; set; }

        // 规格约束配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;cond&quot;:&quot;&quot;,&quot;condType&quot;:&quot;&quot;,&quot;constraintName&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;offerCode&quot;:&quot;&quot;,&quot;offerUniqueVid&quot;:&quot;&quot;,&quot;orderType&quot;:&quot;&quot;,&quot;remark&quot;:&quot;&quot;,&quot;result&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("offer_attr_constraints_list_json")]
        [Validation(Required=true)]
        public List<string> OfferAttrConstraintsListJson { get; set; }

        // 售卖规则配置 ListJson字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;actionParam&quot;:&quot;&quot;,&quot;groupIndex&quot;:0,&quot;groupName&quot;:&quot;&quot;,&quot;id&quot;:0,&quot;memberList&quot;:[{&quot;groupId&quot;:0,&quot;id&quot;:0,&quot;isNegative&quot;:false,&quot;onlyLogin&quot;:&quot;&quot;,&quot;paramStr&quot;:&quot;&quot;,&quot;ruleCode&quot;:&quot;&quot;,&quot;ruleIndex&quot;:0,&quot;ruleScript&quot;:&quot;&quot;,&quot;ruleType&quot;:&quot;&quot;}],&quot;remark&quot;:&quot;&quot;,&quot;ruleEventCode&quot;:&quot;&quot;}</para>
        /// </summary>
        [NameInMap("offer_rule_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferRuleGroupListJson { get; set; }

    }

}
