// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteResourceVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的交换机的地域identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 要删除的交换机所处专有网络的ID
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // 要删除的交换机的ID
        [NameInMap("v_switch_id")]
        [Validation(Required=true)]
        public string VSwitchId { get; set; }

    }

}
