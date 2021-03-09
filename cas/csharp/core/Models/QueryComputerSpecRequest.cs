// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryComputerSpecRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // prviderIds
        [NameInMap("provider_ids")]
        [Validation(Required=true)]
        public List<string> ProviderIds { get; set; }

        // zoneIds
        [NameInMap("zone_ids")]
        [Validation(Required=true)]
        public List<string> ZoneIds { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
