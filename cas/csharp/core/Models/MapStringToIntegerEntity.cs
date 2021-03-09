// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // map <String,integer>
    public class MapStringToIntegerEntity : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
