// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateVpcVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 网段
        [NameInMap("cidr_block")]
        [Validation(Required=true)]
        public string CidrBlock { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // switch 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // vpc paas id
        [NameInMap("vpc_sequence")]
        [Validation(Required=true)]
        public string VpcSequence { get; set; }

        // zone
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

    }

}
