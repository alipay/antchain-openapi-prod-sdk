// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateAppserviceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_service
        [NameInMap("app_service")]
        [Validation(Required=true)]
        public AppService AppService { get; set; }

        // 工作空间id，用于鉴权
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
