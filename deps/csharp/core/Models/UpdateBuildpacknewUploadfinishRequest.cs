// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateBuildpacknewUploadfinishRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // buildpackId
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // buildpackRegionRelation
        [NameInMap("buildpack_region_relation")]
        [Validation(Required=false)]
        public BuildpackRegionRelation BuildpackRegionRelation { get; set; }

    }

}
