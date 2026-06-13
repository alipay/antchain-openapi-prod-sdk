// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryOrderWithdrawResponse : TeaModel {
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

        // 支付交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 退分账明细
        [NameInMap("refund_detail_item_list")]
        [Validation(Required=false)]
        public SettleOrderRoyaltyDetail RefundDetailItemList { get; set; }

        // 交易退分账总金额，单位：分
        // 明细单金额总和
        [NameInMap("trade_refund_amount")]
        [Validation(Required=false)]
        public long? TradeRefundAmount { get; set; }

    }

}
