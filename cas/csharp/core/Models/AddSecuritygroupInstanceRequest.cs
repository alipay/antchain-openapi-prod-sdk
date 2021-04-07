// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AddSecuritygroupInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 需向安全组中添加的实例 paas 序列号
        [NameInMap("instance_sequences")]
        [Validation(Required=true)]
        public List<string> InstanceSequences { get; set; }

        // 安全组 paas id
        [NameInMap("security_group_sequence")]
        [Validation(Required=true)]
        public string SecurityGroupSequence { get; set; }

    }

}
