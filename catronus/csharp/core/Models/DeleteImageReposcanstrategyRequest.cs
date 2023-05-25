// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class DeleteImageReposcanstrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 策略ID
        [NameInMap("strategy_id")]
        [Validation(Required=true)]
        public string StrategyId { get; set; }

    }

}
