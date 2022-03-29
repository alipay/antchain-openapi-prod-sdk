// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // NavWorkspace
    public class NavWorkspace : TeaModel {
        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public WorkspaceDTO Workspace { get; set; }

    }

}
