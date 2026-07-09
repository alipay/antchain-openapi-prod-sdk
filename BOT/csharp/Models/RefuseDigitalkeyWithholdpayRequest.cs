// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class RefuseDigitalkeyWithholdpayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单支付时传入的商户订单号,不能和 trade_no同时为空。
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public long? RefundAmount { get; set; }

        // 标识一次退款请求，同一笔交易多次退款需要保证唯一。
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

    }

}
