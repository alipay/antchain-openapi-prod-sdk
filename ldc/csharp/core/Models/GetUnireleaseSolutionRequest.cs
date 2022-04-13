// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetUnireleaseSolutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 解决方案发布ID
        [NameInMap("solution_id")]
        [Validation(Required=true)]
        public string SolutionId { get; set; }

    }

}
