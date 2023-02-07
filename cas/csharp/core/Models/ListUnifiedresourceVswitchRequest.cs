// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListUnifiedresourceVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region name
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

        // 最大50
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 以1为起点
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

    }

}
