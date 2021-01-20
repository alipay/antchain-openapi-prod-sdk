// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetConfigGlobalRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要获取的全局参数 id
        [NameInMap("global_param_id")]
        [Validation(Required=false)]
        public string GlobalParamId { get; set; }

    }

}
