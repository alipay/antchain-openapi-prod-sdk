// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // api限流信息
    public class RateLimitDetail : TeaModel {
        // apiName
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // provider_id
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 已使用量
        [NameInMap("used")]
        [Validation(Required=false)]
        public long? Used { get; set; }

        // effectScope
        [NameInMap("effect_scope")]
        [Validation(Required=false)]
        public RateLimitEffectScopeDTO EffectScope { get; set; }

    }

}
