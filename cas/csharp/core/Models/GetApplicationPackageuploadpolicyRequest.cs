// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class GetApplicationPackageuploadpolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // version
        [NameInMap("app_version")]
        [Validation(Required=true)]
        public string AppVersion { get; set; }

    }

}
