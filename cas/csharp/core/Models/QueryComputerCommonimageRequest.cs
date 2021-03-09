// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryComputerCommonimageRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // providerIds
        [NameInMap("provider_ids")]
        [Validation(Required=true)]
        public List<string> ProviderIds { get; set; }

        // regionIds
        [NameInMap("region_ids")]
        [Validation(Required=true)]
        public List<string> RegionIds { get; set; }

    }

}
