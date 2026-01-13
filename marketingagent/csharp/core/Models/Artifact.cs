// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETINGAGENT.Models
{
    // Artifacts represent task outputs.
    public class Artifact : TeaModel {
        // The content of the artifact. Must contain at least one part.
        [NameInMap("parts")]
        [Validation(Required=false)]
        public List<Part> Parts { get; set; }

    }

}
