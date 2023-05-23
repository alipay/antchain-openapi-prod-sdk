// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a1f82644937c486c81a62b0e5a6b4fbe.Models
{
    // 能力与API关联信息
    public class AbilityApiRelation : TeaModel {
        // api名称
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // 能力列表
        [NameInMap("ability_info_list")]
        [Validation(Required=true)]
        public List<AbilityInfo> AbilityInfoList { get; set; }

    }

}
