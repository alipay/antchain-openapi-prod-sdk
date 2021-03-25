// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetApplicationBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 应用服务的名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 环境
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
