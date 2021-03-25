// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteAppRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的应用名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
