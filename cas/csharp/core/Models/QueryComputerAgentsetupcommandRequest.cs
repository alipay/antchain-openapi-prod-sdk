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
        [Validation(Required=false)]
        public List<string> Sn { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // zone_iaas_id
        [NameInMap("zone_iaas_id")]
        [Validation(Required=false)]
        public string ZoneIaasId { get; set; }

    }

}
