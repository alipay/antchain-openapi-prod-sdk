// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 主动支付单据
    public class ActivePayOrder : TeaModel {
        // 支付宝支付订单号，用于拉起主动支付页面
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=64)]
        public string TradeNo { get; set; }

        // 状态
        // INIT：交易创建
        // FAILED：付款失败
        // SUCCESS：付款成功
        [NameInMap("trade_status")]
        [Validation(Required=true, MaxLength=64)]
        public string TradeStatus { get; set; }

        // 状态原因码
        [NameInMap("status_reason_code")]
        [Validation(Required=false)]
        public string StatusReasonCode { get; set; }

        // 超时关闭
        [NameInMap("status_reason_msg")]
        [Validation(Required=false)]
        public string StatusReasonMsg { get; set; }

        // 本次交易支付的订单金额，单位为分
        // 付款成功或付款成功之后的状态必填
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public long? TotalAmount { get; set; }

        // 用户在交易中支付的金额，单位为分
        // 付款成功的状态必填
        [NameInMap("paid_amount")]
        [Validation(Required=false)]
        public long? PaidAmount { get; set; }

        // 商家在交易中实际收到的款项，单位为分
        // 付款成功的状态必填
        [NameInMap("receipt_amount")]
        [Validation(Required=false)]
        public long? ReceiptAmount { get; set; }

        // 交易支付时间
        // 付款成功的状态必填
        [NameInMap("gmt_pay")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtPay { get; set; }

        // 支付单据创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 多期合并支付明细
        [NameInMap("multi_pay_detail")]
        [Validation(Required=false)]
        public List<SingleTermDetail> MultiPayDetail { get; set; }

        // 多期支付的期数
        [NameInMap("multi_period_num")]
        [Validation(Required=false)]
        public long? MultiPeriodNum { get; set; }

    }

}
