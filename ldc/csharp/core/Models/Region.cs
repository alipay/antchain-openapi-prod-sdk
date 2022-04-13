// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Region info
    public class Region : TeaModel {
        // region id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // region name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // workspace list
        [NameInMap("workspaces")]
        [Validation(Required=false)]
        public List<Workspace> Workspaces { get; set; }

    }

}
