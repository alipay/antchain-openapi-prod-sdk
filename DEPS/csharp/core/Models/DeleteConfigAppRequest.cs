// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteConfigAppRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的应用参数 id
        [NameInMap("app_param_id")]
        [Validation(Required=false)]
        public string AppParamId { get; set; }

    }

}
