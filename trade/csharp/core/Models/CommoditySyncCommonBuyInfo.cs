// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 商品同步common_buy内容
    public class CommoditySyncCommonBuyInfo : TeaModel {
        // 商品列表配置 ListJson字符串
        [NameInMap("common_buy_sale_group_list_json")]
        [Validation(Required=true)]
        public List<string> CommonBuySaleGroupListJson { get; set; }

        // 规格配置 ListJson字符串
        [NameInMap("offer_attr_list_json")]
        [Validation(Required=true)]
        public List<string> OfferAttrListJson { get; set; }

        // Region配置 ListJson字符串
        [NameInMap("prod_offer_region_list_json")]
        [Validation(Required=true)]
        public List<string> ProdOfferRegionListJson { get; set; }

        // 费用项配置 ListJson字符串
        [NameInMap("offer_attr_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferAttrGroupListJson { get; set; }

        // 属性配置 ListJson字符串
        [NameInMap("offer_extend_attr_list_json")]
        [Validation(Required=true)]
        public List<string> OfferExtendAttrListJson { get; set; }

        // 界面归类配置 ListJson字符串
        [NameInMap("offer_common_buy_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferCommonBuyGroupListJson { get; set; }

        // 规格约束配置 ListJson字符串
        [NameInMap("offer_attr_constraints_list_fson")]
        [Validation(Required=true)]
        public List<string> OfferAttrConstraintsListFson { get; set; }

        // 售卖规则配置 ListJson字符串
        [NameInMap("offer_rule_group_list_json")]
        [Validation(Required=true)]
        public List<string> OfferRuleGroupListJson { get; set; }

    }

}
