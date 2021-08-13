// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // T+1日销售数据汇总
    public class SalesByDay : TeaModel {
        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 版权方ID
        [NameInMap("seller_id")]
        [Validation(Required=true)]
        public string SellerId { get; set; }

        // 商家ID
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 版权方名称
        [NameInMap("seller_name")]
        [Validation(Required=true)]
        public string SellerName { get; set; }

        // 商家名称
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 日期
        [NameInMap("date")]
        [Validation(Required=true)]
        public string Date { get; set; }

        // 统计周期-开始时间
        [NameInMap("statistic_begin_period")]
        [Validation(Required=true)]
        public long? StatisticBeginPeriod { get; set; }

        // 统计周期-结束时间
        [NameInMap("statistic_end_period")]
        [Validation(Required=true)]
        public long? StatisticEndPeriod { get; set; }

        // 商品销售数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 商品总销售额
        [NameInMap("sales")]
        [Validation(Required=true)]
        public string Sales { get; set; }

        // 总回退销售额
        [NameInMap("refund_sales")]
        [Validation(Required=true)]
        public string RefundSales { get; set; }

        // 需支付给版权方的总费用
        [NameInMap("payment")]
        [Validation(Required=true)]
        public string Payment { get; set; }

    }

}
