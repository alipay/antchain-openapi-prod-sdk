// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class BatchqueryOperatorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户id列表
        [NameInMap("operator_ids")]
        [Validation(Required=false)]
        public List<string> OperatorIds { get; set; }

    }

}
