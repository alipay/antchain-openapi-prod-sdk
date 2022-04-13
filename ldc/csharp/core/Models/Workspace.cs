// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Workspace info
    // 
    public class Workspace : TeaModel {
        // workspace id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // workspace name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
