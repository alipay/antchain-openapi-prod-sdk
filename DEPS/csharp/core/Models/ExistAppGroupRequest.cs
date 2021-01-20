// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class ExistAppGroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用分组名称
        [NameInMap("appgroup_name")]
        [Validation(Required=false)]
        public string AppgroupName { get; set; }

    }

}
