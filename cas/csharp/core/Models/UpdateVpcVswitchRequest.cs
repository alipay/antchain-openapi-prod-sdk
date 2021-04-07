// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateVpcVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 修改会的 vswitch 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // vswitch id
        [NameInMap("vswitch_id")]
        [Validation(Required=true)]
        public string VswitchId { get; set; }

        // vpc paas id
        [NameInMap("vpc_sequence")]
        [Validation(Required=true)]
        public string VpcSequence { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
