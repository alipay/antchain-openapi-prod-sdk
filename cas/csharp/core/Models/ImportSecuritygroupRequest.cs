// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ImportSecuritygroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // sg-zm042uh9f8gb1lfcsng6 的 iaas 层 id
        [NameInMap("securitygroup_id")]
        [Validation(Required=true)]
        public string SecuritygroupId { get; set; }

        // securityGroup 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
