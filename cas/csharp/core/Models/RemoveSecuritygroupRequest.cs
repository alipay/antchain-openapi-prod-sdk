// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class RemoveSecuritygroupRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 安全组 id
        [NameInMap("security_group_sequence")]
        [Validation(Required=true)]
        public string SecurityGroupSequence { get; set; }

    }

}
