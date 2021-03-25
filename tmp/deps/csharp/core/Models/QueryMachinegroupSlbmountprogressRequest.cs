// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryMachinegroupSlbmountprogressRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分组ID
        [NameInMap("machine_group_id")]
        [Validation(Required=false)]
        public string MachineGroupId { get; set; }

        // 请求 ID 列表
        [NameInMap("request_ids")]
        [Validation(Required=false)]
        public List<string> RequestIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
