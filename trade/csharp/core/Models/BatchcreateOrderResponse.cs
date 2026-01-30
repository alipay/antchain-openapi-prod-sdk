// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class BatchcreateOrderResponse : TeaModel {
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

        // 支付状态
        [NameInMap("pay_status")]
        [Validation(Required=false)]
        public string PayStatus { get; set; }

        // 批量下单列表返回
        [NameInMap("create_trade_order_results")]
        [Validation(Required=false)]
        public List<CreateTradeOrderResult> CreateTradeOrderResults { get; set; }

    }

}
