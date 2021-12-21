// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商品交易模式
    public class IPTradeMode : TeaModel {
        // 交易类型，0：销售抽拥；1:按件付费
        [NameInMap("trade_type")]
        [Validation(Required=false)]
        public List<long?> TradeType { get; set; }

        // 佣金比例
        [NameInMap("commission_weight")]
        [Validation(Required=false)]
        public string CommissionWeight { get; set; }

        // 保底商品销售金额
        [NameInMap("guarantee_sale_number")]
        [Validation(Required=false)]
        public string GuaranteeSaleNumber { get; set; }

        // 单件单价
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 保底商品数量
        [NameInMap("guarantee_goods_number")]
        [Validation(Required=false)]
        public string GuaranteeGoodsNumber { get; set; }

    }

}
