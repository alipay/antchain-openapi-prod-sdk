// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAgoraxTradeRequest : TeaModel {
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

        // 商户订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 支付宝交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

    }

}
