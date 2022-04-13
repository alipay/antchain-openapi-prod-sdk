// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // node event
    public class NodeEvent : TeaModel {
        // event count
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // event message
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // event modified time
        [NameInMap("modified_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // event reason
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // event type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
