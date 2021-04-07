// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListUnifiedresourceInstancefamiliesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 提供商类型
        [NameInMap("provider_type")]
        [Validation(Required=true)]
        public string ProviderType { get; set; }

    }

}
