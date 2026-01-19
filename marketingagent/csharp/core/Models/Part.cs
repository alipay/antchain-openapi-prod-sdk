// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETINGAGENT.Models
{
    // Part represents a container for a section of communication content.
    public class Part : TeaModel {
        // the string content of the text part.
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // The structured data content.
        [NameInMap("data")]
        [Validation(Required=false)]
        public DataPart Data { get; set; }

    }

}
