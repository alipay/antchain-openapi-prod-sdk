// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 套餐内商品结构
    public class ComboCommodity : TeaModel {
        // 商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
        [NameInMap("unique_code")]
        [Validation(Required=true)]
        public string UniqueCode { get; set; }

        // 商品主数据编码
        [NameInMap("inner_code")]
        [Validation(Required=true)]
        public string InnerCode { get; set; }

        // 商品类型，资源包：attach
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 付费方式，预付：PREPAY，按量付费：POSTPAY
        [NameInMap("charge_type")]
        [Validation(Required=true)]
        public string ChargeType { get; set; }

        // 销售属性列表
        [NameInMap("attrs")]
        [Validation(Required=true)]
        public List<CommodityAttribute> Attrs { get; set; }

        // 商品数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // 扩展信息，JSON结构，包含标签、个性化配置等数据
        [NameInMap("extends_config")]
        [Validation(Required=true)]
        public string ExtendsConfig { get; set; }

    }

}
