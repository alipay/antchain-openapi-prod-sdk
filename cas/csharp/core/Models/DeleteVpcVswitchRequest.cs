// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteVpcVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // vpc id
        [NameInMap("vpc_sequence")]
        [Validation(Required=true)]
        public string VpcSequence { get; set; }

        // vswitch 的 iaasIds
        [NameInMap("vswitch_ids")]
        [Validation(Required=true)]
        public List<string> VswitchIds { get; set; }

    }

}
