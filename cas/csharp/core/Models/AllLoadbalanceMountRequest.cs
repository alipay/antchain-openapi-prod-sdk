// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AllLoadbalanceMountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // loadbalance_id
        [NameInMap("loadbalance_id")]
        [Validation(Required=true)]
        public string LoadbalanceId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
