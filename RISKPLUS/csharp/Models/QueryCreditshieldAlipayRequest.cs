// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryCreditshieldAlipayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // TRADE_QUERY 普通交易流水查询
        [NameInMap("query_code")]
        [Validation(Required=true)]
        public string QueryCode { get; set; }

        // 支付宝交易流水查询请求体
        [NameInMap("query_infos")]
        [Validation(Required=true)]
        public string QueryInfos { get; set; }

    }

}
