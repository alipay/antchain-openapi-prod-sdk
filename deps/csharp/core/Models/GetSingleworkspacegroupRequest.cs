// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetSingleworkspacegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 环境名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
