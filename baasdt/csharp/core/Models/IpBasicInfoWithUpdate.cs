// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip 基础信息带上是否更新，只在渠道查询审批中用到
    public class IpBasicInfoWithUpdate : TeaModel {
        // 基础信息
        [NameInMap("ip_basic_info")]
        [Validation(Required=true)]
        public IpBasicInfo IpBasicInfo { get; set; }

        // 是否有更新
        [NameInMap("is_update")]
        [Validation(Required=true)]
        public bool? IsUpdate { get; set; }

    }

}
