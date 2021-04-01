// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的所有信息，加上更新的flag信息
    public class IpAllInfo : TeaModel {
        // ip的基础信息
        [NameInMap("ip_basic_info")]
        [Validation(Required=true)]
        public IpBasicInfo IpBasicInfo { get; set; }

        // ip的渠道信息带上sku信息
        [NameInMap("ip_channal_info")]
        [Validation(Required=true)]
        public List<IpChannelWithSku> IpChannalInfo { get; set; }

        // 是否有更新数据
        [NameInMap("is_update")]
        [Validation(Required=true)]
        public bool? IsUpdate { get; set; }

    }

}
