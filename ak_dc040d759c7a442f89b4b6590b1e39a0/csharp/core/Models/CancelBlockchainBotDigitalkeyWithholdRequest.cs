// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    public class CancelBlockchainBotDigitalkeyWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户传入外部交易订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

    }

}
