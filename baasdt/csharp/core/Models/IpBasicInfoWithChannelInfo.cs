// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // ip的基础信息加上渠道信息
    public class IpBasicInfoWithChannelInfo : TeaModel {
        // ip的基础信息
        [NameInMap("ip_basic_info")]
        [Validation(Required=true)]
        public IpBasicInfo IpBasicInfo { get; set; }

        // ip的渠道信息和sku信息
        [NameInMap("ip_channal_infos")]
        [Validation(Required=true)]
        public List<IpChannelWithSku> IpChannalInfos { get; set; }

    }

}
