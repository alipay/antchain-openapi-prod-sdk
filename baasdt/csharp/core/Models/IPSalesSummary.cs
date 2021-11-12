// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP授权订单每次上传“已按照周期汇总的销售数据”的汇总信息
    public class IPSalesSummary : TeaModel {
        // 订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 销售数据ID
        [NameInMap("sales_biz_id")]
        [Validation(Required=true)]
        public string SalesBizId { get; set; }

        // 总销售量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 数量校正
        [NameInMap("correct_amount")]
        [Validation(Required=true)]
        public long? CorrectAmount { get; set; }

        // 实际总销售量
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

        // 总销售额
        [NameInMap("sales")]
        [Validation(Required=true)]
        public string Sales { get; set; }

        // 金额校正
        [NameInMap("correct_sales")]
        [Validation(Required=true)]
        public string CorrectSales { get; set; }

        // 实际总销售金额
        [NameInMap("total_sales")]
        [Validation(Required=true)]
        public string TotalSales { get; set; }

        // 最后操作时间
        [NameInMap("operator_time")]
        [Validation(Required=true)]
        public long? OperatorTime { get; set; }

        // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 销售数据最终是否需要生成支付账单
        [NameInMap("need_to_pay")]
        [Validation(Required=true)]
        public bool? NeedToPay { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 统计周期开始时间（毫秒时间戳）
        [NameInMap("settlement_begin_time")]
        [Validation(Required=true)]
        public long? SettlementBeginTime { get; set; }

        // 统计周期结束时间（毫秒时间戳）
        [NameInMap("settlement_end_time")]
        [Validation(Required=true)]
        public long? SettlementEndTime { get; set; }

    }

}
