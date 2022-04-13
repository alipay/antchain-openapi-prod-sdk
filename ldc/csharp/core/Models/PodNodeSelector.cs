// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // PodNodeSelector
    public class PodNodeSelector : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
