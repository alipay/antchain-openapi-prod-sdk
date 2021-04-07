// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceImportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
