// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class UpdateApiRatelimitRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // update_limit_list
        [NameInMap("update_limit_list")]
        [Validation(Required=true)]
        public List<UpdateRateLimit> UpdateLimitList { get; set; }

    }

}
