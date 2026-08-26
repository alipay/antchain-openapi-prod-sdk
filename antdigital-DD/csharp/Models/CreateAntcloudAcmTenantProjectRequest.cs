// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class CreateAntcloudAcmTenantProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作者用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 项目描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
