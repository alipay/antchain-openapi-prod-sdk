// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetApplicationServiceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待查询的应用名称。最大60个UTF-8字符
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 待查询服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
