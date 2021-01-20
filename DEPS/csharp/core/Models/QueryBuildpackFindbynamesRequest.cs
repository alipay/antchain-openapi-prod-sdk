// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpackFindbynamesRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // techstackNames
        [NameInMap("techstack_names")]
        [Validation(Required=false)]
        public List<string> TechstackNames { get; set; }

    }

}
