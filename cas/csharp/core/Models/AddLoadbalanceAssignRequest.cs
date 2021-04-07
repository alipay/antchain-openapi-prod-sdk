// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AddLoadbalanceAssignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // appServiceId
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=true)]
        public List<string> Ids { get; set; }

    }

}
