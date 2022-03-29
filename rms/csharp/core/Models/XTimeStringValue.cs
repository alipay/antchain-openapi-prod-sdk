// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // time and value
    public class XTimeStringValue : TeaModel {
        // unix timestamp (s)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // double string
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
