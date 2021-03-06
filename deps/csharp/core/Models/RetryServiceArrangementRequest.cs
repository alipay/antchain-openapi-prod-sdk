// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RetryServiceArrangementRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // arrangement_id
        [NameInMap("arrangement_id")]
        [Validation(Required=false)]
        public string ArrangementId { get; set; }

        // service_id
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
