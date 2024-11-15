// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // RateLimitEffectScopeValueDTO
    public class RateLimitEffectScopeValueDTO : TeaModel {
        // region
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // enabled
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // limit
        [NameInMap("limit")]
        [Validation(Required=true)]
        public long? Limit { get; set; }

        // timeDuration
        [NameInMap("time_duration")]
        [Validation(Required=true)]
        public string TimeDuration { get; set; }

    }

}
