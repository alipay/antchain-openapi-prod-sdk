// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateMachinegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分组 ID
        [NameInMap("machine_group_id")]
        [Validation(Required=false)]
        public string MachineGroupId { get; set; }

        // 发布机器 ID
        [NameInMap("machine_ids")]
        [Validation(Required=false)]
        public List<string> MachineIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
