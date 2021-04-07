// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AllLoadbalanceClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
