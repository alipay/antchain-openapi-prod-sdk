// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsUniversalwriteRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cmds
        [NameInMap("cmds")]
        [Validation(Required=false)]
        public List<UniversalBodyCmd> Cmds { get; set; }

        // rid
        [NameInMap("rid")]
        [Validation(Required=false)]
        public string Rid { get; set; }

    }

}
