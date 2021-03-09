// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateSecuritygroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 安全域/组 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所在区域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // SECURITY_GROUP | SECURITY_ZONE
        // 默认为安全组
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
