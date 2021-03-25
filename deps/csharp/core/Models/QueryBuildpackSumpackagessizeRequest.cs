// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpackSumpackagessizeRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // regionIds
        [NameInMap("region_ids")]
        [Validation(Required=false)]
        public List<string> RegionIds { get; set; }

    }

}
