// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // QuotaKv
    public class QuotaKv : TeaModel {
        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // quota
        [NameInMap("quota")]
        [Validation(Required=true)]
        public long? Quota { get; set; }

    }

}
