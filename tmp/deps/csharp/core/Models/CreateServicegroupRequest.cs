// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreateServicegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // append
        [NameInMap("append")]
        [Validation(Required=false)]
        public bool? Append { get; set; }

        // service_group_id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
