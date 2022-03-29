// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // FolderPaths
    public class FolderPaths : TeaModel {
        // paths
        [NameInMap("paths")]
        [Validation(Required=true)]
        public List<FolderPath> Paths { get; set; }

    }

}
