// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryOnetimeActivepayResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 支付单号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 订单串
        [NameInMap("order_str")]
        [Validation(Required=false)]
        public string OrderStr { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 分账状态
        [NameInMap("divide_status")]
        [Validation(Required=false)]
        public string DivideStatus { get; set; }

        // 支付金额
        [NameInMap("pay_amount")]
        [Validation(Required=false)]
        public long? PayAmount { get; set; }

        // 实际付款金额
        [NameInMap("real_pay_amount")]
        [Validation(Required=false)]
        public long? RealPayAmount { get; set; }

        // 实际收款金额
        [NameInMap("real_receipt_amount")]
        [Validation(Required=false)]
        public long? RealReceiptAmount { get; set; }

        // 支付时间
        [NameInMap("pay_time")]
        [Validation(Required=false)]
        public string PayTime { get; set; }

        // 支付单号
        [NameInMap("pay_order_no")]
        [Validation(Required=false)]
        public string PayOrderNo { get; set; }

        // 交易单号
        [NameInMap("pay_trade_no")]
        [Validation(Required=false)]
        public string PayTradeNo { get; set; }

    }

}
