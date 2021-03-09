// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ReleaseLoadbalanceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // loadbalance ids
        [NameInMap("loadbalance_sequences")]
        [Validation(Required=true)]
        public List<string> LoadbalanceSequences { get; set; }

    }

}
