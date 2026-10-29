// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryAcctPayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台的统一社会信用代码，小于32
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 签约单号
        // ● 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单id，长度小于50
        [NameInMap("acct_trade_order_id")]
        [Validation(Required=true)]
        public string AcctTradeOrderId { get; set; }

    }

}
