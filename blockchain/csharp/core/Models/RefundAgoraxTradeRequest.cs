// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class RefundAgoraxTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户编号
        [NameInMap("external_id")]
        [Validation(Required=true)]
        public string ExternalId { get; set; }

        // 退款金额（元）
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 退款原因说明
        [NameInMap("refund_reason")]
        [Validation(Required=false)]
        public string RefundReason { get; set; }

        // 退款请求号，部分退款时必选
        [NameInMap("out_request_no")]
        [Validation(Required=false)]
        public string OutRequestNo { get; set; }

        // 退款包含的商品列表信息
        [NameInMap("refund_goods_detail")]
        [Validation(Required=false)]
        public List<RefundGoodsDetail> RefundGoodsDetail { get; set; }

    }

}
