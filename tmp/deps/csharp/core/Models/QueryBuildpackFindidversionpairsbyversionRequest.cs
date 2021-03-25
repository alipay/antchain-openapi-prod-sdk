// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpackFindidversionpairsbyversionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // techstackId
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

    }

}
