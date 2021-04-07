// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class SetDatabaseAssignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_service_ids
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // app_ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

    }

}
