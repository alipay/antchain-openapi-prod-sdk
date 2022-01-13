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

        // 销售抽拥设置类型，0批量设置，1，单独设置
        [NameInMap("commission_set_type")]
        [Validation(Required=false)]
        public string CommissionSetType { get; set; }

        // 佣金比例
        [NameInMap("commission_weight")]
        [Validation(Required=false)]
        public string CommissionWeight { get; set; }

        // 保底商品销售金额
        [NameInMap("guarantee_sale_number")]
        [Validation(Required=false)]
        public string GuaranteeSaleNumber { get; set; }

        // 销售抽佣单独设置信息
        [NameInMap("commission_separate_set_info")]
        [Validation(Required=false)]
        public List<IPCommissionSeparateSetInfo> CommissionSeparateSetInfo { get; set; }

        // 按件付费设置类型，0批量设置，1，单独设置
        [NameInMap("payt_set_type")]
        [Validation(Required=false)]
        public string PaytSetType { get; set; }

        // 单件单价
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 保底商品数量
        [NameInMap("guarantee_goods_number")]
        [Validation(Required=false)]
        public string GuaranteeGoodsNumber { get; set; }

        // 按件付费单独设置信息
        [NameInMap("payt_separate_set_info")]
        [Validation(Required=false)]
        public List<IPPaytSeparateSetInfo> PaytSeparateSetInfo { get; set; }

    }

}
