// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // SaveSchema
    public class SaveSchema : TeaModel {
        // capacity
        [NameInMap("capacity")]
        [Validation(Required=true)]
        public long? Capacity { get; set; }

        // reserved
        [NameInMap("reserved")]
        [Validation(Required=true)]
        public string Reserved { get; set; }

        // max_key_size
        [NameInMap("max_key_size")]
        [Validation(Required=true)]
        public long? MaxKeySize { get; set; }

    }

}
