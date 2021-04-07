// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 交换机所属地域的identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 要查询的交换机所属VPC的ID
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // 要查询的交换机的ID
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

    }

}
