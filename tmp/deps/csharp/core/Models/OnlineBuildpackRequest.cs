// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class OnlineBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // buildpackId
        [NameInMap("id")]
        [Validation(Required=false)]
        public List<string> Id { get; set; }

    }

}
