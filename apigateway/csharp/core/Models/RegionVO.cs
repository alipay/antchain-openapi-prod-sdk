// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // RegionVO
    public class RegionVO : TeaModel {
        // region_id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // region名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
