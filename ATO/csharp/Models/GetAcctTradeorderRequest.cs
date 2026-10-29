// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class GetAcctTradeorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 签约单号，长度大于6小于50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 平台商统一社会信用代码，长度大于0小于等于32
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 交易订单号，长度大于6小于50
        [NameInMap("acct_trade_order_id")]
        [Validation(Required=true)]
        public string AcctTradeOrderId { get; set; }

    }

}
