// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class BatchqueryUmktRtMarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景营销策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 用户列表传输模版
        [NameInMap("query_template")]
        [Validation(Required=false)]
        public string QueryTemplate { get; set; }

        // 用户查询凭证列表
        [NameInMap("customer_keys")]
        [Validation(Required=true)]
        public List<string> CustomerKeys { get; set; }

    }

}
