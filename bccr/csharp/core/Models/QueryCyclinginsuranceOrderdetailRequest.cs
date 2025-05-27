// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryCyclinginsuranceOrderdetailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 请求方应用名
        [NameInMap("caller_app_name")]
        [Validation(Required=true)]
        public string CallerAppName { get; set; }

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

    }

}
