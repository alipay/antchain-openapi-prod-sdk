// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAgoraxTradeResponse : TeaModel {
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

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 交易状态
        [NameInMap("trade_status")]
        [Validation(Required=false)]
        public string TradeStatus { get; set; }

        // 订单金额
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 买家支付宝用户唯一标识  
        [NameInMap("buyer_open_id")]
        [Validation(Required=false)]
        public string BuyerOpenId { get; set; }

        // 实收金额
        [NameInMap("receipt_amount")]
        [Validation(Required=false)]
        public string ReceiptAmount { get; set; }

    }

}
