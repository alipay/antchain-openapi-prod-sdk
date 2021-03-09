// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // scope
    public class Scope : TeaModel {
        // cell identity
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // region identity
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // tenant name
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // workspace_group
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

        // zone identity
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // cluster identity
        [NameInMap("cluster")]
        [Validation(Required=false)]
        public string Cluster { get; set; }

    }

}
