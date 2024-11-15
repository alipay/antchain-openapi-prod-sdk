// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // RateLimitEffectScopeDTO
    public class RateLimitEffectScopeDTO : TeaModel {
        // RateLimitEffectScopeValueDTO list
        [NameInMap("values")]
        [Validation(Required=true)]
        public List<RateLimitEffectScopeValueDTO> Values { get; set; }

    }

}
