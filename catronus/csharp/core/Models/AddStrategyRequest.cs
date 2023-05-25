// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class AddStrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 策略id
        [NameInMap("strategy_id")]
        [Validation(Required=false)]
        public string StrategyId { get; set; }

        // 策略内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public Strategy Content { get; set; }

        // 绑定的集群id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public List<string> ClusterId { get; set; }

    }

}
