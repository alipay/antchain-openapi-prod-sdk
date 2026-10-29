// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncAcctTradeorderbreachRequest : TeaModel {
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

        // 违约时间，格式 yyyy-MM-dd HH:mm:ss
        [NameInMap("breached_time")]
        [Validation(Required=true)]
        public string BreachedTime { get; set; }

        // 违约金额，单位分
        [NameInMap("breached_amount")]
        [Validation(Required=true)]
        public long? BreachedAmount { get; set; }

        // 违约描述，长度大于0小于等于64
        [NameInMap("breached_desc")]
        [Validation(Required=true)]
        public string BreachedDesc { get; set; }

    }

}
