// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class SaveTenantconfigTokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // configKey对应值
        [NameInMap("entity_name")]
        [Validation(Required=true)]
        public string EntityName { get; set; }

        // token值
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
