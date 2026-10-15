// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DATACOLLECTION.Models
{
    public class QueryTaskInstRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 触发的实例 id
        [NameInMap("inst_id")]
        [Validation(Required=true)]
        public string InstId { get; set; }

    }

}
