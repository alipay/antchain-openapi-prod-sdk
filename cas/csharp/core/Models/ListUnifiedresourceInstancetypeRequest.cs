// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListUnifiedresourceInstancetypeRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region name
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

    }

}
