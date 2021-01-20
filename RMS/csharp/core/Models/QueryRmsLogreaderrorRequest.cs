// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsLogreaderrorRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app
        [NameInMap("app")]
        [Validation(Required=false)]
        public string App { get; set; }

        // time
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

    }

}
