// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码版权方信息
    public class IPCodeIpOwnerInfo : TeaModel {
        // 版权所有者名称
        [NameInMap("ip_owner_name")]
        [Validation(Required=false)]
        public string IpOwnerName { get; set; }

        // 版权方头像oss地址
        [NameInMap("ip_owner_image")]
        [Validation(Required=false)]
        public string IpOwnerImage { get; set; }

        // 版权方头像，临时访问地址，可直接访问
        [NameInMap("ip_owner_image_tmp")]
        [Validation(Required=false)]
        public string IpOwnerImageTmp { get; set; }

        // ip描述
        [NameInMap("ip_description")]
        [Validation(Required=false)]
        public string IpDescription { get; set; }

    }

}
