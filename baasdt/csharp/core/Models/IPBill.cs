// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权交易的账单信息
    public class IPBill : TeaModel {
        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 账单ID
        [NameInMap("ip_bill_id")]
        [Validation(Required=true)]
        public string IpBillId { get; set; }

        // 上传销售数据时的bizId
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 收款方
        [NameInMap("seller_id")]
        [Validation(Required=true)]
        public string SellerId { get; set; }

        // 付款方
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 账单状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 账单创建时间，时间戳（毫秒）
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 交易类型：0套餐交易，1定向授权
        [NameInMap("trade_type")]
        [Validation(Required=true)]
        public long? TradeType { get; set; }

        // 支付链接
        [NameInMap("pay_url")]
        [Validation(Required=true)]
        public string PayUrl { get; set; }

        // 账单金额，支付金额
        [NameInMap("bill_pay_amount")]
        [Validation(Required=true)]
        public string BillPayAmount { get; set; }

        // 销售金额
        [NameInMap("bill_sales")]
        [Validation(Required=true)]
        public string BillSales { get; set; }

        // 账单周期开始时间，时间戳（毫秒）
        [NameInMap("cycle_start_time")]
        [Validation(Required=true)]
        public long? CycleStartTime { get; set; }

        // 账单周期结束时间，时间戳（毫秒）
        [NameInMap("cycle_end_time")]
        [Validation(Required=true)]
        public long? CycleEndTime { get; set; }

        // 账单支付时间戳
        [NameInMap("pay_time")]
        [Validation(Required=false)]
        public long? PayTime { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

    }

}
