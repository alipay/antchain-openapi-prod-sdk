// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class SyncComputerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // computer_id
        [NameInMap("computer_id")]
        [Validation(Required=true)]
        public string ComputerId { get; set; }

    }

}
