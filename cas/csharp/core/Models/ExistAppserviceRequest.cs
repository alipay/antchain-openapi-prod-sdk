// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ExistAppserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
