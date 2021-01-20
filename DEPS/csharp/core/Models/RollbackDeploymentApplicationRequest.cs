// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RollbackDeploymentApplicationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 被回滚的应用（服务）名称，必须是部署单中包含的应用（服务）
        [NameInMap("application_name")]
        [Validation(Required=false)]
        public string ApplicationName { get; set; }

        // 部署单id
        [NameInMap("operation_id")]
        [Validation(Required=false)]
        public string OperationId { get; set; }

        // 回滚原因。长度不超过100个UTF-8字符
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

    }

}
