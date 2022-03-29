// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsLogreaderrorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // time
        [NameInMap("time")]
        [Validation(Required=true)]
        public long? Time { get; set; }

    }

}
