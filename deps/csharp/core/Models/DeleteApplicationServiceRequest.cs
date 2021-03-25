// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteApplicationServiceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待删除的服务实例的应用名称
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 待删除服务实例名称
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // 待删除服务实例所在环境名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
