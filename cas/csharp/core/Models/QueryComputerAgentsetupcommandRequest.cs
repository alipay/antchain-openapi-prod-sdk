// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryComputerAgentsetupcommandRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // computer serial numbers
        [NameInMap("sn")]
        [Validation(Required=true)]
        public List<string> Sn { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
