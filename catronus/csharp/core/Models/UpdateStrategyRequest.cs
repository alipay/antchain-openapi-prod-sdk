// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class UpdateStrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 策略id
        [NameInMap("strategy_id")]
        [Validation(Required=true)]
        public string StrategyId { get; set; }

        // 策略内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public Strategy Content { get; set; }

    }

}
