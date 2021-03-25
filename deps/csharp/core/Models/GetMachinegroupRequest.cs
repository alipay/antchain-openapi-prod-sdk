// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetMachinegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分组 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 是否带上机器信息，默认 false
        [NameInMap("with_machines")]
        [Validation(Required=false)]
        public bool? WithMachines { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
